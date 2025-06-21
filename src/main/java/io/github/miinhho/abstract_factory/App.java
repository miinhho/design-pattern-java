package io.github.miinhho.abstract_factory;

import io.github.miinhho.abstract_factory.checkboxes.Checkbox;
import io.github.miinhho.abstract_factory.factories.GUIFactory;

public class App {
    private final Button button;
    private final Checkbox checkbox;

    public App(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
