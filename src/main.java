import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Model.Codigo;
import util.Menu;
import util.ValidarDados;

public class main {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Scanner ler = new Scanner(System.in);
		File file = new File("C:\\Desenvolvimento\\Java\\DesafioLoggi\\src\\entrada.txt");//Precisa colocar o diretorio do arquivo .txt
		Scanner sc = null;
		String Codigo = null;
		List<Codigo> listaCodigos = new ArrayList<Codigo>();
		try {//Verifica se o arquivos e valido e separa ele para criar um objeto(Codigo)
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				Codigo = sc.nextLine();
				Codigo codigo = new ValidarDados().validarDados(Codigo);
				listaCodigos.add(codigo);
			}
			int number = -1;
			while (number != 0) {
				menu.menu();
				number = ler.nextInt();
				switch (number) {
				//Utilizaremos streams que sao simples e declarativas
				case 1:
					System.out.printf("Listar todos os pacotes\n");
					listaCodigos.stream().forEach(c -> System.out.println(c));
					ler.nextLine();
					System.out.printf("Digite o numero do pacote do qual deseja saber a respeito: ");
					String pacote = ler.nextLine();
					listaCodigos.stream().filter(c -> c.getPacote().equalsIgnoreCase("Pacote "+pacote))
							.forEach(c -> System.out.println(c));
					break;

				case 2:
					System.out.println("2. Saber quais pacotes possuem códigos de barras válidos e/ou inválidos");
					System.out.println("-----------------------Válidos-----------------------");
					listaCodigos.stream().filter(c -> c.getValida().equalsIgnoreCase("Valido"))
							.forEach(c -> System.out.println(c));
					System.out.println("\n-----------------------Inválidos----------------------");
					listaCodigos.stream().filter(c -> c.getValida().equalsIgnoreCase("inválido"))
							.forEach(c -> System.out.println(c));
					break;

				case 3:
					listaCodigos.stream()
							.filter(c -> c.getOrigem().equalsIgnoreCase("Sul")
									&& c.getTipoProduto().equalsIgnoreCase("Brinquedos"))
							.forEach(c -> System.out.println(c));
					break;

				case 4:
					System.out.println("4. Listar os pacotes agrupados por região de destino (Considere apenas pacotes válidos");
					System.out.println("----------------------Regiao----------------------");
					System.out.println("-------------------Centro-oeste--------------");
					listaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getDestino().equalsIgnoreCase("Centro-oeste"))
							.forEach(c -> System.out.println(c));
					System.out.println("\n-------------------Nordeste------------------");
					listaCodigos.stream().filter(c -> c.getValida().equalsIgnoreCase("valido")
							&& c.getDestino().equalsIgnoreCase("Nordeste")).forEach(c -> System.out.println(c));
					System.out.println("\n-------------------Norte---------------------");
					listaCodigos.stream().filter(
							c -> c.getValida().equalsIgnoreCase("valido") && c.getDestino().equalsIgnoreCase("Norte"))
							.forEach(c -> System.out.println(c));
					System.out.println("\n-------------------Sudeste-------------------");
					listaCodigos.stream().filter(
							c -> c.getValida().equalsIgnoreCase("valido") && c.getDestino().equalsIgnoreCase("Sudeste"))
							.forEach(c -> System.out.println(c));
					System.out.println("\n-------------------Sul-----------------------");
					listaCodigos.stream().filter(
							c -> c.getValida().equalsIgnoreCase("valido") && c.getDestino().equalsIgnoreCase("Sul"))
							.forEach(c -> System.out.println(c));
					System.out.println("--------------------Tipo---------------------");
					System.out.println("--------------------Jóias--------------------");
					listaCodigos.stream().filter(c -> c.getTipoProduto().equalsIgnoreCase("Jóias")).forEach(c -> System.out.println(c));
					System.out.println("\n-------------------Livros--------------------");
					listaCodigos.stream().filter(c -> c.getTipoProduto().equalsIgnoreCase("Livros")).forEach(c -> System.out.println(c));
					System.out.println("\n-----------------Eletrônicos-----------------");
					listaCodigos.stream().filter(c -> c.getTipoProduto().equalsIgnoreCase("Eletrônicos")).forEach(c -> System.out.println(c));
					System.out.println("\n-------------------Bebidas-------------------");
					listaCodigos.stream().filter(c -> c.getTipoProduto().equalsIgnoreCase("Bebidas")).forEach(c -> System.out.println(c));
					System.out.println("\n-------------------Brinquedos-----------------");
					listaCodigos.stream().filter(c -> c.getTipoProduto().equalsIgnoreCase("Brinquedos")).forEach(c -> System.out.println(c));
					break;

				case 5:
					System.out.println("5. Listar o número de pacotes enviados por cada vendedor");
					System.out.println("Digite o código do vendedor");
					ler.nextLine();
					String codvendedor = ler.nextLine();
					listaCodigos.stream().filter(c -> c.getVendedor().equalsIgnoreCase(String.valueOf(codvendedor)))
							.forEach(c -> System.out.println(c));
					break;
				case 6:
					System.out.println("-------------------Regiao-------------------");
					System.out.println("----------------Centro-oeste----------------");
					listaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getDestino().equalsIgnoreCase("Centro-oeste"))
							.forEach(c -> System.out.println(c));
					System.out.println("\n----------------Nordeste---------------");
					listaCodigos.stream().filter(c -> c.getValida().equalsIgnoreCase("valido")
							&& c.getDestino().equalsIgnoreCase("Nordeste")).forEach(c -> System.out.println(c));
					System.out.println("\n----------------Norte------------------");
					listaCodigos.stream().filter(
							c -> c.getValida().equalsIgnoreCase("valido") && c.getDestino().equalsIgnoreCase("Norte"))
							.forEach(c -> System.out.println(c));
					System.out.println("\n----------------Sudeste----------------");
					listaCodigos.stream().filter(
							c -> c.getValida().equalsIgnoreCase("valido") && c.getDestino().equalsIgnoreCase("Sudeste"))
							.forEach(c -> System.out.println(c));
					System.out.println("\n----------------Sul--------------------");
					listaCodigos.stream().filter(
							c -> c.getValida().equalsIgnoreCase("valido") && c.getDestino().equalsIgnoreCase("Sul"))
							.forEach(c -> System.out.println(c));
					System.out.println("\n----------------Tipo--------------------");
					System.out.println("----------------Jóias-------------------");
					listaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getTipoProduto().equalsIgnoreCase("Jóias"))
							.forEach(c -> System.out.println(c));
					System.out.println("\n---------------Livros-------------------");
					listaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getTipoProduto().equalsIgnoreCase("Livros"))
							.forEach(c -> System.out.println(c));
					System.out.println("\n--------------Eletrônicos--------------");
					listaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getTipoProduto().equalsIgnoreCase("Eletrônicos"))
							.forEach(c -> System.out.println(c));
					System.out.println("\n--------------Bebidas------------------");
					listaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getTipoProduto().equalsIgnoreCase("Bebidas"))
							.forEach(c -> System.out.println(c));
					System.out.println("\n--------------Brinquedos-----------------");
					listaCodigos.stream()
							.filter(c -> c.getValida().equalsIgnoreCase("valido")
									&& c.getTipoProduto().equalsIgnoreCase("Brinquedos"))
							.forEach(c -> System.out.println(c));
					break;

				case 7:
					System.out.println(
							"----------------Pacotes que vao para a regiao Norte/Centro-oeste--------------------");
					listaCodigos.stream().filter(c -> c.getDestino().equalsIgnoreCase("Centro-oeste"))
							.forEach(c -> System.out.println(c));
					listaCodigos.stream().filter(c -> c.getDestino().equalsIgnoreCase("Norte"))
							.forEach(c -> System.out.println(c));
					break;

				case 8:
					// Fila (Primeiro a entrar primeiro a sair)
					listaCodigos.stream().filter(c -> c.getDestino().equalsIgnoreCase("Centro-oeste"))
							.forEach(c -> System.out.println(c));
					listaCodigos.stream().filter(c -> c.getDestino().equalsIgnoreCase("Norte"))
							.forEach(c -> System.out.println(c));
					break;
				case 9:
					listaCodigos.stream()
							.filter(c -> c.getDestino().equalsIgnoreCase("Centro-oeste")
									&& c.getTipoProduto().equalsIgnoreCase("Jóias"))
							.forEach(c -> System.out.println(c));
					listaCodigos.stream()
							.filter(c -> c.getDestino().equalsIgnoreCase("Centro-oeste")
									&& !c.getTipoProduto().equalsIgnoreCase("Jóias"))
							.forEach(c -> System.out.println(c));
					listaCodigos.stream()
							.filter(c -> c.getDestino().equalsIgnoreCase("Norte")
									&& c.getTipoProduto().equalsIgnoreCase("Jóias"))
							.forEach(c -> System.out.println(c));
					listaCodigos.stream()
							.filter(c -> c.getDestino().equalsIgnoreCase("Norte")
									&& !c.getTipoProduto().equalsIgnoreCase("Jóias"))
							.forEach(c -> System.out.println(c));
					break;
				case 10:
					listaCodigos.stream().filter(c -> c.getValida().equalsIgnoreCase("inválido"))
							.forEach(c -> System.out.println(c));
					break;
				case 11:
					number =0;
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
