package Movable;

public class MovablePoint  implements Movable{
    //Atributos
    int x;
    int y ;
    int xSpeed;
    int ySpeed;

    //Metodo Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //Sobre escritura de Metodos
    @Override
    public void moveUp() {
        this.x = this.y+1;
    }

    @Override
    public void moveDown() {
        this.x = this.y-1;
    }

    @Override
    public void moveLeft() {
        this.x = this.x-1;
    }

    @Override
    public void moveRight() {
        this.x = this.x+1;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
