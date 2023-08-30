package ExercicioProposto;

public class Escola {
    // Atributos explicitos da escola
    String nome;
    String email;
    int numTelefone;
    String endereco;

    // Atributo impolicito da escola
    Estudante [] estudantes = new Estudante[310];

    // Métodos

    void addEstudante(Estudante e){
        // Percorrendo o array de estudantes
        for (int i = 0; i < estudantes.length; i++) {
            // Verificando se a posição i está vazia
            if(estudantes[i]==null){
                estudantes[i]=e; // Adicionando o estudante na posição i
                break; // Parando a execução
            }
        }

    }

    void mostrarInfos(){
        System.out.println("INFORMAÇÕES DA ESCOLA");
        System.out.println("Nome: "+nome);
        System.out.println("Email: "+email);
        System.out.println("Telefone: "+numTelefone);
        System.out.println("Endereço: "+endereco);

        // Percorrendo o array
        for (int i = 0; i < estudantes.length; i++) {
            // Verificando se a posição i está preenchida
            if(estudantes[i]!=null)
                estudantes[i].mostrarInfos(); // Mostrando as informações do estudante

        }
    }

    void qtdEstudantesPorAno(){
        // Contadores de quantidade de aluno por ano
        int alunosPrimeiro=0;
        int alunosSegundo=0;
        int alunosTerceiro=0;

        for (int i = 0; i < estudantes.length; i++) {
            // Verifica se a posição está preenchida
            if(estudantes[i]!=null) {
                // Lógica para contar a quantidade de alunos por ano
                if (estudantes[i].anoLetivo.equalsIgnoreCase("Primeiro"))
                    alunosPrimeiro++;
                else if (estudantes[i].anoLetivo.equalsIgnoreCase("Segundo"))
                    alunosSegundo++;
                else
                    alunosTerceiro++;
            }
        }

        System.out.println("ALUNOS POR ANO");
        System.out.println("1º : "+alunosPrimeiro+" alunos");
        System.out.println("2º : "+alunosSegundo+" alunos");
        System.out.println("3º : "+alunosTerceiro+" alunos");
    }
}
