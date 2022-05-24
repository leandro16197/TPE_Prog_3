package TPE_programacion_3;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        CSVReader reader=new CSVReader();
        Biblioteca biblioteca=new Biblioteca();

        reader.read(biblioteca);

        System.out.println(biblioteca.buscarPorGenero("religión"));
    }

}
