package io.github.miinhho.memento.shapes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class BaseShape implements Shape {
    int x, y;
    private int dx = 0, dy = 0;
    private Color color;
    private boolean selected = false;

    BaseShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public void drag() {
        dx = x;
        dy = y;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = dx + x;
        this.y = dy + y;
    }

    @Override
    public void moveBy(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void drop() {
        this.x = dx;
        this.y = dy;
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        return x > getX() && x < (getX() + getWidth()) &&
                y > getY() && y < (getY() + getHeight());
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void select() {
        selected = true;
    }

    @Override
    public void unSelect() {
        selected = false;
    }

    @Override
    public boolean isSelected() {
        return selected;
    }

    void enableSelectionStyle(Graphics graphics) {
        graphics.setColor(Color.LIGHT_GRAY);

        var graphics2d = (Graphics2D) graphics;
        float[] dash = { 2.0f };
        graphics2d.setStroke(new BasicStroke(1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                2.0f, dash, 0.0f));
    }

    void disableSelectionStyle(Graphics graphics) {
        graphics.setColor(color);
        var graphics2d = (Graphics2D) graphics;
        graphics2d.setStroke(new BasicStroke());
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
        } else {
            disableSelectionStyle(graphics);
        }
    }
}
