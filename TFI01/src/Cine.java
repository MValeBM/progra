public class Cine {


    public static void main(String[] args){


        Espectadores e1= new Espectadores("Valeria",35,"Fila 1", 1);
        Espectadores e2= new Espectadores("Eugenia",25,"Fila 2", 2);
        Espectadores e3= new Espectadores("Veronica",15,"Fila 3", 3);


        Sala sala01= new Sala(3,"Sala 01","Jocker");
        sala01.getP1(e1,e2,e3);





    }
}
