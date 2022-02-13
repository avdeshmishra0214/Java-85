package co.edureka.pack1;

import co.edureka.pack2.Nums;

public class PackTest {

	public static void main(String[] args) {
		System.out.println("Package Example");
		//co.edureka.pack2.Nums obj = new co.edureka.pack2.Nums();
		Nums obj = new Nums();
		
		obj.add(10,20);;
		System.out.println("Diff = " + obj.sub(10f, 20f));
	}

}
