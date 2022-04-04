package util;

public class Menu {

	public void menu() {
		System.out.println("1. Identificar a região de destino de cada pacote, com totalização de pacotes soma região");
		System.out.println("2. Saber quais pacotes possuem códigos de barras válidos e/ou inválidos");
		System.out.println("3. Identificar os pacotes que têm como origem a região Sul e Brinquedos em seu conteúdo");
		System.out.println("4. Listar os pacotes agrupados por região de destino (Considere apenas pacotes válidos");
		System.out.println(
				"5. Listar o número de pacotes enviados por cada vendedor (Considere	apenas pacotes válidos");
		System.out.println(
				"6. Gerar o relatório/lista de pacotes por destino e por tipo (Considere	apenas pacotes válidos");
		System.out.println(
				"7. Se o transporte dos pacotes para o Norte passa pela Região Centro-Oeste, quais são os pacotes que devem ser despachados no mesmo caminhão");
		System.out.println(
				"8. Se todos os pacotes fossem uma fila qual seria a ordem de carga para o Norte no caminhão para descarregar os pacotes da Região Centro Oeste primeiro");
		System.out.println("9. No item acima considerar que as jóias fossem sempre as primeiras a serem descarregadas");
		System.out.println("10. Listar os pacotes inválidos.");
		System.out.println("Digite o código:");
	}
}
