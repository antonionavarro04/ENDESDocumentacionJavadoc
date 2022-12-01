package clases;

/**
 * En esta clase guardaremos todas los <b>constructores y funciones</b> que contiene nuestro proyecto
 * En ella también se define el atributo contador que se usara durante todos los métodos de esta clase.
 * 
 * @author Antonio Navarro
 */

public class Contador {
	/**
	 * Contador entero que se usará a lo largo de toda la clase
	 */
	private int cont;
	
	//Constructor por defecto
	/**
	 * Constructor sin ningún parámetro
	 */
	public Contador() {}
	
	//Contructor con par�metros
	/**
	 * Este constructor construye el contador según si es menor a 0 que será 0 siempre o en caso contrario tendrá el valor de cont
	 * @param cont Contador introducido por el Usuario
	 */
	public Contador(int cont) {
		if(cont<0) {
			this.cont=0;
		}else {
			this.cont=cont;
		}
	}
	
	//Constructor copia
	/**
	 * Crea una copia del contador
	 * @param c Copia creada en base al contador
	 */
	public Contador(final Contador c) {
		cont=c.cont;
	}
	
	//geter 
	/**
	 * Esta función cogerá el parámetro cont y en caso de ser menor a 0 lo pondrá a 0
	 * @param cont Contador introducido por el usuario
	 */
	public void setContador(int cont) {
		if(cont<0) {
			this.cont=0;
		}else {
			
		this.cont=cont;
		}
	}
	//setter
	/**
	 * Esta función devuelve el contador del usuario
	 * @return el contador introducido por el usuario
	 */
	public int getContador() {
		return cont;
	}
	
	//M�todo incrementar
	/**
	 * Esta función incrementa el contador en 1 sin devolver ningún valor
	 */
	public void incrementar() {
		cont++;
	}
	//M�todo decrementar
	/**
	 * Esta función decrementa el contador en 1 pero tampoco devuelve ningún parámetro, en caso de ser menor a 0 lo pondrá a 0
	 */
	public void decrementar() {
		cont--;
		if (cont<0) {
			cont=0;
		}
	}
	
	

}
