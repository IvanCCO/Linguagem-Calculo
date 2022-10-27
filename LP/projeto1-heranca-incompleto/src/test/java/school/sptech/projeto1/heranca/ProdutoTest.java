package school.sptech.projeto1.heranca;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class ProdutoTest {

  @Test
  @DisplayName("getPreco(): quando acionado e produto possui valor 4.999,99 deve retornar 4.999,99")
  void getPrecoQuandoAcionadoEProdutoPossuiValor499999DeveRetornar499999() {

    Produto produto = new Produto(
            1, "Playstation 5", "videogame", 4_999.99);

    Double precoCorretoComTaxa = 4_999.99;

    assertEquals(precoCorretoComTaxa, produto.getPreco());
  }

  @Test
  @DisplayName("getPreco(): quando acionado e produto possui valor 0 deve retornar 0")
  void getPrecoQuandoAcionadoEProdutoPossuiValor0DeveRetornar0() {

    Produto produto = new Produto(
            1, "Playstation 5", "Games", 0.0);

    Double precoCorretoComTaxa = 0.0;

    assertEquals(precoCorretoComTaxa, produto.getPreco());
  }

  @Test
  @SuppressWarnings("ThrowableResultIgnored")
  @DisplayName("classe Produto deve conter getters e setters para todos os atributos")
  void produtoGetterTest() {
    List<Field> fields = Arrays.asList(Produto.class.getDeclaredFields());

    fields.forEach(field -> {

      String getter = String.format("%s%s", "get", StringUtils.capitalize(field.getName()));
      String setter = String.format("%s%s", "set", StringUtils.capitalize(field.getName()));

      assertDoesNotThrow(() -> Produto.class.getDeclaredMethod(getter));
      assertDoesNotThrow(() -> Produto.class.getDeclaredMethod(setter, field.getType()));
    });
  }
}
