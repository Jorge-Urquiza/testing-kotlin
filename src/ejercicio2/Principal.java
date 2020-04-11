package ejercicio2;

public class Principal {
    public static void main(String[] args) {

        final PersonJava person = new PersonJava("JUAN", 123123);
        final PersonJava person2 = new PersonJava("JUAN", 123123);

        if (person.equals(person2)) {
            System.out.println("PERSONAS IGUALES"); // a nivel de atributos
        } else {
            System.out.println("PERSONAS NO IGUALES");
        }
        System.out.println(person);
    }
}
