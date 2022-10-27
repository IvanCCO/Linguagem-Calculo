package school.sptech.avaliacao.continuada2.incompleto;

/*

 Substitua os valores abaixo com seus dados:

 RA: 02221071   
 NOME: Ivan Freire de Medeiros Miranda
 TURMA: 1CCO

 ATENÇÃO!!!
 RESOLVA OS ERROS DE COMPILAÇÃO ANTES DE RODAR QUALQUER TESTE

 */
public class Concessionaria {

    private String nome;
    private Integer quantidadeVendas = 0;
    private Integer quantidadeDescontosAplicados = 0;
    private Double totalVendido = 0.0;

    public Concessionaria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public Integer getQuantidadeDescontosAplicados() {
        return quantidadeDescontosAplicados;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }

    public Boolean isValoresValidos(Veiculo veiculo, Integer quantidade) {

        return veiculo != null && quantidade != null && quantidade > 0;
    }

    public Boolean isValoresValidosComDesconto(Veiculo veiculo, Integer quantidadeEstoque, Double valorTabela) {

        return isValoresValidos(veiculo, quantidadeEstoque) && valorTabela != null && valorTabela > 0;
    }

    public Boolean isDescontoValido(Double desconto) {
                
        return desconto != null && desconto > 0;
    }

    public void aumentarEstoque(Veiculo veiculo, Integer quantidade) {

        if (isValoresValidos(veiculo, quantidade)) {

            Integer novaQuantidade = veiculo.getQuantidadeEstoque();

            novaQuantidade += quantidade;

            veiculo.setQuantidadeEstoque(novaQuantidade);
        }
    }

    public void realizarVenda(Veiculo veiculo) {

        if (isValoresValidosComDesconto(veiculo, veiculo.getQuantidadeEstoque(), veiculo.getValorTabela())) {
            
           
            Double valorTabela = veiculo.getValorTabela();
            
            veiculo.setQuantidadeEstoque(veiculo.getQuantidadeEstoque() - 1);
            
            this.totalVendido += valorTabela;
            this.quantidadeVendas++;
        }
    }

    public void realizarVenda(Veiculo veiculo, Double porcentagemDesconto) {

        if(veiculo == null){
        }else{
            
             if (isValoresValidosComDesconto(veiculo, veiculo.getQuantidadeEstoque(), veiculo.getValorTabela()) && isDescontoValido(porcentagemDesconto)) {

            Double valorTabela = veiculo.getValorTabela();
            Double valorDesconto = valorTabela * (porcentagemDesconto / 100);
            Double valorFinal = valorTabela - valorDesconto;

            this.totalVendido += valorFinal;
            this.quantidadeVendas++;
            this.quantidadeDescontosAplicados++;
            veiculo.setQuantidadeEstoque(veiculo.getQuantidadeEstoque() - 1);
        }
        }
       
    }

    public Double getPercentualVendasComDesconto() {

        Double porcVendaComDesconto = this.quantidadeDescontosAplicados * 100.0/this.quantidadeVendas;
        

        if (porcVendaComDesconto == 0 || this.quantidadeDescontosAplicados == 0) {
            return 0.0;
        } else if (porcVendaComDesconto == 100) {
            return 100.0;
        } else {
            return porcVendaComDesconto + 0.0;
        }

    }

}
