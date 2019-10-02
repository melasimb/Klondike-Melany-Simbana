package klondike.utils;

public interface Writer<T> {
    public void write(T text);
    public void writeln(T text);
    public void flush();
}
