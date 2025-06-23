package io.github.miinhho.mediator.components;

import io.github.miinhho.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);

    String getName();
}
