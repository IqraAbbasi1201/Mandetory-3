import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


// Ex3 mandetory inheritance files
// Write a program that reads a file with n number of strings
// separated by linebreaks.
// The program determines and prints how many words are in the file.

public class ExerciseThree {
    public static void main(String[] args) throws IOException {
        //Arraylist
        // Paths.get = Converts a path string, or a sequence of strings that when joined form a path string, to a Path.
        ArrayList<String> listOfWords = new ArrayList<String>(Files.readAllLines(Paths.get("/Users/iqraabbasi/IdeaProjects/madetory4/src/Food")));
        int numberOfWords = listOfWords.size ();
        System.out.println("This wordlist countains " + numberOfWords + " words in the File");


    }
}
