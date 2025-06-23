package io.github.miinhho.observer.editor;

import java.io.File;

import io.github.miinhho.observer.publisher.EventManager;

public class Editor {
    public EventManager eventManager;
    private File file;

    public Editor() {
        this.eventManager = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        eventManager.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            eventManager.notify("save", file);
        } else {
            throw new Exception("Please open a file first");
        }
    }
}
