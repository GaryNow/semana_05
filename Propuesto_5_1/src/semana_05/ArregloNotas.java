package semana_05;

public class ArregloNotas {
	// Atributo privado
	private int[] nota = {11, 10, 16, 18, 15, 13, 20, 12, 19, 17};
	// Constructor
	public ArregloNotas() {
		
	}
	// Método que retorne la cantidad de elementos del arreglo nota
	public int tamanio() {
		return nota.length;
	}
	// Método que reciba una posición y retorne la nota registrada en dicha posición
	public int obtener(int i) {
		return nota[i];
	}
	// Método que retorne el promedio de todas las notas.
	public double notaPromedio() {
		double sum = 0;
		for(int i = 0; i < tamanio(); i++) {
			sum += nota[i];
		}
		return sum / tamanio();
	}
	// Método que retorne la mayor de todas las notas.
	public int notaMayor() {
		int mayor = nota[0];
		for(int i = 0; i < tamanio(); i++) {
			if(mayor < nota[i])		mayor = nota[i];
		}
		return mayor;
	}
	// Método que retorne la menor de todas las notas.
	public int notaMenor() {
		int menor = nota[0];
		for(int i = 0; i < tamanio(); i++) {
			if(menor > nota[i])		menor = nota[i];
		}
		return menor;
	}
	// Método que retorne la cantidad de alumnos que obtuvieron de 13 a más.
	public int cantNotasAprobatorias() {
		int cant = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(nota[i] >= 13)		cant++;
		}
		return cant;
	}
	// Método que retorne la cantidad de alumnos que obtuvieron menos de 13.
	public int cantNotasDesaprobatorias() {
		int cant = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(nota[i] < 13)		cant++;
		}
		return cant;
	}
	// Método que retorne la cantidad de alumnos que obtuvieron más de 15
	public int cantNotasMayoresA15() {
		int cant = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(nota[i] > 15)		cant++;
		}
		return cant;
	}
	// Método que retorne la posición de la primera nota mayor o igual a 13. En caso no exista retorne -1.
	public int posPrimeraNotaAprobatoria() {
		for(int i = 0; i < tamanio(); i++) {
			if(nota[i] >= 13)		return i;
		}
		return -1;
	}
	// Método que retorne la posición de la penúltima nota menor a 13. En caso no exista retorne -1.
	public int posPenultimaNotaDesaprobatoria() {
		int posicion = 0;
		for(int i = tamanio() - 1; i >= 0; i--) { //11, 10, 16, 18, 15, 13, 20, 12, 19, 17
			if(nota[i] < 13 && ++posicion == 2)		return i;
		}
		return -1;
	}
	// Método que remplace las notas actuales por otras aleatorias comprendidas en el rango de 0 a 20.
	public void generarNotas() {
		for(int i = 0; i < tamanio(); i++) {
			nota[i] = aleatorio(0, 20);
		}
	}
	
	private int aleatorio(int min, int max) {
		 return (int)((max - min + 1) * Math.random()) + min;
	}
}
