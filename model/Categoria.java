package model;

import java.util.ArrayList;

public class Categoria {
    private int codigo;
    private String nome;
    private ArrayList<Item> itens;
    public char[] getNome;

    public Categoria(String nome) {
        this.setNome(nome);
        itens = new ArrayList<>();
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void adicionarItem(Item item){
        itens.add(item);
    }

    public void RemoverItem(int codigo){
        System.out.println(itens.get(codigo).getNome()+ "Esse item foi removido da categoria");
        itens.remove(codigo);
    }

    public ArrayList<Item> getItens(){
        return itens;
    }

    public void setItens(ArrayList<Item> itens){
        this.itens = itens;
    }
    
}
