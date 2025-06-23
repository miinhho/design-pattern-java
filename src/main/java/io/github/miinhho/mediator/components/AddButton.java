package io.github.miinhho.mediator.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import io.github.miinhho.mediator.mediator.Mediator;
import io.github.miinhho.mediator.mediator.Note;

public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
