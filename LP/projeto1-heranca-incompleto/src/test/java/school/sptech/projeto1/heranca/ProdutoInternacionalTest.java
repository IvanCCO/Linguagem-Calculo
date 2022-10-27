package school.sptech.projeto1.heranca;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
  Não alterar essa classe!!!
*/

class ProdutoInternacionalTest {

  @Test
  @DisplayName("getPreco(): quando acionado e produto possui valor 4.500,99 deve retornar 7.201,584")
  void getPrecoQuandoAcionadoEProdutoPossuiValor450099DeveRetornar7201584() {

    ProdutoInternacional prdInternacional = new ProdutoInternacional(
            1, "Playstation 5", "games", 4_500.99);

    Double precoCorretoComTaxa = 7_201.584;

    assertEquals(precoCorretoComTaxa, prdInternacional.getPreco(), 1.0);
  }

  @Test
  @DisplayName("getPreco(): quando acionado e produto possui valor 0 deve retornar 0")
  void getPrecoQuandoAcionadoEProdutoPossuiValor0DeveRetornar0() {

    ProdutoInternacional prdInternacional = new ProdutoInternacional(
            1, "Playstation 5", "games", 0.0);

    Double precoCorretoComTaxa = 0.0;

    assertEquals(precoCorretoComTaxa, prdInternacional.getPreco());
  }

  @Test
  @DisplayName("getId(): quando acionado deve retornar o valor do id")
  public void getIdQuandoAcionadoDeveRetornarOValorDoId() {

    ProdutoInternacional prdInternacional = new ProdutoInternacional(
            1, "Playstation 5", "games", 4_999.99
    );

    assertEquals(1, prdInternacional.getId());
  }

  @Test
  @DisplayName("getNome(): quando acionado deve retornar o valor do nome")
  public void getNomeQuandoAcionadoDeveRetornarOValorDoNome() {

    ProdutoInternacional prdInternacional = new ProdutoInternacional(
            1, "Playstation 5", "games", 4_999.99
    );

    assertEquals("Playstation 5", prdInternacional.getNome());
  }

  @Test
  @DisplayName("getCategoria(): quando acionado o valor da categoria")
  public void getCategoriaQuandoAcionadoDeveRetornarOValorDaCategoria() {
    ProdutoInternacional prdInternacional = new ProdutoInternacional(
            1, "Playstation 5", "games", 4_999.99
    );

    assertEquals("games", prdInternacional.getCategoria());
  }

  @Test
  @DisplayName("getPreco(): quando acionado deve retornar o valor do preço com imposto")
  public void getPrecoQuandoAcionadoDeveRetornarOValorDoPreco() {

    ProdutoInternacional prdInternacional = new ProdutoInternacional(
            1, "Nintendo Switch", "games", 2_450.99
    );

    assertEquals(3_921.584, prdInternacional.getPreco());
  }

  @Test
  @DisplayName("clasee ProdutoInternacional deve ser herdeira da classe Produto")
  public void objetoProdutoInternacionalDeveSerHerdeiraDeProduto() {

    ProdutoInternacional prdInternacional = new ProdutoInternacional(
            1, "Playstation 5", "games", 4_500.99
    );

    assertInstanceOf(Produto.class, prdInternacional);
  }

  @Test
  @DisplayName("classe ProdutoInternacional deve conter apenas o getter sobrescrito")
  void produtoInternacionalDeveApenasConterGetterSobreescrito() {

    List<Method> methods = Arrays.asList(ProdutoInternacional.class.getDeclaredMethods());

    assertEquals(1, methods.size());
  }

  @Test
  @SuppressWarnings("ThrowableResultIgnored")
  @DisplayName("classe ProdutoInternacional deve conter apenas getters")
  void produtoInternacionalDeveConterApenasGetter() {
    List<Field> fields = Arrays.asList(ProdutoInternacional.class.getDeclaredFields());

    fields.forEach(field -> {
      
      String getter = String.format("%s%s", "get", StringUtils.capitalize(field.getName()));
      String setter = String.format("%s%s", "set", StringUtils.capitalize(field.getName()));

      assertDoesNotThrow(() -> Produto.class.getDeclaredMethod(getter));
      assertThrows(NoSuchMethodException.class, () -> ProdutoInternacional.class.getDeclaredMethod(setter, field.getType()));
    });
  }
}
