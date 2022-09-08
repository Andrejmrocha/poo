class Carrinho{
  Produtos[] produtos;
  int qt = 0;
  int nulo = 0;

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
        System.out.println("Somei "+i);
        }
    }
    return soma;
  }
  

  void adicionarProduto(Produtos produto){
    
    if (qt >= produtos.length){ 
      System.out.println("Carrinho cheio, não foi possível adicionar o "+produto.nome);
    }
    else{
      if (nulo != 0){
        produtos[nulo] = produto;
        System.out.println(produto.nome + " adicionado"); 
      }
      else{
        produtos[qt] = produto;
        qt += 1;
        System.out.println(produto.nome + " adicionado");  
      }
    }
  }

  void removerProduto(Produtos produto){
    for(int i = 0; i < qt; i++){
      if (produtos[i] == produto) { //checar produto a ser removido 
        System.out.println(produtos[i].nome + " foi removido");
        produtos[i] = null;
        nulo = i;
        qt = qt - 1;
        
        }
        
      }
        
    }

  void LimparCarro(Carrinho carrinho){
    for(int i = 0; i <= carrinho.produtos.length; i++){
      carrinho.produtos[i] = null;
    }
    System.out.println("Tudo limpo");
  }
  }
  
  
