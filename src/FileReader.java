import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static sun.misc.MessageUtils.err;

public class FileReader
{
    public void fileReaderAndChooser() throws IOException
    {
        String path;
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = jfc.getSelectedFile();
            path = selectedFile.getAbsolutePath();

            DataInputStream inputStream = null;

            try {
                try (Stream<String> stream = Files.lines(Paths.get(path)))
                {
                    stream.forEach(System.out::println);
                }

            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            finally
            {
                if (inputStream != null)
                {
                    inputStream.close();
                }
            }
        }
    }
}