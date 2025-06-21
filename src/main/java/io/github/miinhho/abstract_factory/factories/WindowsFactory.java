package io.github.miinhho.abstract_factory.factories;

import io.github.miinhho.abstract_factory.Button;
import io.github.miinhho.abstract_factory.WindowsButton;
import io.github.miinhho.abstract_factory.checkboxes.Checkbox;
import io.github.miinhho.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
