package com.In;

public class MyApp {

	public static void main(String[] args) {
		Shape sh = new Shape();
		sh.draw();
		Shape sh1 = new Recatangle();
		sh1.draw();
		
		Triangle tr1 =  (Triangle) new Shape();
		tr1.draw();

	}

}
