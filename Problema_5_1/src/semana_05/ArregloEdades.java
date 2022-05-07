package semana_05;

public class ArregloEdades {
	// Atributo privado
	private int[] edad = {27, 22, 13, 12, 25, 11, 29, 70, 15, 21};
	// Constructor
	public ArregloEdades() {
		
	}
	// M�todo que retorne la cantidad de elementos del arreglo edad.
	public int tamanio() {
		return edad.length;
	}
	// M�todo que reciba una posici�n y retorne la edad registrada en dicha posici�n.
	public int obtener(int i) {
		return edad[i];
	}
	// M�todo que retorne el promedio de todas las edades
	public double edadPromedio() {
		double suma = 0;
		for(int i =0; i < tamanio(); i++) {
			suma += edad[i];
		}
		return suma/tamanio();
	}
	// M�todo que retorne la mayor de todas las edades.
	public int edadMayor() {
		int mayor = edad[0];
		for(int i = 0; i < tamanio(); i++) {
			if(mayor < edad[i])		mayor = edad[i];
		}
		return mayor;
	}
	// M�todo que retorne la menor de todas las edades.
	public int edadMenor() {
		int menor = edad[0];
		for(int i = 0; i < tamanio(); i++) {
			if(menor > edad[i])		menor = edad[i];
		}
		return menor;
	}
	// M�todo que retorne la cantidad de personas mayores de edad.
	public int cantMayoresEdad() {
		int cantMay = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(edad[i] >= 18)		cantMay++;
		}
		return cantMay;
	}
	// M�todo que retorne la cantidad de personas menores de edad.
	public int cantMenoresEdad() {
		int cantMen = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(edad[i] < 18)		cantMen++;
		}
		return cantMen;
	}
	// M�todo que retorne la posici�n de la primera edad encontrada en el rango de 12 a 20 a�os. En caso no exista retorne -1.
	public int posPrimeraEdadAdolescente() {
		for(int i = 0; i < tamanio(); i++) {
			if(edad[i] >= 12 && edad[i] <= 20)	return i;
		}
		return -1;
	}
	// M�todo que retorne la posici�n de la �ltima edad encontrada en el rango de 12 a 20 a�os. En caso no exista retorne -1.
	public int posUltimaEdadAdolescente() {
		for(int i = tamanio() - 1; i >= 0; i--) {
			if(edad[i] <= 20 && edad[i] >= 12)	return i;
		}
		return -1;
	}
	// M�todo que remplace las edades actuales por otras aleatorias comprendidas en el rango de 10 a 90 a�os. Haga uso del m�todo:
	public void generarEdades() {
		for(int i = 0; i < tamanio(); i++) {
			edad[i] = aleatorio(10, 90);
		}
	}
	private int aleatorio(int min, int max) {
		 return (int)((max - min + 1) * Math.random()) + min;
	}

}
