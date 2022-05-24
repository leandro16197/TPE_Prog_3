package TPE_programacion_3;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
    String path="src\\TPE_programacion_3\\libros\\dataset1.csv";

    public void read(Biblioteca biblioteca) {
        ArrayList<String[]> lines = this.readContent();
        for(int i=0;i<lines.size();i++){
        String [] informacion=lines.get(i)[0].split(",");
        Libro libro=new Libro(informacion[0],informacion[1],informacion[2]);
        String []aux=informacion[3].split(" ");
            for(int j=0;j<aux.length;j++){
                libro.addGeneros(aux[j]);
            }
            biblioteca.addLibros(libro);
        }
    }

    private ArrayList<String[]> readContent() {
        ArrayList<String[]> lines = new ArrayList<String[]>();

        File file = new File(this.path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                lines.add(line.split(";"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (bufferedReader != null)
                try {
                    bufferedReader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
        }

        return lines;
    }

}