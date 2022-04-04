package util;

import Model.Codigo;

public class ValidarDados {

	public Codigo validarDados(String codigoBarras) {
		String origem = "", destino = "", codigoLoggi = "", vendedor = "", tipoProduto = "";
		String Codigo[] = codigoBarras.split(":");
		String Pacote = String.join("", Codigo[0]);
		String Codigos = String.join("", Codigo[1]);
		Codigos = Codigos.replaceAll("[\\D]", "");
		char[] numeros = Codigos.toCharArray();
		for (int i = 0; i < numeros.length; i++) {
			if (i >= 0 && i < 3) {
				origem += numeros[i];
			} else if (i >= 3 && i < 6) {
				destino += numeros[i];
			} else if (i >= 6 && i < 9) {
				codigoLoggi += numeros[i];
			} else if (i >= 9 && i < 12) {
				vendedor += numeros[i];
			} else if (i >= 12 && i < 15) {
				tipoProduto += numeros[i];
			}
		}
		origem = origemEdestino(origem);
		destino = origemEdestino(destino);
		tipoProduto = tipoProduto(tipoProduto);
		if (origem.equalsIgnoreCase("inválido") || destino.equalsIgnoreCase("inválido")
				|| tipoProduto.equalsIgnoreCase("inválido") || vendedor.equalsIgnoreCase("367")
				|| tipoProduto.equalsIgnoreCase("Jóias") && origem.equalsIgnoreCase("Centro-oeste")) {
			return new Codigo(Pacote, "inválido", origem, destino, codigoLoggi, vendedor, tipoProduto);
		}
		return new Codigo(Pacote, "valido", origem, destino, codigoLoggi, vendedor, tipoProduto);
	}

	public String origemEdestino(String number) {
		int compara = Integer.parseInt(number);

		if (compara >= 201 && compara <= 299) {
			number = "Centro-oeste";
		} else if (compara >= 300 && compara <= 399) {
			number = "Nordeste";
		} else if (compara >= 400 && compara <= 499) {
			number = "Norte";
		} else if (compara >= 1 && compara <= 99) {
			number = "Sudeste";
		} else if (compara >= 100 && compara <= 199) {
			number = "Sul";
		} else {
			number = "inválido";
		}
		return number;
	}

	public String tipoProduto(String TipoProduto) {
		if (TipoProduto.equals("001")) {
			TipoProduto = "Jóias";
		} else if (TipoProduto.equals("111")) {
			TipoProduto = "Livros";
		} else if (TipoProduto.equals("333")) {
			TipoProduto = "Eletrônicos";
		} else if (TipoProduto.equals("555")) {
			TipoProduto = "Bebidas";
		} else if (TipoProduto.equals("888")) {
			TipoProduto = "Brinquedos";
		} else {
			TipoProduto = "inválido";
		}
		return TipoProduto;
	}
}
