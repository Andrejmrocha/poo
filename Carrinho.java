class Carrinho{
  Produtos[] produtos;
  int qt = 0;

  Carrinho(int capacidade) {
    produtos = new Produtos[capacidade];
  }
  double calcularTotal() {
    double soma = 0;
    for (int i = 0; i < produtos.length; i++){
        if( produtos[i] == null){
          ;
        }
        else{
        soma += produtos[i].preco;
        }
    }
    return soma;
  }
  

  void adicionarProduto(Produtos produto){
    if(qt >= produtos.length){
      System.out.println("Carrinho cheio, não foi possivel adicionar " + produto.nome);
      return;
    };
    for(int i = 0;i < produtos.length; i++){
      if(produtos[i] == null){
        produtos[i] = produto;
        System.out.println(produto.nome+" foi adicionado");
        qt += 1;
        return;
      }
    }
    }
  

  void removerProduto(Produtos produto){
    for(int i = 0; i < qt; i++){
      if (produtos[i] == produto) { //checar produto a ser removido 
        System.out.println(produtos[i].nome + " foi removido");
        produtos[i] = null;
        qt -= 1;
        }
        
      }
        
    }
  void LimparCarrinho(Carrinho carrinho){
    for(int i = 0; i < produtos.length; i++){
      carrinho.produtos[i] = null;
      System.out.println("deu certo");
    }
    System.out.println("carrinho vazio");
    
  }

  
  }
  
  
