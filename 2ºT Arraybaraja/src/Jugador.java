
// TODO: Auto-generated Javadoc
/**
 * The Class Jugador.
 * @author Rafael Gonzalez Escobar
 */
public class Jugador extends Object {

	/** Almacena el nombre de la persona. */
	private String nombre;
	
	/** Almacena el apellido de la persona. */
	private String apellido;


	/**
	 * Inicializamos las variables de instancia de la clase Persona.
	 *
	 * @param Asigna nombre a nombre
	 * @param Asigna apellido a apellido
	 */
	public Jugador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	/**
	 * Inicializamos las variables de instancia de la clase Jugador.
	 *
	 * @param Le pasamos un objeto creado de Jugador
	 */
	public Jugador(Jugador persona) {
		this.nombre = persona.getNombre();
		this.apellido = persona.getApellido();
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		final String endLine = "\n";
		sb.append("Nombre: "+nombre).append(endLine)
			.append("Apellidos: "+apellido).append(endLine);
		
		return sb.toString();
	}
	
	/**
	 * Gets the nombre.
	 *
	 * @return el nombre del Jugador
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param  establecemos el nombre del Jugador
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Gets the apellido.
	 *
	 * @return el apellido del Jugador
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Sets the apellido.
	 *
	 * @param establecemos el apellido del Jugador
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}