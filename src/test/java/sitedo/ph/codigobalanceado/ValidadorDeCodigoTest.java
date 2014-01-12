package sitedo.ph.codigobalanceado;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ValidadorDeCodigoTest {

	@Test
	public void deveRetornarTrueParaStringVazia() {

		String entrada = "";

		ValidadorDeCodigo validador = new ValidadorDeCodigo();

		Boolean saida = validador.eValido(entrada);

		assertNotNull(saida);
		assertEquals(true, saida);
	}

	@Test
	public void deveRetornarTrueParaParentesesAbertoEFechadoCorretamente() {

		String entrada = "()";

		ValidadorDeCodigo validador = new ValidadorDeCodigo();

		Boolean saida = validador.eValido(entrada);

		assertNotNull(saida);
		assertEquals(true, saida);
	}

	@Test
	public void deveRetornarTrueParaParentesesAbertoEFechadoCorretamenteComTextoEntreEles() {

		String entrada = "(xpto)";

		ValidadorDeCodigo validador = new ValidadorDeCodigo();

		Boolean saida = validador.eValido(entrada);

		assertNotNull(saida);
		assertEquals(true, saida);
	}

	@Test
	public void deveRetornarFalseParaParentesesAbrindoSemFechar() {

		String entrada = "(";

		ValidadorDeCodigo validador = new ValidadorDeCodigo();

		Boolean saida = validador.eValido(entrada);

		assertNotNull(saida);
		assertEquals(false, saida);
	}

	@Test
	public void deveRetornarFalseParaParentesesFechandoSemAbrir() {

		String entrada = ")";

		ValidadorDeCodigo validador = new ValidadorDeCodigo();

		Boolean saida = validador.eValido(entrada);

		assertNotNull(saida);
		assertEquals(false, saida);
	}

}
