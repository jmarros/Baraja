// TODO: Auto-generated Javadoc
/**
 * The Enum TipoBaraja.
 */
public enum TipoBaraja {
	
	/** The hispana. */
	HISPANA(0),
/** The poker. */
POKER(1);
	
	/** The numeros. Almacena Numeros */
	public final String[] NUMEROS;
	
	/** The palos. Almacena PALOS*/
	public final String[] PALOS;
	
	/** The numero de cartas. Numero de Cartas */
	public final int NUMERO_DE_CARTAS;
	
	/** The cartas por palo. Cartas por Palo */
	public final int CARTAS_POR_PALO;

	
	/**
	 * Inicializamos las variables 
	 *
	 * @param tipo the tipo
	 */
	private TipoBaraja(int tipo) {
		switch(tipo) {
		case 0:
			this.NUMEROS = new String[]{"Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Sota","Caballo","Rey"};
			this.PALOS = new String[] {"Oros","Copas","Espadas","Bastos"};
			this.NUMERO_DE_CARTAS = 40;
			this.CARTAS_POR_PALO = 10;
			break;
		case 1:
			this.NUMEROS = new String[]{"Uno","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
			this.PALOS = new String[] {"Hearts","Diamonds","Spades","Clubs"};
			this.NUMERO_DE_CARTAS = 52;
			this.CARTAS_POR_PALO = 13;
			break;
		default:
			this.NUMEROS = new String[]{};
			this.PALOS = new String[] {};
			this.NUMERO_DE_CARTAS = 10;
			this.CARTAS_POR_PALO = 10;
			break;					
		}
	}
	}
