package Ventana;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public  JPanel panel;

    //Metodo Constructor

    public Ventana()  {

        //Establecemos el tamañp de la ventana
        this.setSize(500,500);

        //El programa finalice al cerrar la ventana emergente
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Establecemos el titulo
        this.setTitle("El mejor Titulo ");

        //Establecemos la posicion inicial de la ventana
        //this.setLocation(100,200);


        //Este metodo engloba a "setSize" y "setLocation"
        //this.setBounds(100,200,500,500);


        //Centrar la ventan en el centro
        this.setLocationRelativeTo(null);


        //Establecemos si la ventan puede cambiar de tamaño o no
        //this.setResizable(false);

        //Establecemos el tamaño minimo
        this.setMinimumSize(new Dimension(200,200));

        //Establecer el color de la ventana
        //this.getContentPane().setBackground(Color.GREEN);

        iniciarComponentes();//LLamamos al metodo
    }

    private void  iniciarComponentes (){

        colocarPaneles();

       // colocarEtiqueta();

       // colocarBotones();

        //colocarRadioBotobes();

      //  colocarBotonesDeActivacion();
       // colocarCajasDeTextos ();

        colocarAreasDeTexto ();
    }

    private void colocarPaneles (){
        panel = new JPanel();//Cremos el panel

        this.getContentPane().add(panel);//Agregamos el panel a la ventana


        //Estamos desactivando el Diseño
        panel.setLayout(null);

        //Establecemos color al panel
        // panel.setBackground(Color.ORANGE);
    }

    private void colocarEtiqueta (){

        JLabel etiqueta = new JLabel();//Creamos la etiqueta

        etiqueta.setText("Mundial 2018");//Establecemos el texto de la etiqueta

        //Establecemos la alineacion Horizontal del Texto
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);

        //Establecemos las medidas de nuestra Etiqueta
        etiqueta.setBounds(85,10,300,80);

        //Establecemos el color de nuestra etiqueta
        etiqueta.setForeground(Color.black);

        //Cambiar el Color de la etiqueta
        etiqueta.setBackground(Color.GREEN);

        //Establecemos puntar el Fondo de La etiqueta
        etiqueta.setOpaque(true);

        //Establecemos la funte del Texto
        etiqueta.setFont(new Font("Cooper black",Font.PLAIN,40));


        panel.add(etiqueta);//Agregamos la etiqueta al panel


        //Etiqueta tipo Imagen
        ImageIcon imagen = new ImageIcon("C:\\Users\\lucho dj\\Pictures\\balonMundial2018.jpg");
        JLabel etiqueta2 = new JLabel();

        etiqueta2.setBounds(80,90,300,300);

        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(300,300,Image.SCALE_SMOOTH)));

        panel.add(etiqueta2);
    }


    private void colocarBotones(){
       //Boton 1 . Boton de texto
        JButton boton = new JButton();

        boton.setText("Click");//Establecemos un texto al boton

        boton.setBounds(100,100,100,40);

        boton.setEnabled(true);//Hanilitar o desactivar el boton

        boton.setMnemonic('a');//Establecemos alt + letra a eleccion . Para dar click

        boton.setForeground(Color.BLUE);//Establecemos el color de la letra del boton

        boton.setFont(new Font("cooper Black",3,20));//Estavlecemos las caracteristicas de la letra

        panel.add(boton);

        //Boton 2 boton de Imagen
        JButton boton2 = new JButton();

        boton2.setBounds(100,200,100,40);

        ImageIcon clickAqui = new ImageIcon("C:\\Users\\lucho dj\\IdeaProjects\\Ventana\\boton.png");

        boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));

      //  boton2.setBackground(Color.CYAN);

        panel.add(boton2);

        //Boton 3 - Boton de Bordes

        JButton boton3 = new JButton();

        boton3.setBounds(100,300,110,50);

        boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN,3,true));

        panel.add(boton3);
    }

    private  void colocarRadioBotobes(){
        JRadioButton radioBoton1 = new JRadioButton("",true );
        radioBoton1.setBounds(50,100,200,50);
        radioBoton1.setEnabled(true);
        radioBoton1.setText("Programación");
        radioBoton1.setFont(new Font("cooper black",0,20));

        panel.add(radioBoton1);

        JRadioButton radioBoton2 = new JRadioButton("Opeción 2",false );
        radioBoton2.setBounds(50,150,100,50);
        panel.add(radioBoton2);

        JRadioButton radioBoton3 = new JRadioButton("Opeción 3",false );
        radioBoton3.setBounds(50,200,100,50);
        panel.add(radioBoton3);


        //Grupo de Botones
        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(radioBoton1);
        grupoBotones.add(radioBoton2);
        grupoBotones.add(radioBoton3);

    }

    private void colocarBotonesDeActivacion(){
        JToggleButton botonActivacion1 = new JToggleButton("Opcion 1 ",false);
        botonActivacion1.setBounds(50,100,100,40);
        panel.add(botonActivacion1);

        JToggleButton botonActivacion2 = new JToggleButton("Opcion 2 ",false);
        botonActivacion2.setBounds(50,150,100,40);
        panel.add(botonActivacion2);

        JToggleButton botonActivacion3 = new JToggleButton("Opcion 3 ",false);
        botonActivacion3.setBounds(50,200,100,40);
        panel.add(botonActivacion3);

        ButtonGroup grupoBotonesActivacion = new ButtonGroup();
        grupoBotonesActivacion.add(botonActivacion1);
        grupoBotonesActivacion.add(botonActivacion2);
        grupoBotonesActivacion.add(botonActivacion3);


    }

    private  void colocarCajasDeTextos(){

        JTextField cajaTexto = new JTextField();

        cajaTexto.setBounds(50,50,200,30);

        cajaTexto.setText("Hola .. ");

        System.out.println("Caja de Texto "+cajaTexto.getText());

        panel.add(cajaTexto);
    }

    private  void colocarAreasDeTexto(){
        
    }
}
