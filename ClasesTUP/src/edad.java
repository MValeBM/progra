import javax.swing.*;

public class edad {
    public static void main(String[] args) {
        int edad;
        String nombre;


        do {
            nombre = JOptionPane.showInputDialog("Ingrese nombre");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad o 0 para salir"));

            if (edad > 18){
                System.out.println(nombre + " es mayor de edad");
            }else {
                System.out.println(nombre + " es menor de edad");
            }


        }while(edad != 0);
    }
}
