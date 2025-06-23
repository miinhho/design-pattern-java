package io.github.miinhho.chain_of_responsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import io.github.miinhho.chain_of_responsibility.middleware.Middleware;
import io.github.miinhho.chain_of_responsibility.middleware.RoleCheckMiddleware;
import io.github.miinhho.chain_of_responsibility.middleware.ThrottlingMiddleware;
import io.github.miinhho.chain_of_responsibility.middleware.UserExistsMiddleware;
import io.github.miinhho.chain_of_responsibility.server.Server;

public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        var middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server), new RoleCheckMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Input password: ");
            String password = reader.readLine();
            success = server.login(email, password);
        } while (!success);
    }
}
