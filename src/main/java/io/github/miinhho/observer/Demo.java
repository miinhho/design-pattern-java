package io.github.miinhho.observer;

import io.github.miinhho.observer.editor.Editor;
import io.github.miinhho.observer.listeners.EmailNotificationListener;
import io.github.miinhho.observer.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        var editor = new Editor();
        editor.eventManager.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.eventManager.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
