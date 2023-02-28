import java.util.ArrayList;
import java.io.*;

class Journal {
    private ArrayList<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        count++;
        entries.add(count + ": " + text);;
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);  // print ArrayList to each line
    }
    
    public void saveToFile (String filename, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(toString()); //write in text file
            }
        }
    }
}

// About Save to File
class Persistence {

    public void saveToFile (Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        if (overwrite || new File(filename).exists()) {
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString()); //write in text file
            }
        }
    }
    // save PDF or more
}
public class SOLID_S {

    public static void main(String[] args) throws FileNotFoundException {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I drink with friend");
        System.out.println(j);

        Persistence p = new Persistence();
        p.saveToFile(j, "journal.txt", true);
    }
}

