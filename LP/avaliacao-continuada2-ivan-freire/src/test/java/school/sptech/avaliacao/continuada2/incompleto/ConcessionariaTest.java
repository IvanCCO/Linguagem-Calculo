package school.sptech.avaliacao.continuada2.incompleto;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*

 ATENÇÃO JOVEM!!!

 CONFORME INFORMADO EM SALA, VOCÊ NÃO DEVE ALTERAR NADA DENTRO DESSA CLASSE.

 FIQUE A VONTADE EM OLHAR PARA ENTENDER OS ERROS DE COMPILAÇÃO, MAS SAIBA QUE SE VOCÊ ALTERAR ESSE ARQUIVO PARA FAZER
 PASSAR NOS TESTES, VOCÊ NÃO ATINGIU OS OBJETIVOS POIS ESTÁ BURLANDO AS REGRAS, PORTANTO, SUA NOTA SERÁ ZERO.
 */
class ConcessionariaTest {

  private Veiculo veiculo;
  private Concessionaria concessionaria;

  @BeforeEach
  public void init() {
    this.veiculo = new Veiculo(1, "Fiat 147");
    this.concessionaria = new Concessionaria("Auto Moreschi");
  }

  @Test
  @DisplayName("realizarVenda(SEM DESCONTO): Quando acionado e veiculo tiver 10 em estoque e valor de tabela maior que zero, deve retornar 9 após a venda")
  void realizarVendaComEstoqueEPrecoValido() {
    this.veiculo.setValorTabela(10_000.0);
    this.concessionaria.aumentarEstoque(veiculo, 10);
    this.concessionaria.realizarVenda(veiculo);
    assertEquals(9, veiculo.getQuantidadeEstoque());
  }

  @Test
  @DisplayName("realizarVenda(SEM DESCONTO): Quando acionado e veiculo tiver 0 em estoque e valor de tabela maior que zero, deve retornar 0 após a venda")
  void realizarVendaComEstoqueInvalidoEPrecoValido() {
    this.veiculo.setValorTabela(10_000.0);
    this.concessionaria.realizarVenda(veiculo);
    assertEquals(0, veiculo.getQuantidadeEstoque());
  }

  @Test
  @DisplayName("realizarVenda(SEM DESCONTO): Quando acionado e veiculo tiver 10 em estoque e valor de tabela inválido, deve retornar 10 após a venda")
  void realizarVendaComEstoqueValidoEPrecoInvalido() {
    this.concessionaria.aumentarEstoque(veiculo, 10);
    this.concessionaria.realizarVenda(veiculo);
    assertEquals(10, veiculo.getQuantidadeEstoque());
  }

  @Test
  @DisplayName("realizarVenda(SEM DESCONTO): Quando acionado e veiculo tiver 0 em estoque e valor de tabela inválido, deve retornar 0 após a venda")
  void realizarVendaComEstoqueInvalidoEPrecoInvalido() {
    this.concessionaria.realizarVenda(veiculo);
    assertEquals(0, veiculo.getQuantidadeEstoque());
  }

  @Test
  @DisplayName("realizarVenda(SEM DESCONTO): Quando acionado e veiculos possuirem estoque maior que zero e valor de tabela maior que zero, deve retornar 2 no getQuantidadeVendida() e 27.537 no getTotalVendido()")
  void realizarVendaComEstoqueEPrecoValidoConcessionaria() {

    Veiculo novoVeiculo = new Veiculo(2, "Monza tubarão");
    this.concessionaria.aumentarEstoque(novoVeiculo, 2);
    novoVeiculo.setValorTabela(17_537.0);

    this.veiculo.setValorTabela(10_000.0);
    this.concessionaria.aumentarEstoque(veiculo, 10);

    this.concessionaria.realizarVenda(veiculo);
    this.concessionaria.realizarVenda(novoVeiculo);

    assertEquals(2, concessionaria.getQuantidadeVendas());
    assertEquals(27_537.0, concessionaria.getTotalVendido());
  }

