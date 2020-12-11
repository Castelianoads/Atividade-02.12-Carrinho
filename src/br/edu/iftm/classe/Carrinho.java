package br.edu.iftm.classe;

import java.util.ArrayList; // Importou a ArrayList

public class Carrinho {

    // Atributos da classe carrinho
    private float valorTotal;

    // produtosList é um arrayList
    ArrayList<Produto> produtosList = new ArrayList<Produto>(); 

    // entrando parametro: objeto produto da classe Produto
    public void adicionar(Produto produto) { 
        produtosList.add(produto); // acidionando um produto na array produtosList
        System.out.println("Adicionado " +produto.getNome()+ " no carrinho");
        valorTotal += produto.getPreco();
    }

    public void mostrarProdutos() {
        if (valorTotal >= 1){
            System.out.println("\nPRODUTOS DO CARRINHO:");

            for (int indice = 0; indice < produtosList.size(); indice++){
                String nome = produtosList.get(indice).getNome();
                String categoria = produtosList.get(indice).getCategoria();
                float preco = produtosList.get(indice).getPreco();

                System.out.format("%d. %s (Categoria: %s) R$ %.2f.\n",indice+1, nome, categoria, preco);
            }

            System.out.println("Valor total do carrinho: R$ " +valorTotal+ "\n");

        } else System.out.println("Carrinho vazio\n");

    }

    public float getValorTotal() {
        return valorTotal;
    }    
    
}
