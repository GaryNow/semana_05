package semana_05;

public class ArregloNotas {
	// Atributo privado
	private int[] nota = {11, 10, 16, 18, 15, 13, 20, 12, 19, 17};
	// Constructor
	public ArregloNotas() {
		
	}
	// M�todo que retorne la cantidad de elementos del arreglo nota
	public int tamanio() {
		return nota.length;
	}
	// M�todo que reciba una posici�n y retorne la nota registrada en dicha posici�n
	public int obtener(int i) {
		return nota[i];
	}
	// M�todo que retorne el promedio de todas las notas.
	public double notaPromedio() {
		double sum = 0;
		for(int i = 0; i < tamanio(); i++) {
			sum += nota[i];
		}
		return sum / tamanio();
	}
	// M�todo que retorne la mayor de todas las notas.
	public int notaMayor() {
		int mayor = nota[0];
		for(int i = 0; i < tamanio(); i++) {
			if(mayor < nota[i])		mayor = nota[i];
		}
		return mayor;
	}
	// M�todo que retorne la menor de todas las notas.
	public int notaMenor() {
		int menor = nota[0];
		for(int i = 0; i < tamanio(); i++) {
			if(menor > nota[i])		menor = nota[i];
		}
		return menor;
	}
	// M�todo que retorne la cantidad de alumnos que obtuvieron de 13 a m�s.
	public int cantNotasAprobatorias() {
		int cant = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(nota[i] >= 13)		cant++;
		}
		return cant;
	}
	// M�todo que retorne la cantidad de alumnos que obtuvieron menos de 13.
	public int cantNotasDesaprobatorias() {
		int cant = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(nota[i] < 13)		cant++;
		}
		return cant;
	}
	// M�todo que retorne la cantidad de alumnos que obtuvieron m�s de 15
	public int cantNotasMayoresA15() {
		int cant = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(nota[i] > 15)		cant++;
		}
		return cant;
	}
	// M�todo que retorne la posici�n de la primera nota mayor o igual a 13. En caso no exista retorne -1.
	public int posPrimeraNotaAprobatoria() {
		for(int i = 0; i < tamanio(); i++) {
			if(nota[i] >= 13)		return i;
		}
		return -1;
	}
	// M�todo que retorne la posici�n de la pen�ltima nota menor a 13. En caso no exista retorne -1.
	public int posPenultimaNotaDesaprobatoria() {
		int posicion = 0;
		for(int i = tamanio() - 1; i >= 0; i--) { //11, 10, 16, 18, 15, 13, 20, 12, 19, 17
			if(nota[i] < 13 && ++posicion == 2)		return i;
		}
		return -1;
	}
	// M�todo que remplace las notas actuales por otras aleatorias comprendidas en el rango de 0 a 20.
	public void generarNotas() {
		for(int i = 0; i < tamanio(); i++) {
			nota[i] = aleatorio(0, 20);
		}
	}
	
	private int aleatorio(int min, int max) {
		 return (int)((max - min + 1) * Math.random()) + min;
	}
}