  @Test
  @DisplayName("realizarVenda(SEM DESCONTO): Quando acionado e um dos veiculos nao possui estoque, deve retornar 1 no getQuantidadeVendida() e 17_537.0 no getTotalVendido()")
  void realizarVendaComEstoqueInvalidoEPrecoValidoConcessionaria() {

    Veiculo novoVeiculo = new Veiculo(2, "Monza tubarão");
    this.concessionaria.aumentarEstoque(novoVeiculo, 2);
    novoVeiculo.setValorTabela(17_537.0);

    this.veiculo.setValorTabela(10_000.0);
    this.concessionaria.realizarVenda(veiculo);
    this.concessionaria.realizarVenda(novoVeiculo);

    assertEquals(1, concessionaria.getQuantidadeVendas());
    assertEquals(17_537.0, concessionaria.getTotalVendido());
  }

  @Test
  @DisplayName("realizarVenda(SEM DESCONTO): Quando acionado e um dos veiculos nao possuir valor de tabela cadastrado, deve retornar 1 no getQuantidadeVendida() e 42_537.0 no getTotalVendido()")
  void realizarVendaComEstoqueValidoEPrecoInvalidoConcessionaria() {

    Veiculo novoVeiculo = new Veiculo(2, "Honda Fit");
    this.concessionaria.aumentarEstoque(novoVeiculo, 7);
    novoVeiculo.setValorTabela(42_537.0);

    this.concessionaria.aumentarEstoque(veiculo, 10);

    this.concessionaria.realizarVenda(veiculo);
    this.concessionaria.realizarVenda(novoVeiculo);

    assertEquals(1, concessionaria.getQuantidadeVendas());
    assertEquals(42_537.0, concessionaria.getTotalVendido());
  }

  @Test
  @DisplayName("realizarVenda(SEM DESCONTO): Quando acionado e um dos veiculos nao possuir valor de tabela cadastrado e estoque, deve retornar 1 no getQuantidadeVendida() e 18.957 no getTotalVendido()")
  void realizarVendaComEstoqueInvalidoEPrecoInvalidoConcessionaria() {

    Veiculo novoVeiculo = new Veiculo(2, "Honda Fit");
    this.concessionaria.aumentarEstoque(novoVeiculo, 7);
    novoVeiculo.setValorTabela(18_957.0);

    this.concessionaria.realizarVenda(novoVeiculo);
    this.concessionaria.realizarVenda(veiculo);

    assertEquals(18_957.0, concessionaria.getTotalVendido());
    assertEquals(1, concessionaria.getQuantidadeVendas());
  }

  @Test
  @DisplayName("aumentarEstoque() - Quando acionado com veiculo valido e quantidade valida deve retornar 7 ao invocar getQuantidadeEstoque()")
  void aumentarEstoqueComVeiculoValidoEQuantidadeValida() {
    this.concessionaria.aumentarEstoque(veiculo, 7);
    assertEquals(7, veiculo.getQuantidadeEstoque());
  }

  @Test
  @DisplayName("aumentarEstoque() - Quando acionado com veiculo nulo e quantidade válida não deve lançar excessão")
  void aumentarEstoqueComVeiculoNuloEQuantidadeValida() {
    assertDoesNotThrow(() -> this.concessionaria.aumentarEstoque(null, 3));
  }

  @Test
  @DisplayName("aumentarEstoque() - Quando acionado com veiculo válido e quantidade nula não deve lançar excessão")
  void aumentarEstoqueComVeiculoInvalidoEQuantidadeNula() {
    assertDoesNotThrow(() -> this.concessionaria.aumentarEstoque(veiculo, null));
  }

  @Test
  @DisplayName("aumentarEstoque() - Quando acionado com veiculo nulo e quantidade nula não deve lançar excessão")
  void aumentarEstoqueComVeiculoNuloEQuantidadeNula() {
    assertDoesNotThrow(() -> this.concessionaria.aumentarEstoque(null, null));
  }

