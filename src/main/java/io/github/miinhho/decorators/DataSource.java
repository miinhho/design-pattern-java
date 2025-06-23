package io.github.miinhho.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
