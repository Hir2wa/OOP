public class Person {
    int age;
    String name;

    public void display() {
        System.out.println("age: " + age + " name: " + name);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.age = 15;
        person.name = "fabrice";
        person.display();
    }
}

    