  @Test
  @DisplayName("aumentarEstoque() - Quando acionado com veiculo válido e quantidade negativa não deve alterar valor de estoque")
  void aumentarEstoqueComVeiculoValidoEQuantidadeNegativa() {
    this.concessionaria.aumentarEstoque(veiculo, -7);
    assertEquals(0, veiculo.getQuantidadeEstoque());
  }

  @Test
  @DisplayName("aumentarEstoque() - Quando acionado com veiculo inválido e quantidade negativa não deve lançar excessão")
  void aumentarEstoqueComVeiculoInvalidoEQuantidadeNegativa() {
    assertDoesNotThrow(() -> this.concessionaria.aumentarEstoque(null, -7));
  }

  @Test
  @DisplayName("realizarVenda(COM DESCONTO 10%): Quando acionado e veiculo tiver 10 em estoque e valor de tabela for 25_550.0, deve retornar 22_995.0 getTotalVendido(), 1 getQuantidadeVendas() e 1 getQuantidadeDescontosAplicados()")
  void realizarVendaComVeiculoValidoEDescontoValido() {
    this.veiculo.setValorTabela(25_550.0);
    this.concessionaria.aumentarEstoque(veiculo, 10);

    this.concessionaria.realizarVenda(veiculo, 10.0);

    assertEquals(9, veiculo.getQuantidadeEstoque());

    assertEquals(22_995.0, concessionaria.getTotalVendido(), 2.0);
    assertEquals(1, concessionaria.getQuantidadeVendas());
    assertEquals(1, concessionaria.getQuantidadeDescontosAplicados());
  }

  @Test
  @DisplayName("realizarVenda(COM DESCONTO nulo): Quando acionado e veiculo tiver 10 em estoque, valor de tabela for 25_550.0 e desconto for nulo, não deve lançar execessão")
  void realizarVendaComVeiculoValidoEDescontoNulo() {
    this.veiculo.setValorTabela(25_550.0);
    this.concessionaria.aumentarEstoque(veiculo, 10);

    assertDoesNotThrow(() -> this.concessionaria.realizarVenda(veiculo, null));

    assertEquals(10, veiculo.getQuantidadeEstoque());

    assertEquals(0.0, concessionaria.getTotalVendido());
    assertEquals(0, concessionaria.getQuantidadeVendas());
    assertEquals(0, concessionaria.getQuantidadeDescontosAplicados());
  }

  @Test
  @DisplayName("realizarVenda(COM DESCONTO NEGATIVO): Quando acionado e veiculo tiver 10 em estoque, valor de tabela for 25_550.0 e desconto for negativo, não deve contabilizar venda")
  void realizarVendaComVeiculoValidoEDescontoNegativo() {
    this.veiculo.setValorTabela(25_550.0);
    this.concessionaria.aumentarEstoque(veiculo, 10);

    assertDoesNotThrow(() -> this.concessionaria.realizarVenda(veiculo, -13.5));

    assertEquals(10, veiculo.getQuantidadeEstoque());

    assertEquals(0.0, concessionaria.getTotalVendido());
    assertEquals(0, concessionaria.getQuantidadeVendas());
    assertEquals(0, concessionaria.getQuantidadeDescontosAplicados());
  }

  @Test
  @DisplayName("realizarVenda(COM DESCONTO NEGATIVO E VEICULO NULO): Quando acionado com veiculo e desconto nulo, não deve contabilizar venda e não deve lançar excessão")
  void realizarVendaComVeiculoNuloEDescontoNegativo() {

    Veiculo veiculoNovo = new Veiculo(3, "Kombi");
    veiculoNovo.setQuantidadeEstoque(2);
    veiculoNovo.setValorTabela(12_500.0);
    this.concessionaria.realizarVenda(veiculoNovo, 2.0);

    assertDoesNotThrow(() -> this.concessionaria.realizarVenda(null, -13.5));

    assertEquals(1, veiculoNovo.getQuantidadeEstoque());

    assertEquals(12_250.0, concessionaria.getTotalVendido(), 2.0);
    assertEquals(1, concessionaria.getQuantidadeVendas());
    assertEquals(1, concessionaria.getQuantidadeDescontosAplicados());
  }

