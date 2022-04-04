import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Model.Codigo;
import Model.ValidarDados;
import util.Menu;

public class main {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Scanner ler = new Scanner(System.in);
		File file = new File("C:\\Desenvolvimento\\Java\\DesafioLoggi\\src\\entrada.txt");
		Scanner sc = null;
		String Codigo = null;
		List<Codigo> ListaCodigos = new ArrayList<Codigo>();
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				Codigo = sc.nextLine();
				Codigo codigo = new ValidarDados().ValidarDados(Codigo);
				ListaCodigos.add(codigo);
			}
			int number;
			menu.menu();
			while ((number = ler.nextInt()) != 0) {
				menu.menu();
				switch (number) {

				case 1:
					ListaCodigos.stream().filter(c -> c.getDestino().equalsIgnoreCase("Nordeste"))
							.forEach(c -> System.out.println(c));
					break;

				case 2:
					System.out.println("-----------------------V�lidos-----------------------\n");
					ListaCodigos.stream().filter(c -> c.getValida().equalsIgnoreCase("Valido"))
							.forEach(c -> System.out.println(c));
					System.out.println("-----------------------Inv�lidos----------------------\n");
					ListaCodigos.stream().filter(c -> c.getValida().equalsIgnoreCase("inv�lido"))
							.forEach(c -> System.out.println(c));
					break;

				case 3:
					ListaCodigos.stream()
							.filter(c -> c.getOrigem().equalsIgnoreCase("Sul")
									&& c.getTipoProduto().equalsIgnoreCase("Brinquedos"))
							.forEach(c -> System.out.println(c));
					break;

				case 4:
					System.out.println("-----------------------Regiao-----------------------\n");
					System.out.println("----------------Centro-oeste-----------\n");
					ListaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getDestino().equalsIgnoreCase("Centro-oeste"))
							.forEach(c -> System.out.println(c));
					System.out.println("----------------Nordeste---------------\n");
					ListaCodigos.stream().filter(c -> c.getValida().equalsIgnoreCase("valido")
							&& c.getDestino().equalsIgnoreCase("Nordeste")).forEach(c -> System.out.println(c));
					System.out.println("----------------Norte------------------\n");
					ListaCodigos.stream().filter(
							c -> c.getValida().equalsIgnoreCase("valido") && c.getDestino().equalsIgnoreCase("Norte"))
							.forEach(c -> System.out.println(c));
					System.out.println("----------------Sudeste----------------\n");
					ListaCodigos.stream().filter(
							c -> c.getValida().equalsIgnoreCase("valido") && c.getDestino().equalsIgnoreCase("Sudeste"))
							.forEach(c -> System.out.println(c));
					System.out.println("----------------Sul--------------------\n");
					ListaCodigos.stream().filter(
							c -> c.getValida().equalsIgnoreCase("valido") && c.getDestino().equalsIgnoreCase("Sul"))
							.forEach(c -> System.out.println(c));
					System.out.println("--------------------Tipo--------------------\n");
					System.out.println("--------------------J�ias--------------------\n");
					ListaCodigos.stream().filter(c -> c.getTipoProduto().equalsIgnoreCase("J�ias")).forEach(c -> System.out.println(c));
					System.out.println("--------------------Livros--------------------\n");
					ListaCodigos.stream().filter(c -> c.getTipoProduto().equalsIgnoreCase("Livros")).forEach(c -> System.out.println(c));
					System.out.println("--------------------Eletr�nicos--------------------\n");
					ListaCodigos.stream().filter(c -> c.getTipoProduto().equalsIgnoreCase("Eletr�nicos")).forEach(c -> System.out.println(c));
					System.out.println("--------------------Bebidas--------------------\n");
					ListaCodigos.stream().filter(c -> c.getTipoProduto().equalsIgnoreCase("Bebidas")).forEach(c -> System.out.println(c));
					System.out.println("--------------------Brinquedos--------------------\n");
					ListaCodigos.stream().filter(c -> c.getTipoProduto().equalsIgnoreCase("Brinquedos")).forEach(c -> System.out.println(c));
					break;

				case 5:
					System.out.println("Digite o c�digo do vendedor");
					ler.nextLine();
					String codvendedor = ler.nextLine();
					ListaCodigos.stream().filter(c -> c.getVendedor().equalsIgnoreCase(String.valueOf(codvendedor)))
							.forEach(c -> System.out.println(c));
					break;
				case 6:
					System.out.println("-----------------------Regiao-----------------------\n");
					System.out.println("----------------Centro-oeste-----------\n");
					ListaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getDestino().equalsIgnoreCase("Centro-oeste"))
							.forEach(c -> System.out.println(c));
					System.out.println("----------------Nordeste---------------\n");
					ListaCodigos.stream().filter(c -> c.getValida().equalsIgnoreCase("valido")
							&& c.getDestino().equalsIgnoreCase("Nordeste")).forEach(c -> System.out.println(c));
					System.out.println("----------------Norte------------------\n");
					ListaCodigos.stream().filter(
							c -> c.getValida().equalsIgnoreCase("valido") && c.getDestino().equalsIgnoreCase("Norte"))
							.forEach(c -> System.out.println(c));
					System.out.println("----------------Sudeste----------------\n");
					ListaCodigos.stream().filter(
							c -> c.getValida().equalsIgnoreCase("valido") && c.getDestino().equalsIgnoreCase("Sudeste"))
							.forEach(c -> System.out.println(c));
					System.out.println("----------------Sul--------------------\n");
					ListaCodigos.stream().filter(
							c -> c.getValida().equalsIgnoreCase("valido") && c.getDestino().equalsIgnoreCase("Sul"))
							.forEach(c -> System.out.println(c));
					System.out.println("----------------Tipo--------------------\n");
					ListaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getTipoProduto().equalsIgnoreCase("J�ias"))
							.forEach(c -> System.out.println(c));
					ListaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getTipoProduto().equalsIgnoreCase("Livros"))
							.forEach(c -> System.out.println(c));
					ListaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getTipoProduto().equalsIgnoreCase("Eletr�nicos"))
							.forEach(c -> System.out.println(c));
					ListaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getTipoProduto().equalsIgnoreCase("Bebidas"))
							.forEach(c -> System.out.println(c));
					ListaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getTipoProduto().equalsIgnoreCase("Brinquedos"))
							.forEach(c -> System.out.println(c));
					break;

				case 7:
					System.out.println(
							"----------------Pacotes que vao para a regiao Norte/Centro-oeste--------------------\n");
					ListaCodigos.stream().filter(c -> c.getDestino().equalsIgnoreCase("Centro-oeste"))
							.forEach(c -> System.out.println(c));
					ListaCodigos.stream().filter(c -> c.getDestino().equalsIgnoreCase("Norte"))
							.forEach(c -> System.out.println(c));
					break;

				case 8:
					// Fila (Primeiro a entrar primeiro a sair)
					ListaCodigos.stream().filter(c -> c.getDestino().equalsIgnoreCase("Centro-oeste"))
							.forEach(c -> System.out.println(c));
					ListaCodigos.stream().filter(c -> c.getDestino().equalsIgnoreCase("Norte"))
							.forEach(c -> System.out.println(c));
					break;
				case 9:
					ListaCodigos.stream()
							.filter(c -> c.getDestino().equalsIgnoreCase("Centro-oeste")
									&& c.getTipoProduto().equalsIgnoreCase("J�ias"))
							.forEach(c -> System.out.println(c));
					ListaCodigos.stream()
							.filter(c -> c.getDestino().equalsIgnoreCase("Centro-oeste")
									&& !c.getTipoProduto().equalsIgnoreCase("J�ias"))
							.forEach(c -> System.out.println(c));
					ListaCodigos.stream()
							.filter(c -> c.getDestino().equalsIgnoreCase("Norte")
									&& c.getTipoProduto().equalsIgnoreCase("J�ias"))
							.forEach(c -> System.out.println(c));
					ListaCodigos.stream()
							.filter(c -> c.getDestino().equalsIgnoreCase("Norte")
									&& !c.getTipoProduto().equalsIgnoreCase("J�ias"))
							.forEach(c -> System.out.println(c));
					break;
				case 10:
					ListaCodigos.stream().filter(c -> c.getValida().equalsIgnoreCase("inv�lido"))
							.forEach(c -> System.out.println(c));
					break;
				}
			}
			sc.close();
			ler.close();
		} catch (IOException e) {
			System.out.println("Erro" + e.getMessage());
		}
	}
}
