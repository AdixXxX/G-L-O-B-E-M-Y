import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Aminokwasy aminokwasy = new Aminokwasy();
        aminokwasy.changePossible("QABCDE", "EDCBAQ");
        FileReader fileReader = new FileReader();

        fileReader.fileReaderAndChooser();

    }


}
