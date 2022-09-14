class Main {
  public static void main(String[] args) {

    Carrinho meuCarrinho = new Carrinho(3);
    
    Produtos Produto1 = new Produtos("Leite", "Algo", "Eu", 1);
    Produtos Produto2 = new Produtos("Sal", "Algo", "Eu", 1);
    Pack pack1 = new Pack("Refrigerante", "cola", "coca-cola", 6, 6);
    // Produtos Produto3 = new Produtos("Agua", "Algo", "Ele", 3);
    // Produtos Produto4 = new Produtos("Suco", "Algo", "Ele", 5);
    // Produtos Produto5 = new Produtos("Chá", "Algo", "Ele", 8);
    
    meuCarrinho.adicionarProduto(Produto1);
    meuCarrinho.adicionarProduto(Produto2);
    meuCarrinho.adicionarProduto(pack1);
    // meuCarrinho.adicionarProduto(Produto4);
    // meuCarrinho.removerProduto(Produto3);
    // meuCarrinho.removerProduto(Produto1);
    System.out.println(meuCarrinho.calcularTotal());
    // meuCarrinho.adicionarProduto(Produto4);
    // meuCarrinho.adicionarProduto(Produto5);
    // System.out.println(meuCarrinho.calcularTotal());
    // meuCarrinho.LimparCarrinho();  

  }
  
}
