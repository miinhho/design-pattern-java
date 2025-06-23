package io.github.miinhho.visitor.shapes;

import io.github.miinhho.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
