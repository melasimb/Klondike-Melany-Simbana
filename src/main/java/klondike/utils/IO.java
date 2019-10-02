package klondike.utils;

public class IO {

    private static ReaderGame readerGame = new ReaderGame();
    private static WriterGame writerGame = new WriterGame();

    public static String readString(String title) {
        String input = null;
        boolean ok = false;
        do {
            write(title);
            try {
                //input = bufferedReader.readLine();
                input = readerGame.read();
                ok = true;
            } catch (Exception ex) {
                writeFormatError("de cadena de caracteres");
            }
        } while (!ok);
        return input;
    }

    public static int readInt(String title) {
        int input = 0;
        boolean ok = false;
        do {
            try {
                input = Integer.parseInt(readString(title));
                ok = true;
            } catch (Exception ex) {
                writeFormatError("integer");
            }
        } while (!ok);
        return input;
    }

    public static int readInt(String title, ClosedInterval closedInterval) {
        int input = 0;
        boolean ok = false;
        do {
            try {
                input = Integer.parseInt(readString(title));
                ok = closedInterval.includes(input);
            } catch (Exception ex) {
                writeFormatError("integer");
            }
        } while (!ok);
        return input;
    }

    public static char readChar(String title) {
        char charValue = ' ';
        boolean ok = false;
        do {
            String input = readString(title);
            if (input.length() != 1) {
                writeFormatError("caracter");
            } else {
                charValue = input.charAt(0);
                ok = true;
            }
        } while (!ok);
        return charValue;
    }

    public static char readChar(String title, char[] options) {
        char charValue = ' ';
        boolean ok = false;
        do {
            String input = readString(title);
            if (input.length() != 1) {
                writeFormatError("caracter");
            } else {
                charValue = input.charAt(0);
                ok = (new String(options).indexOf(charValue) != -1);
            }
        } while (!ok);
        return charValue;
    }

    public static void writeln() {
        writerGame.writeln("");
    }

    public static void writetab() {
        writerGame.write('\t');
    }

    public static void write(String string) {
        writerGame.write(string);
    }

    public static void writeln(String string) {
        writerGame.writeln(string);
    }

    public static void writeError(String title, String msg) {
        writeln("!!!! " + title.toUpperCase() + ": " + msg);
        writeln();
    }

    private static void writeFormatError(String formato) {
        writerGame.writeln("ERROR DE FORMATO! "
                + "Introduzca un valor con formato " + formato + ".");
    }

    public static void clear() {
        writerGame.write("\033[H\033[2J");
        writerGame.flush();
    }
}
