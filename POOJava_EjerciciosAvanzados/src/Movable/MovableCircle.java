package Movable;

public class MovableCircle  implements Movable{
    //Atributos
    private int radius ;
    private MovablePoint center;

    //Metodos

    //Metodo Constructor

    public MovableCircle (int x ,int y , int xSpeed , int ySpeed , int radius){
        this.radius = radius;
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    //Metodo ToString

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    //Sobre escritura de Metodos

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
