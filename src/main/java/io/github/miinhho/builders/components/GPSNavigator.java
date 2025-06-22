package io.github.miinhho.builders.components;

public class GPSNavigator {
    private final String route;

    public GPSNavigator() {
        this.route = "221B, Baker Street, London to Scotland Yard, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
