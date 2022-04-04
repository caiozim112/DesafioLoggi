package Model;

public class Codigo {
	private String Pacote;
	private String valida =null;
	private String origem = null;
	private String destino;
	private String codigoLoggi;
	private String vendedor;
	private String tipoProduto;

	public Codigo(String Pacote,String valida,String origem, String destino, String codigoLoggi, String vendedor, String tipoProduto) {
		this.Pacote=Pacote;
		this.valida=valida;
		this.origem = origem;
		this.destino = destino;
		this.codigoLoggi = codigoLoggi;
		this.vendedor = vendedor;
		this.tipoProduto = tipoProduto;
	}

	public String getPacote() {
		return Pacote;
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
		return "Codigo [Pacote=" + Pacote + ", valida=" + valida + ", origem=" + origem + ", destino=" + destino
				+ ", codigoLoggi=" + codigoLoggi + ", vendedor=" + vendedor + ", tipoProduto=" + tipoProduto + "]";
	}

	}

