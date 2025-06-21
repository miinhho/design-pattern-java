package io.github.miinhho.abstract_factory.factories;

import io.github.miinhho.abstract_factory.Button;
import io.github.miinhho.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
