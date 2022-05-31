import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        CSVWritter writer = new CSVWritter();
        CSVReader reader = new CSVReader();
        reader.read(biblioteca);
        long startTime = System.currentTimeMillis();
        ArrayList aux = biblioteca.buscarPorGenero("investigación");
        writer.write(aux);
        long endTime = System.currentTimeMillis() - startTime;

        System.out.println("Tiempo de ejecucion = " + Long.toString(endTime));
    }

}
