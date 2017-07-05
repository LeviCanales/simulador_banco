package Banco;

public class Probador {

	public static void main(String[] args) {
		CajaBanco box = new CajaBanco();
		System.out.println("Logro meter?: "+box.deposita(555));
		box.p500.pila.contenedor.imprimeLista();
		box.p100.pila.contenedor.imprimeLista();
		box.p50.pila.contenedor.imprimeLista();
		box.p20.pila.contenedor.imprimeLista();
		box.p10.pila.contenedor.imprimeLista();
		box.p5.pila.contenedor.imprimeLista();
		box.p2.pila.contenedor.imprimeLista();
		box.p1.pila.contenedor.imprimeLista();
	}

}
