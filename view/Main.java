package view;


import java.util.ArrayList;

import controller.BancoDeDados;

public class Main {
    public static void main(String[] args) {
        BancoDeDados b = new BancoDeDados();
        ArrayList<String> linhas = b.lerArquivo();

        b.transformarLinhasEmObjetos(linhas);
    }
}