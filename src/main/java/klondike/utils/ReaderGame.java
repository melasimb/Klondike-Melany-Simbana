package klondike.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderGame implements Reader {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
            System.in));
    public String read () throws IOException {
        return this.bufferedReader.readLine();
    }
}
