package lesson24.practice.Exceptions.src;

public class Res implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("auto closeable");
    }
}
