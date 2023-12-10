package clearminds.cuentas.test;
import clearminds.cuentas.Cuenta;

public class TestCuenta {
	public static void main(String[] args) {		

		// Cuenta 1, 2 y 3
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);

		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		
		System.out.println("----- Valores iniciales ------");
		System.out.println("----- Cuenta 1 ------");
		cuenta1.imprimir();
		System.out.println("\n");
		System.out.println("----- Cuenta 2 ------");
		cuenta2.imprimir();
		System.out.println("\n");
		System.out.println("----- Cuenta 3 ------");
		cuenta3.imprimir();
		System.out.println("\n");
		
		// Modificar valores
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		
		System.out.println("----- Valores Modificados ------");
		System.out.println("----- Cuenta 1 Modificada ------");
		cuenta1.imprimir();
		System.out.println("\n");
		System.out.println("----- Cuenta 2 Modificada ------");
		cuenta2.imprimir();
		System.out.println("\n");
		System.out.println("----- Cuenta 3 Modificada ------");
		cuenta3.imprimir();
		System.out.println("\n");
		
		// Cuenta 3, 4 y 5
		
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setSaldo(10);
		
		Cuenta cuenta5 = new Cuenta("0557", "C", 10);
		
		Cuenta cuenta6 = new Cuenta("0666");
		
		System.out.println("----- Cuenta 4 ------");
		cuenta4.imprimirConMiEstilo();
		System.out.println("\n");
		System.out.println("----- Cuenta 5 ------");
		cuenta5.imprimirConMiEstilo();
		System.out.println("\n");
		System.out.println("----- Cuenta 6 ------");
		cuenta6.imprimirConMiEstilo();
	}
}
