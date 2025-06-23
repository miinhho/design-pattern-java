package io.github.miinhho.composite;

import java.awt.Color;

import io.github.miinhho.composite.editor.ImageEditor;
import io.github.miinhho.composite.shape.Circle;
import io.github.miinhho.composite.shape.CompoundShape;
import io.github.miinhho.composite.shape.Dot;
import io.github.miinhho.composite.shape.Rectangle;

public class Demo {
    public static void main(String[] args) {
        var editor = new ImageEditor();
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
