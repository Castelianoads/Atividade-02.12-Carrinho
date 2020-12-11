package br.edu.iftm.teste;

import br.edu.iftm.classe.Carrinho;
import br.edu.iftm.classe.Produto;

public class Principal {
    public static void main(String[] args) {
        //Instancias das classes
        Carrinho carrinho = new Carrinho();
        Produto produto1 = new Produto("Celular Motorola one Fusion", "Eletrônicos", 1990);
        Produto produto2 = new Produto("TV LG 49 Polegadas 4K", "Eletrônicos", 2800);
        Produto produto3 = new Produto("Arroz 5Kg", "Alimento", 10);

        carrinho.adicionar(produto1);
        carrinho.adicionar(produto2);
        carrinho.adicionar(produto3);
        carrinho.mostrarProdutos();
    }
}
