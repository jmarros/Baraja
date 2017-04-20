public enum TipoBaraja {
	HISPANA(0),POKER(1);
	
	public final String[] NUMEROS;
	public final String[] PALOS;
	public final int NUMERO_DE_CARTAS;
	public final int CARTAS_POR_PALO;

	
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
