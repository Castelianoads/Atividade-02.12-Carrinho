package br.edu.iftm.classe;

public class Produto {
    // Atributos da classe produto
    private String nome;
    private String categoria;
    private float preco;

    // Construtor da classe produto
    public Produto(String nome, String categoria, float preco) {
        this.setNome(nome);
        this.setCategoria(categoria);
        this.setPreco(preco);
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
