

public class main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        CSVReader reader = new CSVReader();
        reader.read(biblioteca);
        long startTime = System.currentTimeMillis();
        System.out.println(biblioteca.buscarPorGenero("fotografía"));

        long endTime = System.currentTimeMillis() - startTime;

        System.out.println("Tiempo de ejecucion = " + Long.toString(endTime));
    }

}
