package util;

public class Menu {

	public void menu() {
		System.out.println("1. Identificar a regi�o de destino de cada pacote, com totaliza��o de pacotes soma regi�o");
		System.out.println("2. Saber quais pacotes possuem c�digos de barras v�lidos e/ou inv�lidos");
		System.out.println("3. Identificar os pacotes que t�m como origem a regi�o Sul e Brinquedos em seu conte�do");
		System.out.println("4. Listar os pacotes agrupados por regi�o de destino (Considere apenas pacotes v�lidos");
		System.out.println(
				"5. Listar o n�mero de pacotes enviados por cada vendedor (Considere	apenas pacotes v�lidos");
		System.out.println(
				"6. Gerar o relat�rio/lista de pacotes por destino e por tipo (Considere	apenas pacotes v�lidos");
		System.out.println(
				"7. Se o transporte dos pacotes para o Norte passa pela Regi�o Centro-Oeste, quais s�o os pacotes que devem ser despachados no mesmo caminh�o");
		System.out.println(
				"8. Se todos os pacotes fossem uma fila qual seria a ordem de carga para o Norte no caminh�o para descarregar os pacotes da Regi�o Centro Oeste primeiro");
		System.out.println("9. No item acima considerar que as j�ias fossem sempre as primeiras a serem descarregadas");
		System.out.println("10. Listar os pacotes inv�lidos.");
		System.out.println("Digite o c�digo:");
	}
}
