package Model;

public class Codigo {
	private String pacote;
	private String valida;
	private String origem;
	private String destino;
	private String codigoLoggi;
	private String vendedor;
	private String tipoProduto;

	public Codigo(String pacote,String valida,String origem, String destino, String codigoLoggi, String vendedor, String tipoProduto) {
		this.pacote=pacote;
		this.valida=valida;
		this.origem = origem;
		this.destino = destino;
		this.codigoLoggi = codigoLoggi;
		this.vendedor = vendedor;
		this.tipoProduto = tipoProduto;
	}

	public String getPacote() {
		return pacote;
	}

	public String getValida() {
		return valida;
	}

	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}

	public String getCodigoLoggi() {
		return codigoLoggi;
	}

	public String getVendedor() {
		return vendedor;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	@Override
	public String toString() {
		return "[pacote=" + pacote + ", valida=" + valida + ", origem=" + origem + ", destino=" + destino
				+ ", codigoLoggi=" + codigoLoggi + ", vendedor=" + vendedor + ", tipoProduto=" + tipoProduto + "]";
	}

	}

