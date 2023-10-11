import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /*
        // 1. Collection - Hash Map
        HashMap<String,Integer> colecaoIdadesAlunos = new HashMap<>(); // Criando um hashMap

        // Adicionando na coleção
        colecaoIdadesAlunos.put("Gabriel",22);
        colecaoIdadesAlunos.put("Igor",18);
        colecaoIdadesAlunos.put("Ramon",13);
        colecaoIdadesAlunos.put("Caio",17);

        // Imprimindo valores

        // Forma 1
        System.out.println("Antes da remoção");
        System.out.println(colecaoIdadesAlunos);
        // Forma 2
        colecaoIdadesAlunos.forEach((key,value)->{
            System.out.println("Chave "+key);
            System.out.println("Valor "+value);
        });

        // Removendo os itens
        colecaoIdadesAlunos.remove("Gabriel");

        // Forma 1
        System.out.println("Depois da remoção");
        System.out.println(colecaoIdadesAlunos);
        // Forma 2
        colecaoIdadesAlunos.forEach((key,value)->{
            System.out.println("Chave "+key);
            System.out.println("Valor "+value);
        });



        // 2. Hash Set - Collection
        HashSet <Integer> colecaoQualquer = new HashSet<>(); // Criando um HashSet

        // Adicionando dados ao Hash Set
        colecaoQualquer.add(1);
        colecaoQualquer.add(2);
        colecaoQualquer.add(3);
        colecaoQualquer.add(80);

        // Imprimindo os dados

        // 1. Forma
        System.out.println(colecaoQualquer);
        // 2. Forma
        colecaoQualquer.forEach((valor)->{
            System.out.println("Valor "+valor);
        });
        */

        // 3. ArrayList - Collections
        ArrayList listaHeterogenea = new ArrayList<>(); // Lista Heteregonea
        ArrayList <Integer> listaHomogeneaDeInteiros = new ArrayList<>(); // Lista homogenea

        // Adicionando dados - Na lista Heterogenea
        listaHeterogenea.add(1);
        listaHeterogenea.add(true);
        listaHeterogenea.add("Meu nome");
        listaHeterogenea.add('A');
        listaHeterogenea.add(1.20f);
        listaHeterogenea.add(1.205);

        // Adicionar dados - Na lista Homogenea
        listaHomogeneaDeInteiros.add(1);
        listaHomogeneaDeInteiros.add(67);
        listaHomogeneaDeInteiros.add(90);
        listaHomogeneaDeInteiros.add(6);
        listaHomogeneaDeInteiros.add(5);
        listaHomogeneaDeInteiros.add(4);
        listaHomogeneaDeInteiros.add(3);
        listaHomogeneaDeInteiros.add(2);

        /*
        // Imprimindo os dados - Heterogena
        // Forma 1
        System.out.println(listaHeterogenea);
        // Forma 2

        listaHeterogenea.forEach((valores)->{
            System.out.println("Valor salvo: "+valores);
        });


        listaHomogeneaDeInteiros.forEach((valores)->{
            System.out.println("Valor salvo: "+valores);
        });


        System.out.println("Antes de ordenar");
        // Usando o for convencional
        for (int i = 0; i < listaHomogeneaDeInteiros.size(); i++) {
            System.out.println("Valores: "+listaHomogeneaDeInteiros.get(i));
        }

        // Ordenando os valores

        System.out.println("Depois de ordenar");
        Collections.sort(listaHomogeneaDeInteiros);
        Collections.reverse(listaHomogeneaDeInteiros);


        // Removendo
        listaHomogeneaDeInteiros.remove(5);

        for (int i = 0; i < listaHomogeneaDeInteiros.size(); i++) {
            System.out.println("Valores: "+listaHomogeneaDeInteiros.get(i));
        }
        */

        // Array List de Objetos
        ArrayList <Aluno> alunos = new ArrayList<>();

        // Criando os alunos
        Aluno a1 = new Aluno("Gabriel",24);
        Aluno a2 = new Aluno("Ramon",30);
        Aluno a3 = new Aluno("Caio",21);

        // Adicionando os alunos
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);

        // Imprimir os dados
        System.out.println("Antes de ordenar -> ");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("NOME: "+alunos.get(i).getNome());
            System.out.println("IDADE: "+alunos.get(i).getIdade());
        }

        // Comparação
        Collections.sort(alunos);
        //Collections.reverse(alunos); // Revertendo

        System.out.println("Depois de ordenar -> ");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("NOME: "+alunos.get(i).getNome());
            System.out.println("IDADE: "+alunos.get(i).getIdade());
        }





    }
}