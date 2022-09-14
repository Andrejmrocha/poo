class Pack extends Produtos {
  private int quant;
  
  
  
  Pack(String nome, String descricao, String fabricante, double preco, int quant) {
    super(nome, descricao, fabricante, preco);
    this.quant = quant;
    this.preco = preco - (preco * 0.10);
    this.preco = this.preco * quant;
    
  }

  
}