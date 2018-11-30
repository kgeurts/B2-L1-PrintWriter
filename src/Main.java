import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

    public static  void main(String[] args){
    String fileName = "out.txt"; // Maakt de file.
        try { // Dit zorgt ervoor dat je je een statement kan uitvoeren die een excention kunnen veroorzaken.
            PrintWriter outputStream = new PrintWriter(fileName); // Deze lijn zorgt ervoor dat er buiten de Java geschreven kan worden. En dus naar de .TXT file.
            outputStream.println("Hier is een tekstje!"); // Slaat deze lijn op in je RAM
            outputStream.close(); // Sluit de string en stuurt hem naar de TXT file.
            System.out.println("Verstuurd!"); // Bevestigd dat de lijn verstuurd is!


        } catch (FileNotFoundException e) { // Met deze code fixt hij het niet kunnen handelen van de code.
            e.printStackTrace();
        }
    }
}
