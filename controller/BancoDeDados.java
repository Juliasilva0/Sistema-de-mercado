package controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BancoDeDados {
    public BancoDeDados(){


    }
    public ArrayList<String> lerArquivo() {
        try {
            InputStream is = new FileInputStream("itens.txt"); //localizar o arquivo
            InputStreamReader isr = new InputStreamReader(is); //preparar o arqueivo pra escrever
            BufferedReader br = new BufferedReader(isr); //ler o arquivo 
            ArrayList<String> linhas = new ArrayList<>();

            String linha = br.readLine();

            while (linha != null ) {
                System.out.println(linha);
                linha=br.readLine();  
            }

            br.close();
            isr.close();
            is.close();

            System.out.println("Leitura finalizada.");
            return linhas;

        } catch(Exception e) {
            System.out.println("Não foi possível  ler o arquivo");
            return null;
        }
   }

   public void transformarLinhasEmObjetos(ArrayList<String> linhas ) {

   }

   public void escreverArquivo (){
    OutputStream os; //localizar o arquivo 
    OutputStreamWriter osw; //preparar o arqueivo pra escrever
    BufferedReader br; //ler o arquivo 

   }
}                                       