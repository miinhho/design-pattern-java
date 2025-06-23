package io.github.miinhho.visitor.shapes;

import java.util.ArrayList;
import java.util.List;

import io.github.miinhho.visitor.visitor.Visitor;

public class CompoundShape implements Shape {
    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        // move...
    }

    @Override
    public void draw() {
        // draw...
    }

    public int getId() {
        return id;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }
}
