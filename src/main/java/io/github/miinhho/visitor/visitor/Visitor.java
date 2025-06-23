package io.github.miinhho.visitor.visitor;

import io.github.miinhho.visitor.shapes.Circle;
import io.github.miinhho.visitor.shapes.CompoundShape;
import io.github.miinhho.visitor.shapes.Dot;
import io.github.miinhho.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape compoundShape);
}
