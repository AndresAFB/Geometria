public class testGeometria {
	public static void main (String[] args){
	
	double cuadrado = Geometria.areaCuadrado(5);
	System.out.println("EL área del cuadrado es " + cuadrado);
	
	double triangulo = Geometria.areaTriangulo(3,9);
	System.out.println("EL área del triángulo es " + triangulo);
	
	double rectangulo = Geometria.areaRectangulo(5,3);
	System.out.println("EL área del rectángulo es " + rectangulo);
	
	double circulo = Geometria.areaCirculo(6);
	System.out.println("EL area del círculo es " + circulo);
	}
}
