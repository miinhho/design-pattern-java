package io.github.miinhho.abstract_factory;

import io.github.miinhho.abstract_factory.factories.GUIFactory;
import io.github.miinhho.abstract_factory.factories.MacOSFactory;
import io.github.miinhho.abstract_factory.factories.WindowsFactory;

public class Demo {
    private static App configureApp() {
        App app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new App(factory);
        return app;
    }

    public static void main(String[] args) {
        App app = configureApp();
        app.paint();
    }
}
