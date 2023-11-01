/* Herança
public class ThreadsContadoras extends Thread{
    // Atributos da thread
    private String nome;

    // Construtor
    public ThreadsContadoras(String nome){
        this.nome = nome;
    }

    @Override
    public void run() {
        // Thread que executa de 1 a 10

        for (int i = 0; i < 10; i++) {
            System.out.println("Nome da thread "+nome);
            System.out.println(i);
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println("Exception ");
            }
        }

    }
}
*/

public class ThreadsContadoras implements Runnable{
    // Atributos da thread
    private String nome;

    // Construtor
    public ThreadsContadoras(String nome){
        this.nome = nome;
    }

    @Override
    public void run() {
        // Thread que executa de 1 a 10

        for (int i = 0; i < 10; i++) {
            System.out.println("Nome da thread "+nome);
            System.out.println(i);
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println("Exception ");
            }
        }

    }
}