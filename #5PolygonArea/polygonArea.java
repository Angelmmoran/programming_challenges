/*
* Creates a single function (it is important that there is only one) that is capable of
* calculating and returning the area of ​​a polygon.
* - The function will receive only ONE polygon as a parameter at a time.
* - The supported polygons will be Triangle, Square and Rectangle.
* - Prints the calculation of the area of ​​a polygon of each type.
-------------------------------------------------------------------------
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */


public class polygonArea {
       
    public static void main(String[] args) {    
        double areaTriangulo = calculateArea("triangulo", 30.6, 50.90);
        double areaCuadrado = calculateArea("cuadrado", 27, 27);
        double areaRectangulo = calculateArea("rectangulo", 29, 70.985);
       }
   
public static double calculateArea(String tipo, double parameter1, double paramenter2){
        switch(tipo){

            case "triangulo":
                System.out.println("El área del triángulo es:" + ((parameter1 * paramenter2)/2));
                return ((parameter1 * paramenter2)/2);
            case "cuadrado":
                System.out.println("El área del cuadrado es:" + parameter1*paramenter2);
                return parameter1*paramenter2;
            case "rectangulo":
            System.out.println("El área del rectángulo es:" + parameter1*paramenter2);
            return parameter1*paramenter2;
            default:
            System.err.println("Tipo de polígono erróneo");
            return -1;
            
        }
}
}
