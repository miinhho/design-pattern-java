package io.github.miinhho.abstract_factory.factories;

import io.github.miinhho.abstract_factory.Button;
import io.github.miinhho.abstract_factory.MacOSButton;
import io.github.miinhho.abstract_factory.checkboxes.Checkbox;
import io.github.miinhho.abstract_factory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
