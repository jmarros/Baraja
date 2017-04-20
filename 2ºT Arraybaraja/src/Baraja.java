import java.security.SecureRandom;


public class Baraja {
	private Carta[] baraja;
	private int cartaactual;
	private TipoBaraja tipo;
	private static final SecureRandom secureRandom = new SecureRandom();
	
	public Baraja() {
		this(TipoBaraja.HISPANA);
	}
	
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
	
	
	
	public void barajar(int numeroVeces) {
		for(int i=0;i<numeroVeces;i++) this.barajar();
	}
	
	public Carta obtenerCarta() {
		if(this.cartaactual<baraja.length) return baraja[this.cartaactual++];
		else return null;		
	}

	public Carta[] getBaraja() {
		return baraja;
	}
	
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
	
	public String getNumeroCartaPorIdentificador(int id) {
		return this.tipo.NUMEROS[id%this.tipo.CARTAS_POR_PALO];
	}
	
	public int getIdNumeroCartaPorIdentificador(int id) {
		return id%this.tipo.CARTAS_POR_PALO;
	}

	public String getPaloCartaPorIdentificador(int id) {
		return this.tipo.PALOS[id/this.tipo.CARTAS_POR_PALO];
	}

	public int getIdPaloCartaPorIdentificador(int id) {
		return id/this.tipo.CARTAS_POR_PALO;
	}
}
