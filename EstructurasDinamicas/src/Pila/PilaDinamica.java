package Pila;

public class PilaDinamica {

    private Nodo<T> top ;
    private int tamanio ;

    public PilaDinamica (){

        top = null ;
        this.tamanio = 0 ;

    }


  public boolean isEmpry (){
        return top == null;

  }

  public int side (){
        return this.tamanio;

  }

  public T top (){

      if (isEmpry()) {
          return null;
      }else {
          return top.getElemento();
      }
    }

  public T pop () {
      if (isEmpry()) {
          return null;
      }else {
          T elemento = top.getElemento();




          return  elemento;
      }
  }

  public void  push (T elemento ){

  }



  public String toString (){

  }


}
