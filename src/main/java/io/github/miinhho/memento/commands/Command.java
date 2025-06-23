package io.github.miinhho.memento.commands;

public interface Command {
    String getName();

    void execute();
}
