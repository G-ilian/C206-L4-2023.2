public class Funcionario {
    // Atributos da classe
    private static int cont=0;
    // Atributos do objeto
    private int id; // Id do funcionário
    public String nome; // Nome do funcionário
    private String cpf; // CPF do funcionário

    public Funcionario(String nome) {
        // Incrementar o contador
        cont++;

        // Atribui o valor ao id
        id = cont;

        // Atribuindo o valor ao nome
        this.nome = nome;

    }

    // Método para mostrar infos
    public void mostrarInfos(){
        System.out.println("Nome: "+this.nome);
        System.out.println("ID: "+this.id);
        System.out.println("CPF: "+this.cpf);
    }

    // Encapsulamento - Modificadores de acesso

    public static int getCont() {
        if(cont>3){
            System.out.println("A empresa está evoluindo");
        }
        return cont;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    

}
