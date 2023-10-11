public class Aluno implements Comparable<Aluno>{
    // Atributos do aluno
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Aluno alunoComparado) {
        // return Integer.compare(alunoComparado.idade,this.idade);
        return this.nome.compareTo(alunoComparado.getNome()); // Comparando pelo nome
    }
}
