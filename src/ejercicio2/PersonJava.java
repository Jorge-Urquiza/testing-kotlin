package ejercicio2;

public class PersonJava {
    private String name;
    private int age;

    public PersonJava(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //self check, comparar el objeto consigo mismo, la misma instancia.
            return true;
        } else if (obj == null) { //null check
            return false;
        } else if (getClass() != obj.getClass()) { //typep check and cast
            return false;
        }else { //field comparison
            PersonJava person = (PersonJava) obj; // cast object to person
            return this.name.equals(person.getName()) && this.age==person.getAge();
        }
    }
    @Override
    public String toString() {
        return this.name+  " - "+ this.age;
    }
}
