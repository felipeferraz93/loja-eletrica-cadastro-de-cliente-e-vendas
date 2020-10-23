package Models;

import java.text.NumberFormat;


public class Produto {
    
    private int id;
    private double preco;
    private String nome;
    private String unidade;

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    public String precoString(){
        String valor = NumberFormat.getCurrencyInstance().format(this.preco);
    
        return valor;        
    }
    
    public String idString(){
        String id = Integer.toString(this.id);        
        return id;
    }
    
    
}
