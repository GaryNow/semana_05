package semana_05;

public class ArregloSueldos {
	// Atributo privado
	private double[] sueldo = {2400.5, 800.4, 1500.2, 1000.3, 4700.1, 600.0, 3300.8, 2600.6, 5100.9, 2000.7};
	// Constructor
	public ArregloSueldos() {
		
	}
	// M�todo que retorne la cantidad de elementos del arreglo sueldo
	public int tamanio() {
		return sueldo.length;
	}
	// M�todo que reciba una posici�n y retorne el sueldo registrado en dicha posici�n.
	public double obtener(int i) {
		return sueldo[i];
	}
	// M�todo que retorne el promedio de todos los sueldos.
	public double sueldoPromedio() {
		double sum = 0;
		for(int i = 0; i < tamanio(); i++) {
			sum += sueldo[i];
		}
		return sum/tamanio();
	}
	// M�todo que retorne el mayor de todos los sueldos.
	public double sueldoMayor() {
		double mayor = sueldo[0];
		for(int i = 0; i < tamanio(); i++) {
			if(mayor < sueldo[i])		mayor = sueldo[i];
		}
		return mayor;
	}
	// M�todo que retorne el menor de todos los sueldos.
	public double sueldoMenor() {
		double menor = sueldo[0];
		for(int i = 0; i < tamanio(); i++) {
			if(menor > sueldo[i])		menor = sueldo[i];
		}
		return menor;
	}
	// M�todo que retorne la cantidad de empleados cuyo sueldo es mayor o igual al sueldo promedio
	public int cantMayoresSueldoPromedio() {
		int cant = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(sueldo[i] >= sueldoPromedio())			cant++;
		}
		return cant;
	}
	// M�todo que retorne la cantidad de empleados cuyo sueldo es menor al sueldo promedio.
	public int cantMenoresSueldoPromedio() {
		int cant = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(sueldo[i] < sueldoPromedio())		cant++;
		}
		return cant;
	}
	// M�todo que retorne la posici�n del segundo sueldo mayor a 850.0. En caso no exista retorne -1.
	public int posSegundoSueldoMayorAlMinimo() {
		int pos = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(sueldo[i] > 850 && ++pos == 2)	return i;	
		}
		return -1;
	}
	// M�todo que retorne la posici�n del �ltimo sueldo menor a 850.0. En caso no exista retorne -1.
	public int posUltimoSueldoMenorAlMinimo() {
		for(int i = tamanio() - 1; i >= 0; i--) {
			if(sueldo[i] < 850)		return i;
		}
		return -1;
	}
	// M�todo que remplace los sueldos actuales por otros aleatorios comprendidos en el rango de 799.9 a 4999.9 (con una cifra decimal).
	public void generarSueldos() {
		for(int i = 0; i < tamanio(); i++) {
			sueldo[i] = aleatorio(799.9, 4999.9);
		}
	}
	private double aleatorio(double min, double max) {
		 return (int)((max - min + 1) * Math.random()) + min;
	}
	
}
