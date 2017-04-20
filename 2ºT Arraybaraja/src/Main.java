
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baraja b = new Baraja(TipoBaraja.POKER);
		int id = 36;
		System.out.println(b.getCartaPorIdentificador(id));
		System.out.println(b.getIdNumeroCartaPorIdentificador(id));
		System.out.println(b.getNumeroCartaPorIdentificador(id));
		System.out.println(b.getPaloCartaPorIdentificador(id));
		System.out.println(b.getIdPaloCartaPorIdentificador(id));


	}

}