  @Test
  @DisplayName("realizarVenda(COM VEICULO SEM ESTOQUE): Quando acionado com veiculo sem estoque, não deve contabilizar venda e não deve lançar excessão")
  void realizarVendaComVeiculoSemEstoque() {

    Veiculo veiculoNovo = new Veiculo(3, "Kombi");
    veiculoNovo.setValorTabela(12_500.0);

    assertDoesNotThrow(() -> this.concessionaria.realizarVenda(veiculoNovo, 15.0));

    assertEquals(0.0, concessionaria.getTotalVendido(), 2.0);
    assertEquals(0, concessionaria.getQuantidadeVendas());
    assertEquals(0, concessionaria.getQuantidadeDescontosAplicados());
  }

  @Test
  @DisplayName("realizarVenda(COM VEICULO SEM VALOR TABELA): Quando acionado com veiculo sem valor tabela, não deve contabilizar venda e não deve lançar excessão")
  void realizarVendaComVeiculoSemValorTabela() {

    Veiculo veiculoNovo = new Veiculo(3, "Kombi");
    veiculoNovo.setQuantidadeEstoque(2);

    assertDoesNotThrow(() -> this.concessionaria.realizarVenda(veiculoNovo, 12.0));

    assertEquals(0.0, concessionaria.getTotalVendido(), 2.0);
    assertEquals(0, concessionaria.getQuantidadeVendas());
    assertEquals(0, concessionaria.getQuantidadeDescontosAplicados());
  }

  @Test
  @DisplayName("realizarVenda(COM VEICULO SEM VALOR TABELA E SEM ESTOQUE): Quando acionado com veiculo sem valor tabela e sem estoque, não deve contabilizar venda e não deve lançar excessão")
  void realizarVendaComVeiculoSemValorTabelaESemPreco() {

    Veiculo veiculoNovo = new Veiculo(3, "Kombi");

    assertDoesNotThrow(() -> this.concessionaria.realizarVenda(veiculoNovo, 2.0));

    assertEquals(0.0, concessionaria.getTotalVendido(), 2.0);
    assertEquals(0, concessionaria.getQuantidadeVendas());
    assertEquals(0, concessionaria.getQuantidadeDescontosAplicados());
  }

  @Test
  @DisplayName("realizarVenda(COM DOIS VEICULOS, UM SEM DESCONTO, UM COM DESCONTO E UM COM VEICULO E DESCONTO NULO): Quando acionado com veiculo e desconto nulo nao deve contabilizar venda e não deve lançar excessão, deve retornar 2 vendas e 1 desconto aplicado, total 34.700")
  void realizarVendaComVeiculoNuloEDescontoNulo() {

    Veiculo veiculoNovo1 = new Veiculo(3, "Kombi");
    veiculoNovo1.setQuantidadeEstoque(7);
    veiculoNovo1.setValorTabela(22_450.0);

    this.concessionaria.realizarVenda(veiculoNovo1);

    Veiculo veiculoNovo2 = new Veiculo(3, "Fusca");
    veiculoNovo2.setQuantidadeEstoque(2);
    veiculoNovo2.setValorTabela(12_500.0);

    this.concessionaria.realizarVenda(veiculoNovo2, 2.0);

    assertDoesNotThrow(() -> this.concessionaria.realizarVenda(null, null));

    assertEquals(1, veiculoNovo2.getQuantidadeEstoque());

    assertEquals(34_700.0, concessionaria.getTotalVendido(), 2.0);
    assertEquals(2, concessionaria.getQuantidadeVendas());
    assertEquals(1, concessionaria.getQuantidadeDescontosAplicados());
  }

