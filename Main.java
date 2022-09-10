class Main {
  public static void main(String[] args) {

    Carrinho meuCarrinho = new Carrinho(3);
    // meuCarrinho.produtos = new Produtos[3];
    
    Produtos Produto1 = new Produtos("Leite", "Algo", "Eu", 1);
    Produtos Produto2 = new Produtos("Refri", "Algo", "Tu", 10);
    Produtos Produto3 = new Produtos("Agua", "Algo", "Ele", 3);
    Produtos Produto4 = new Produtos("Suco", "Algo", "Ele", 5);
    Produtos Produto5 = new Produtos("Chá", "Algo", "Ele", 8);
    
    meuCarrinho.adicionarProduto(Produto1);
    meuCarrinho.adicionarProduto(Produto2);
    meuCarrinho.adicionarProduto(Produto3);
    meuCarrinho.adicionarProduto(Produto4);
    meuCarrinho.removerProduto(Produto3);
    meuCarrinho.removerProduto(Produto1);
    System.out.println(meuCarrinho.calcularTotal());
    meuCarrinho.adicionarProduto(Produto4);
    meuCarrinho.adicionarProduto(Produto5);
    System.out.println(meuCarrinho.calcularTotal());
    meuCarrinho.LimparCarrinho(meuCarrinho);  
    //   System.out.println("Produto " + (i+1) + " é :");
      
    //   System.out.println(meuCarrinho.produtos[i].nome);
    //   System.out.println(meuCarrinho.produtos[i].descricao);
    //   System.out.println(meuCarrinho.produtos[i].fabricante);
    //   System.out.println(meuCarrinho.produtos[i].preco);
    //   System.out.println("\n");
    // }
  //   somar(Produto1, Produto2, Produto3);
  //   System.out.println(meuCarrinho.calcularTotal());    
  // }

  // static void somar(Produtos produto1, Produtos produto2, Produtos produto3){
  //   System.out.println("\nTotal: R$" + (produto1.preco + produto2.preco + produto3.preco));
  // }

  }
  
}
