import java.security.SecureRandom;


// TODO: Auto-generated Javadoc
/**
 * The Class Baraja. Nombre de la clase
 */
public class Baraja {
	
	/** The baraja. Guarda Carta */
	private Carta[] baraja;
	
	/** The cartaactual. Guarda la carta actual */
	private int cartaactual;
	
	/** The tipo.  Guarda tipo de baraja*/
	private TipoBaraja tipo;
	
	/** The Constant secureRandom. */
	private static final SecureRandom secureRandom = new SecureRandom();
	
	/**
	 * Instantiates a new baraja. Creamos una baraja tipo HISPANA
	 */
	public Baraja() {
		this(TipoBaraja.HISPANA);
	}
	
	/**
	 * Instantiates a new baraja.
	 *
	 * @param tipo the tipo. Descripción del método para ordernar la baraja
	 */
	public Baraja(TipoBaraja tipo) {
		this.tipo = tipo;
		this.baraja = new Carta[tipo.NUMERO_DE_CARTAS];
		this.cartaactual = 0;
		// Creamos Baraja
		for(int i=0;i<tipo.NUMERO_DE_CARTAS;i++) {
			// Carta(numero,palo)
			this.baraja[i] = new Carta(tipo.NUMEROS[i%tipo.CARTAS_POR_PALO],
					tipo.PALOS[i/tipo.CARTAS_POR_PALO],i);
		}
	}
	
	/**
	 * Barajar.
	 */
	public void barajar() {
		int posicionCartaAPermutar;
		Carta anterior;
		// Intarcambio aleatorio de posiciones de cartas
		for(int i=0;i<this.baraja.length;i++) {
			posicionCartaAPermutar = secureRandom.nextInt(this.tipo.NUMERO_DE_CARTAS);
			anterior = baraja[i];
			baraja[i] = baraja[posicionCartaAPermutar];
			baraja[posicionCartaAPermutar] = anterior;
		}
		this.cartaactual = 0;
	}
	
	
	
	/**
	 * Barajar.
	 *
	 * @param numeroVeces the numero veces
	 */
	public void barajar(int numeroVeces) {
		for(int i=0;i<numeroVeces;i++) this.barajar();
	}
	
	/**
	 * Obtener carta.
	 *
	 * @return the carta .Obtiene carta
	 */
	public Carta obtenerCarta() {
		if(this.cartaactual<baraja.length) return baraja[this.cartaactual++];
		else return null;		
	}

	/**
	 * Gets the baraja.
	 *
	 * @return the baraja. Obtiene la carta
	 */
	public Carta[] getBaraja() {
		return baraja;
	}
	
	/**
	 * obtiene la posición de la carta en la baraja.
	 *
	 * @param id the id
	 * @return the carta por identificador
	 */
	public Carta getCartaPorIdentificador(int id) {
		Carta carta = null;
		for(int i=0;i<this.baraja.length;i++) {
			if(this.baraja[i].getIdentificador()==id) {
				carta = this.baraja[i];
				break;
			}
		}
		return carta;
	}
	
	/**
	 * Gets the numero carta por identificador.
	 *
	 * @param id the id
	 * @return the numero carta por identificador
	 */
	public String getNumeroCartaPorIdentificador(int id) {
		return this.tipo.NUMEROS[id%this.tipo.CARTAS_POR_PALO];
	}
	
	/**
	 * Gets the id numero carta por identificador.
	 *
	 * @param id the id
	 * @return the id numero carta por identificador
	 */
	public int getIdNumeroCartaPorIdentificador(int id) {
		return id%this.tipo.CARTAS_POR_PALO;
	}

	/**
	 * Gets the palo carta por identificador.
	 *
	 * @param id the id
	 * @return the palo carta por identificador
	 */
	public String getPaloCartaPorIdentificador(int id) {
		return this.tipo.PALOS[id/this.tipo.CARTAS_POR_PALO];
	}

	/**
	 * Gets the id palo carta por identificador.
	 *
	 * @param id the id
	 * @return the id palo carta por identificador
	 */
	public int getIdPaloCartaPorIdentificador(int id) {
		return id/this.tipo.CARTAS_POR_PALO;
	}
}
