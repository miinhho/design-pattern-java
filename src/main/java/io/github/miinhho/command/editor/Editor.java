package io.github.miinhho.command.editor;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

import io.github.miinhho.command.commands.Command;
import io.github.miinhho.command.commands.CommandHistory;
import io.github.miinhho.command.commands.CopyCommand;
import io.github.miinhho.command.commands.CutCommand;
import io.github.miinhho.command.commands.PasteCommand;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();

    public void init() {
        var frame = new JFrame("Text editor (type & use buttons, Luke!)");
        var content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        var buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        var ctrlC = new JButton("Ctrl+C");
        var ctrlX = new JButton("Ctrl+X");
        var ctrlV = new JButton("Ctrl+V");
        var ctrlZ = new JButton("Ctrl+Z");
        var editor = this;
        ctrlC.addActionListener(e -> {
            executeCommand(new CopyCommand(editor));
        });
        ctrlX.addActionListener(e -> {
            executeCommand(new CutCommand(editor));
        });
        ctrlV.addActionListener(e -> {
            executeCommand(new PasteCommand(editor));
        });
        ctrlZ.addActionListener(e -> {
            undo();
        });
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    private void undo() {
        if (history.isEmpty()) {
            return;
        }

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
