import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File newFile = new File("C:\\Users\\ADMIN\\Desktop\\JAVA\\File.txt");
        // newFile.createNewFile();

        // FileWriter fileWriter = new FileWriter("C:\\Users\\ADMIN\\Desktop\\JAVA\\File.txt");
        // fileWriter.write("Hello");
        // fileWriter.append("BBBBBBBBBBB");
        // fileWriter.close();
        
        Scanner myReader = new Scanner(newFile);
        while(myReader.hasNextLine()){
            System.out.println(myReader.nextLine());
        }
    }
}
