
public class Carta {
	private final String numero;
	private final String palo;
	private final int identificador;
	
	public Carta(String numero, String palo, int identificador) {
		this.numero = numero;
		this.palo = palo;
		this.identificador = identificador;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.numero).append(" CARTA").append(this.palo);
		return sb.toString();
	}

	public String getNumero() {
		return numero;
	}

	public String getPalo() {
		return palo;
	}

	public int getIdentificador() {
		return identificador;
	}
}
