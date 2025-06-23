package io.github.miinhho.template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import io.github.miinhho.template_method.networks.Facebook;
import io.github.miinhho.template_method.networks.Network;
import io.github.miinhho.template_method.networks.Twitter;

public class Demo {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input user name: ");
        String username = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        Network network = switch (choice) {
            case 1 -> new Facebook(username, password);
            case 2 -> new Twitter(username, password);
            default -> null;
        };
        network.post(message);
    }
}
