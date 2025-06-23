package io.github.miinhho.decorators;

public abstract class DataSourceDecorator implements DataSource {
    private DataSource wrapped;

    DataSourceDecorator(DataSource dataSource) {
        this.wrapped = dataSource;
    }

    @Override
    public void writeData(String data) {
        wrapped.writeData(data);
    }

    @Override
    public String readData() {
        return wrapped.readData();
    }
}
