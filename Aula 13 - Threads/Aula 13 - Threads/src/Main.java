// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Interface

        // Instanciando Threads Contadores
        ThreadsContadoras tc1 = new ThreadsContadoras("Thread 1");
        ThreadsContadoras tc2 = new ThreadsContadoras("Thread 2");
        ThreadsContadoras tc3 = new ThreadsContadoras("Thread 3");

        // Instanciando objetos de Thread
        Thread t1 = new Thread(tc1);
        Thread t2 = new Thread(tc2);
        Thread t3 = new Thread(tc3);

        // Executando as threads
        t1.start();
        t2.start();
        t3.start();

        // Herança
        /*
        // Criando Threads
        // Herança
        ThreadsContadoras tc1 = new ThreadsContadoras("Thread 1");
        ThreadsContadoras tc2 = new ThreadsContadoras("Thread 2");

        // Executando as threads
        tc1.start();
        tc2.start();

         */
    }
}