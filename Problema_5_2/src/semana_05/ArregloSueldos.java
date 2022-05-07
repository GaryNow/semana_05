package semana_05;

public class ArregloSueldos {
	// Atributo privado
	private double[] sueldo = {2400.5, 800.4, 1500.2, 1000.3, 4700.1, 600.0, 3300.8, 2600.6, 5100.9, 2000.7};
	// Constructor
	public ArregloSueldos() {
		
	}
	// Método que retorne la cantidad de elementos del arreglo sueldo
	public int tamanio() {
		return sueldo.length;
	}
	// Método que reciba una posición y retorne el sueldo registrado en dicha posición.
	public double obtener(int i) {
		return sueldo[i];
	}
	// Método que retorne el promedio de todos los sueldos.
	public double sueldoPromedio() {
		double sum = 0;
		for(int i = 0; i < tamanio(); i++) {
			sum += sueldo[i];
		}
		return sum/tamanio();
	}
	// Método que retorne el mayor de todos los sueldos.
	public double sueldoMayor() {
		double mayor = sueldo[0];
		for(int i = 0; i < tamanio(); i++) {
			if(mayor < sueldo[i])		mayor = sueldo[i];
		}
		return mayor;
	}
	// Método que retorne el menor de todos los sueldos.
	public double sueldoMenor() {
		double menor = sueldo[0];
		for(int i = 0; i < tamanio(); i++) {
			if(menor > sueldo[i])		menor = sueldo[i];
		}
		return menor;
	}
	// Método que retorne la cantidad de empleados cuyo sueldo es mayor o igual al sueldo promedio
	public int cantMayoresSueldoPromedio() {
		int cant = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(sueldo[i] >= sueldoPromedio())			cant++;
		}
		return cant;
	}
	// Método que retorne la cantidad de empleados cuyo sueldo es menor al sueldo promedio.
	public int cantMenoresSueldoPromedio() {
		int cant = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(sueldo[i] < sueldoPromedio())		cant++;
		}
		return cant;
	}
	// Método que retorne la posición del segundo sueldo mayor a 850.0. En caso no exista retorne -1.
	public int posSegundoSueldoMayorAlMinimo() {
		int pos = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(sueldo[i] > 850 && ++pos == 2)	return i;	
		}
		return -1;
	}
	// Método que retorne la posición del último sueldo menor a 850.0. En caso no exista retorne -1.
	public int posUltimoSueldoMenorAlMinimo() {
		for(int i = tamanio() - 1; i >= 0; i--) {
			if(sueldo[i] < 850)		return i;
		}
		return -1;
	}
	// Método que remplace los sueldos actuales por otros aleatorios comprendidos en el rango de 799.9 a 4999.9 (con una cifra decimal).
	public void generarSueldos() {
		for(int i = 0; i < tamanio(); i++) {
			sueldo[i] = aleatorio(799.9, 4999.9);
		}
	}
	private double aleatorio(double min, double max) {
		 return (int)((max - min + 1) * Math.random()) + min;
	}
	
}
