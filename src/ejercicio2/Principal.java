package ejercicio2;

public class Principal {
    public static void main(String[] args) {

         PersonJava person = new PersonJava("JUAN", 123123);
         PersonJava person2 = new PersonJava("JUAN", 123123);
        if(person.getName() == person2.getName() && person.getAge() == person2.getAge() ){
            System.out.println("OBJETOS IGAULES"); // a nivel de atributos
        }else{
            System.out.println("OBJETOS NO IGAULES");
        }

    }
}
