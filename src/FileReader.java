import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader
{
    AminoAcids aminokwasy = new AminoAcids();

    public void fileChooser()
    {
        String path = "";

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = jfc.getSelectedFile();
            path = selectedFile.getAbsolutePath();
        }

        String input1 = "";
        String input2 = "";

        try
        {
            List<String> list = Files.readAllLines(Paths.get(path));

            for (int i = 0; i <list.size() ; i++)
            {
                if(i%2==0)
                {

                    input1 = list.get(i);
                    //System.out.println(input1);
                }
                else
                {
                    input2 = list.get(i);
                  //  System.out.println(input2);
                    aminokwasy.changePossible(input1, input2);
                }

            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}