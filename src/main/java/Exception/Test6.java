package Exception;

import java.io.*;

//Example of throws...
// throws tell the caller to manage the exception...
public class Test6 {

    static void readFile() throws IOException {
        FileReader fr = new FileReader("data.txt");
    }
     static void main() {
         try {
             readFile();
         } catch (IOException e) {
             System.out.println("File not found");
         }
        }
    }
