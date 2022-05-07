package semana_05;

public class ArregloPrecios {
	// Atributo privado
	private double[] precio = {240.5, 350.2, 80.4, 100.3, 470.1, 60.0, 330.8, 260.6, 510.9, 200.7};
	// Constructor
	public ArregloPrecios() {
		
	}
	// M�todo que retorne la cantidad de elementos del arreglo precio.
	public int tamanio() {
		return precio.length;
	}
	// M�todo que reciba una posici�n y retorne el precio registrado en dicha posici�n
	public double obtener(int i) {
		return precio[i];
	}
	// M�todo que retorne el promedio de todos los precios.
	public double precioPromedio() {
		double sum = 0;
		for(int i = 0; i < tamanio(); i++) {
			sum += precio[i];
		}
		return sum / tamanio();
	}
	// M�todo que retorne el mayor de todos los precios.
	public double precioMayor() {
		double mayor = precio[0];
		for(int i = 0; i < tamanio(); i++) {
			if(mayor < precio[i])		mayor = precio[i];
		}
		return mayor;
	}
	// M�todo que retorne el menor de todos los precios.
	public double precioMenor() {
		double menor = precio[0];
		for(int i = 0; i < tamanio(); i++) {
			if(menor > precio[i])		menor = precio[i];
		}
		return menor;
	}
	// M�todo que retorne la cantidad de productos cuyo precio es mayor o igual al precio promedio
	public int cantMayoresPrecioPromedio() {
		int cantidad = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(precio[i] >= precioPromedio())	cantidad++;
		}
		return cantidad;
	}
	// M�todo que retorne la cantidad de productos cuyo precio es menor al precio promedio
	public int cantMenoresPrecioPromedio() {
		int cantidad = 0;
		for(int i = 0; i < tamanio(); i++) {
			if(precio[i] < precioPromedio())		cantidad++;
		}
		return cantidad;
	}
	// M�todo que retorne la posici�n del primer precio mayor al segundo de los precios. En caso no exista retorne -1.
	public int posPrimerPrecioMayorAlSegundo() {
		for(int i = 0; i < tamanio(); i++) {
			if(precio[i] > precio[1])		return i;
		}
		return -1;
	}
	// M�todo que retorne la posici�n del �ltimo precio menor al pen�ltimo de los precios. En caso no exista retorne -1.
	public int posUltimoPrecioMenorAlPenultimo() {
		for(int i = tamanio() - 1; i >= 0; i-- ) {
			if(precio[i] < precio[tamanio() - 2])		return i;
		}
		return -1;
	}
	// M�todo que remplace los precios actuales por otros aleatorios comprendidos en el rango de 99.9 a 999.9 (con una cifra decimal).
	public void generarPrecios() {
		for(int i = 0; i < tamanio(); i++) {
			precio[i] = aleatorio(99.9, 999.9);
		}
	}

	private double aleatorio(double min, double max) {
		 return (int)((max - min + 1) * Math.random()) + min;
	}
}