  @Test
  @DisplayName("getPercentualVendasComDesconto(): Deve retornar o percentual correto (100%)")
  void getPercentualVendasComDescontoCalculoDeveRetornar100() {
    Veiculo veiculoNovo1 = new Veiculo(3, "Kombi");
    veiculoNovo1.setQuantidadeEstoque(7);
    veiculoNovo1.setValorTabela(22_450.0);

    this.concessionaria.realizarVenda(veiculoNovo1, 20.0);

    Veiculo veiculoNovo2 = new Veiculo(3, "Fusca");
    veiculoNovo2.setQuantidadeEstoque(2);
    veiculoNovo2.setValorTabela(12_500.0);

    this.concessionaria.realizarVenda(veiculoNovo2, 2.0);

    Veiculo veiculoNovo3 = new Veiculo(3, "Opala");
    veiculoNovo3.setQuantidadeEstoque(2);
    veiculoNovo3.setValorTabela(44_500.0);

    this.concessionaria.realizarVenda(veiculoNovo3, 2.0);

    Veiculo veiculoNovo4 = new Veiculo(3, "Monza");
    veiculoNovo4.setQuantidadeEstoque(2);
    veiculoNovo4.setValorTabela(11_500.0);

    this.concessionaria.realizarVenda(veiculoNovo4, 2.0);
    
    assertEquals(4, this.concessionaria.getQuantidadeVendas());
    assertEquals(4, this.concessionaria.getQuantidadeDescontosAplicados());
    
    assertEquals(100, this.concessionaria.getPercentualVendasComDesconto());
  }

  @Test
  @DisplayName("getPercentualVendasComDesconto(): Deve retornar o percentual correto (75%)")
  void getPercentualVendasComDescontoCalculoDeveRetornar75() {
    Veiculo veiculoNovo1 = new Veiculo(3, "Kombi");
    veiculoNovo1.setQuantidadeEstoque(7);
    veiculoNovo1.setValorTabela(22_450.0);

    this.concessionaria.realizarVenda(veiculoNovo1);

    Veiculo veiculoNovo2 = new Veiculo(3, "Fusca");
    veiculoNovo2.setQuantidadeEstoque(2);
    veiculoNovo2.setValorTabela(12_500.0);

    this.concessionaria.realizarVenda(veiculoNovo2, 2.0);

    Veiculo veiculoNovo3 = new Veiculo(3, "Opala");
    veiculoNovo3.setQuantidadeEstoque(2);
    veiculoNovo3.setValorTabela(44_500.0);

    this.concessionaria.realizarVenda(veiculoNovo3, 2.0);

    Veiculo veiculoNovo4 = new Veiculo(3, "Monza");
    veiculoNovo4.setQuantidadeEstoque(2);
    veiculoNovo4.setValorTabela(11_500.0);

    this.concessionaria.realizarVenda(veiculoNovo4, 2.0);

    assertEquals(75.0, this.concessionaria.getPercentualVendasComDesconto());
  }

  @Test
  @DisplayName("getPercentualVendasComDesconto(): Deve retornar o percentual correto (50%)")
  void getPercentualVendasComDescontoCalculoDeveRetornar50() {

    Veiculo veiculoNovo1 = new Veiculo(3, "Kombi");
    veiculoNovo1.setQuantidadeEstoque(7);
    veiculoNovo1.setValorTabela(22_450.0);

    this.concessionaria.realizarVenda(veiculoNovo1);

    Veiculo veiculoNovo2 = new Veiculo(3, "Fusca");
    veiculoNovo2.setQuantidadeEstoque(2);
    veiculoNovo2.setValorTabela(12_500.0);

    this.concessionaria.realizarVenda(veiculoNovo2, 2.0);

    Veiculo veiculoNovo3 = new Veiculo(3, "Opala");
    veiculoNovo3.setQuantidadeEstoque(2);
    veiculoNovo3.setValorTabela(44_500.0);

    this.concessionaria.realizarVenda(veiculoNovo3);

    Veiculo veiculoNovo4 = new Veiculo(3, "Monza");
    veiculoNovo4.setQuantidadeEstoque(2);
    veiculoNovo4.setValorTabela(11_500.0);

    this.concessionaria.realizarVenda(veiculoNovo4, 2.0);

    assertEquals(50.0, this.concessionaria.getPercentualVendasComDesconto());
  }

