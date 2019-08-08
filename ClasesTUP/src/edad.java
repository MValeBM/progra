import javax.swing.*;

public class edad {
    public static void main(String[] args) {
        int edad;
        String nombre;
        int num;

        do {
            nombre = JOptionPane.showInputDialog("Ingrese nombre");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
            System.out.print(nombre + " tiene " + edad + " años");
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 0 para salir o cualquier otro numero para continuar"));

        }while(num != 0);
    }
}
