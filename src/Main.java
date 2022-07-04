import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        char sybmol = 'g';
        int count = 0;
        FileReader reader = new FileReader("C:\\Users\\Grish\\IdeaProjects\\FileReader\\src\\MyFile.txt");
        Scanner scanner = new Scanner(reader);
        String Line = null;
        do {
            Line = Line + scanner.nextLine();
        }while(scanner.hasNextLine());
        char[] line;
        line = Line.toCharArray();
        for (char c : line) {
            if(c==sybmol){
                count++;
            }
        }
        for(int i = 0;i<=count;i++){
            System.out.println(sybmol);
        }
        reader.close();
    }
}