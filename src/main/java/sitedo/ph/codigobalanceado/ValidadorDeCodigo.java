package sitedo.ph.codigobalanceado;

import java.util.Stack;

public class ValidadorDeCodigo {

	private static final char ABRE_PARENTESE = '(';
	private static final char FECHA_PARENTESE = ')';

	public Boolean eValido(String entrada) {

		Stack<Character> stack = new Stack<Character>();

		if (entrada.trim().isEmpty()) {
			return true;
		}

		for (int i = 0; i < entrada.length(); i++) {

			if (entrada.charAt(i) == ABRE_PARENTESE) {
				stack.push(ABRE_PARENTESE);
			} else if (entrada.charAt(i) == FECHA_PARENTESE) {
				if (stack.isEmpty()) {
					return false;
				}
				if (stack.pop() != ABRE_PARENTESE) {
					return false;
				}
			}
		}

		return stack.isEmpty();

	}
}
