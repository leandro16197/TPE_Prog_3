

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CSVWritter {
    BufferedWriter bw = null;

    public void write(ArrayList aux){
        try {
            File file = new File("C:\\Users\\Nahue\\eclipse-workspace\\TPE\\src\\libros\\salida.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write("Salida:");
            bw.newLine();
            for(Object line:aux){
                    bw.write(line.toString());
                    bw.newLine();
            }




        } catch (IOException ioe) {
            ioe.printStackTrace();

        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }


        }
    }

