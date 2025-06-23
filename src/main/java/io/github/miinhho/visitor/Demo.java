package io.github.miinhho.visitor;

import io.github.miinhho.visitor.shapes.Circle;
import io.github.miinhho.visitor.shapes.CompoundShape;
import io.github.miinhho.visitor.shapes.Dot;
import io.github.miinhho.visitor.shapes.Rectangle;
import io.github.miinhho.visitor.shapes.Shape;
import io.github.miinhho.visitor.visitor.XMLExportVisitor;

public class Demo {
    public static void main(String[] args) {
        var dot = new Dot(1, 10, 55);
        var circle = new Circle(2, 23, 15, 10);
        var rectangle = new Rectangle(3, 10, 17, 20, 30);

        var compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        var c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        export(circle, compoundShape);
    }

    private static void export(Shape... shapes) {
        var exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(shapes));
    }
}
