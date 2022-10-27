package school.sptech.projeto1.heranca;

public class ProdutoInternacional extends Produto{
    

    ProdutoInternacional(int i, String nome, String games, double d) {
        super(i, nome, games, d);
    }
    
    
    /* 
        1. Essa classe deve ser herdeira de produto;
        2. O método "getPreco" (getter padrão) deverá ser sobreescrito e possuir um acréscimo de 60%;
    */   
    
    
    @Override
    public Double getPreco() {
        return super.getPreco() * 1.6; 
    }
    
}
