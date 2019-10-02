package klondike.utils;

public class WriterGame<T> implements  Writer<T>{
    public void writeln (T text){
        System.out.println(text);
    }

    public void write (T text){
        System.out.print(text);
    }

    @Override
    public void flush() {
        System.out.flush();
    }
}