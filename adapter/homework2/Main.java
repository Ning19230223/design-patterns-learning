package adapter.homework2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("adapter/homework2/file.txt");
            f.setValue("year", "2025");
            f.setValue("month", "8");
            f.setValue("day", "4");
            f.writeToFile("adapter/homework2/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
