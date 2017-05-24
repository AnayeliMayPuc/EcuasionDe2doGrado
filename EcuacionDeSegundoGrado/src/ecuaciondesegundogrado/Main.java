package ecuaciondesegundogrado;
import modelo.EcuacionDeSegundoGrado;
/**
 * @author Anayeli May Puc 
 */

public class Main {

    public static void main(String[] args) {
        // primera ecuacion de segundo grado
    EcuacionDeSegundoGrado PrimeraEcuacion = new EcuacionDeSegundoGrado(15, 1, -12);
        System.out.println("Ecuacion de segundo grado:" + PrimeraEcuacion.getDiscriminante());
        System.out.println("Raiz cuadrada = " + PrimeraEcuacion.getSoluciones());
        System.out.println("a= " + PrimeraEcuacion.getR1());
        System.out.println("b= " + PrimeraEcuacion.getR2());
        
        // segundaa ecuacion de segundo grado
    EcuacionDeSegundoGrado SegundaEcuacion = new EcuacionDeSegundoGrado(10, -48, -900);
        System.out.println("Ecuacion de segundo grado: " + SegundaEcuacion.getDiscriminante());
        System.out.println("RaicesCuadradas: " + SegundaEcuacion.getSoluciones());
        System.out.println("c= " + SegundaEcuacion.getR1());
        System.out.println("d= " + SegundaEcuacion.getR2());
        
        // tercera ecuacion de segundo grado
    EcuacionDeSegundoGrado TerceraEcuacion = new EcuacionDeSegundoGrado(18, -3, -25);
        System.out.println("Ecuacion de segundo grado: " + TerceraEcuacion.getDiscriminante());
        System.out.println("Raiz cuadrada = " + TerceraEcuacion.getSoluciones());
        System.out.println("e= " + TerceraEcuacion.getR1());
        System.out.println("f= " + TerceraEcuacion.getR2());
    }
    
}


