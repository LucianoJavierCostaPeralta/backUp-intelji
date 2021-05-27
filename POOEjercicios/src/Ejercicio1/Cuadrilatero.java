package Ejercicio1;

import javax.swing.*;

public class Cuadrilatero  {
    //Atributo
    private float lado1;
    private float lado2;

    //Metodos

    //Metodo constructor 1 (Cuadrilatero)

    public Cuadrilatero(float lado1 , float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Metodo constructor 2 (Cuadrado)

    public Cuadrilatero(float lado1){
        this.lado1 = this.lado2 = lado1;
    }

    //Metodo GET Permetro

    public float getPerimetro() {
        float perimetro = 2*(lado1+lado2);
        return perimetro;
    }

    //Metodo GET Area

    public float getArea (){
        float area = (lado1*lado2);
        return area;
    }


    


}
