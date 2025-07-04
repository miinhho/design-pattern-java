package io.github.miinhho.mediator.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import io.github.miinhho.mediator.mediator.Mediator;

public class DeleteButton extends JButton implements Component {
    private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}
