import br.inatel.predio06.aulaHeranca.Arquiteto;
import br.inatel.predio06.aulaHeranca.Engenheiro;
import br.inatel.predio06.aulaHeranca.Funcionario;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Criando os objetos - Normalmente
        Engenheiro eng = new Engenheiro("Gabriel","000",22,100,"Computação");
        Arquiteto arq = new Arquiteto("Ramon","123",21,200,"Design de Interiore");

        // Criando os objetos - Upcasting
        //Funcionario eng = new Engenheiro("Gabriel","000",22,100,"Computação");
        //Funcionario arq = new Arquiteto("Ramon","123",21,200,"Design de Interiore");

        //arq.tirarFerias();
        //eng.tirarFerias();
        //arq.setEspecialidade("Design");
        //double salarioArq = arq.calcularSalarioAnual();
        //System.out.println("Salário anual "+salarioArq);



        //eng.mostrarInfos();
        //arq.mostrarInfos();

        // Criando um array de referência para Funcionários
        Funcionario [] funcionarios = new Funcionario [5];
        funcionarios[0]= eng;
        funcionarios[1] = arq;

        // Fazendo a leitura das informações

        for (int i = 0; i < funcionarios.length; i++) {
            if(funcionarios[i]!=null){
                if(funcionarios[i] instanceof Engenheiro){
                    Engenheiro auxEngenheiro = (Engenheiro) funcionarios[i];
                    auxEngenheiro.mostrarInfos();
                    auxEngenheiro.tirarFerias();
                    auxEngenheiro.calcularSalarioAnual();
                    auxEngenheiro.executaAcao();
                    auxEngenheiro.gerenciarProjetos();
                }else{
                    Arquiteto auxArquiteto = (Arquiteto) funcionarios[i];
                    auxArquiteto.calcularSalarioAnual();
                    auxArquiteto.mostrarInfos();
                    auxArquiteto.executaAcao();
                    auxArquiteto.desenhouDesign();

                }
            }
        }

    }
}