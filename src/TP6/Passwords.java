package TP6;

import java.util.Scanner;

public class Passwords {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Selecciona la cantidad de passwords que quieres crear:");
        int amount = scan.nextInt();
        System.out.println("Selecciona el largo con el que se crearan");
        int length = scan.nextInt();
        Generate[] password = new Generate[amount];

        for(int i=0 ; i<amount ; i++) {
            password[i] = new Generate(length);
        }

        System.out.println("Estas son las Passwords generadas:");


        for (int i=0 ; i<amount ; i++){ //Prints the password then returns it's safety level.
            System.out.print(password[i].getPass()+ password[i].getLength());
            if (password[i].getSafety()){
                System.out.println("\t Esta es segura");
            }
            else   System.out.println("\tEsta no es segura");
        }
        scan.close();
    }
}
