package io.github.miinhho.state;

import io.github.miinhho.state.ui.Player;
import io.github.miinhho.state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        var player = new Player();
        var ui = new UI(player);
        ui.init();
    }
}
