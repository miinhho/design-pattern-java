package io.github.miinhho.template_method.networks;

public abstract class Network {
    String username;
    String password;

    Network() {
    }

    public boolean post(String message) {
        if (login(this.username, this.password)) {
            boolean result = sendData(message.getBytes());
            logout();
            return result;
        }
        return false;
    }

    abstract boolean login(String username, String password);

    abstract boolean sendData(byte[] data);

    abstract void logout();
}
