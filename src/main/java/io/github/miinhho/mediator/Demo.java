package io.github.miinhho.mediator;

import javax.swing.DefaultListModel;

import io.github.miinhho.mediator.components.AddButton;
import io.github.miinhho.mediator.components.DeleteButton;
import io.github.miinhho.mediator.components.Filter;
import io.github.miinhho.mediator.components.List;
import io.github.miinhho.mediator.components.SaveButton;
import io.github.miinhho.mediator.components.TextBox;
import io.github.miinhho.mediator.components.Title;
import io.github.miinhho.mediator.mediator.Editor;
import io.github.miinhho.mediator.mediator.Mediator;

public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel<>()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}