  @Test
  @DisplayName("getPercentualVendasComDesconto(): Deve retornar o zero no caso de nenhuma compra com desconto")
  void getPercentualVendasZerado() {
    Veiculo veiculoNovo1 = new Veiculo(3, "Kombi");
    veiculoNovo1.setQuantidadeEstoque(7);
    veiculoNovo1.setValorTabela(22_450.0);

    this.concessionaria.realizarVenda(veiculoNovo1);

    Veiculo veiculoNovo4 = new Veiculo(3, "Monza");
    veiculoNovo4.setQuantidadeEstoque(2);
    veiculoNovo4.setValorTabela(11_500.0);

    this.concessionaria.realizarVenda(veiculoNovo4);

    assertEquals(0.0, this.concessionaria.getPercentualVendasComDesconto());
  }

  @Test
  @DisplayName("getPercentualVendasComDesconto(): Quando acionado e somente realizar vendas com desconto, deverá retornar 100%")
  void getPercentualVendasApenasVendasComDesconto() {
    Veiculo veiculoNovo1 = new Veiculo(3, "Kombi");
    veiculoNovo1.setQuantidadeEstoque(7);
    veiculoNovo1.setValorTabela(22_450.0);

    this.concessionaria.realizarVenda(veiculoNovo1, 10.0);

    Veiculo veiculoNovo4 = new Veiculo(3, "Monza");
    veiculoNovo4.setQuantidadeEstoque(2);
    veiculoNovo4.setValorTabela(11_500.0);

    this.concessionaria.realizarVenda(veiculoNovo4, 5.0);

    assertEquals(100.0, this.concessionaria.getPercentualVendasComDesconto());
  }

  @Test
  @DisplayName("getPercentualVendasComDesconto(): Deve retornar o zero no caso de nenhuma compra com desconto e nenhuma compra sem desconto")
  void getPercentualVendasZerado2() {
    assertDoesNotThrow(() -> this.concessionaria.getPercentualVendasComDesconto());
    assertEquals(0.0, this.concessionaria.getPercentualVendasComDesconto());
  }

  @Test
  @DisplayName("classe Concessionaria: Deve ter todos os seus atributos privados")
  void classeConcessionariaAtributosPrivados() {
    List<Field> fields = Arrays.asList(Concessionaria.class.getDeclaredFields());

    fields.forEach(field -> {
      assertTrue(field.getModifiers() == Modifier.PRIVATE);
    });
  }

  @Test
  @DisplayName("classe Concessionaria: Deve ter todos os seus metodos públicos")
  void classeConcessionariaMetodosPublicos() {
    List<Method> methods = Arrays.asList(Concessionaria.class.getDeclaredMethods());

    methods.forEach(method -> {
      assertTrue(method.getModifiers() == Modifier.PUBLIC);
    });
  }

  @Test
  @DisplayName("classe Concessionaria: todos os atributos devem possuir Getter e não possuir Setter")
  @SuppressWarnings("ThrowableResultIgnored")
  void classeConcessionariaGettersESetters() {
    List<Field> fields = Arrays.asList(Concessionaria.class.getDeclaredFields());

    for (Field field : fields) {
      String getter = "get" + StringUtils.capitalize(field.getName());
      String setter = "set" + StringUtils.capitalize(field.getName());

      assertDoesNotThrow(() -> Concessionaria.class.getDeclaredMethod(getter));
      assertThrows(NoSuchMethodException.class, () -> Concessionaria.class.getDeclaredMethod(setter, field.getType()));
    }
  }
}
