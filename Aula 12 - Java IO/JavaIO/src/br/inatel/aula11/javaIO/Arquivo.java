package br.inatel.aula11.javaIO;
// Imports do pacote Java IO
import br.inatel.aula11.javaIO.model.Funcionario;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    // Métodos da classe
    // 1. Escrever
    public void escrever(Funcionario func){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try{
            // Estruturas básicas para escrita em um arquivo
            os = new FileOutputStream("Funcionarios.txt",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            // Escrevendo as informações do funcionário
            bw.write("+++ Funcionário +++\n");
            bw.write(func.getNome()+"\n");
            bw.write(func.getCargo()+"\n");
            bw.write(func.getIdade()+"\n");



        }catch (Exception e){

        }finally{
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // 2. Leitura
    public ArrayList<Funcionario> ler (){
        // Coleção que armazenará todos os funcionários encontrados no meu arquivo
        ArrayList<Funcionario> funcionariosEncontradosNoArquivo = new ArrayList<>();

        // Estrutura para leitura de dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String auxLeitura; // Vai ser o nosso ponteiro do arquivo

        try{
            // Estrutura básica para leitura
            is = new FileInputStream("Funcionarios.txt");
            isr = new InputStreamReader(is);
            br= new BufferedReader(isr);

            // Realizando a leitura dos dados
            auxLeitura = br.readLine();

            while(auxLeitura!=null){
                // Comparando se o ponteio é igual a flag
                if(auxLeitura.equalsIgnoreCase("+++ Funcionário +++")){
                    // Criar a estrutura para tratar as infos do funcionário no Java
                    Funcionario auxFuncionario = new Funcionario();
                    auxFuncionario.setNome(br.readLine());
                    auxFuncionario.setCargo(br.readLine());
                    auxFuncionario.setIdade(Integer.parseInt(br.readLine()));

                    // Adicionando o funcionário no array list
                    funcionariosEncontradosNoArquivo.add(auxFuncionario);


                }
                auxLeitura =br.readLine(); // Pula para a próxima linha
            }


        }catch (Exception e){

        }finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        return funcionariosEncontradosNoArquivo;
    }
}
