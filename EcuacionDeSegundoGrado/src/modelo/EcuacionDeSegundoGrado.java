package modelo;
/**
 * @author Anayeli May Puc
 */

public class EcuacionDeSegundoGrado {
    double a;
    double b;
    double c;
public EcuacionDeSegundoGrado(double a, double b, double c){
    this.a=a;
    this.b=b;
    this.c=c;
}
public double getCoefA(){
    return this.a;
}
public double getCoefB(){
    return this.b;
}
public double getCoefC(){
    return this.c;
}
public double getDiscriminante(){
    double Discriminante;
    Discriminante = Math.pow (b, 2) - (4 * a * c);
    return Discriminante;
}
public int getSoluciones(){
    int Raices;
    double d = getDiscriminante();
        if (d > 0){
            Raices = 2;
        }
        else if (d < 0){
    Raices = 0;
}
        else {
            Raices = 1;
        }
        return Raices;
}
public double getR1(){
    double raiz1;
    raiz1 = (-b + Math.sqrt(getDiscriminante())) / (2 * a);
    return raiz1;
}
public double getR2(){
double raiz2;
raiz2 = (-b - Math.sqrt(getDiscriminante())) / (2 * a);
return raiz2;
}

    
    }