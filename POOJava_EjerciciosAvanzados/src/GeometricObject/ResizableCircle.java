package GeometricObject;

public class ResizableCircle extends Circle implements GeometricObject {

    //Metodos

    //Metodo Constructor
    public ResizableCircle(double radius) {
        super(radius);
    }

    //Sobre escritura de Metodos
    @Override
    public double resize(int percent) {

        return this.radius=this.radius-(this.radius*percent)/100;

    }
}
