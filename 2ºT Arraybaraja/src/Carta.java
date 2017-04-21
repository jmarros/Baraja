
// TODO: Auto-generated Javadoc
/**
 * The Class Carta.
 */
public class Carta {
	
	/** The numero. Almacena  */
	private final String numero;
	
	/** The palo. */
	private final String palo;
	
	/** The identificador. */
	private final int identificador;
	
	/**
	 * Instantiates a new carta.
	 *
	 * @param numero the numero describe 
	 * @param palo the palo
	 * @param identificador the identificador
	 */
	public Carta(String numero, String palo, int identificador) {
		this.numero = numero;
		this.palo = palo;
		this.identificador = identificador;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString() referencia a otro metodo de la clase
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.numero).append(" CARTA").append(this.palo);
		return sb.toString();
	}

	/**
	 * Gets the numero.
	 *
	 * @return devuelve el numero de carta
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Gets the palo.
	 *
	 * @return devuelve el palo de la carta
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 * Gets the identificador.
	 *
	 * @return devuelve el identificador
	 */
	public int getIdentificador() {
		return identificador;
	}
}
