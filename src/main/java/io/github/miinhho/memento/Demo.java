package io.github.miinhho.memento;

import java.awt.Color;

import io.github.miinhho.memento.editor.Editor;
import io.github.miinhho.memento.shapes.Circle;
import io.github.miinhho.memento.shapes.CompoundShape;
import io.github.miinhho.memento.shapes.Dot;
import io.github.miinhho.memento.shapes.Rectangle;

public class Demo {
    public static void main(String[] args) {
        var editor = new Editor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),
                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)),
                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)));
    }
}
