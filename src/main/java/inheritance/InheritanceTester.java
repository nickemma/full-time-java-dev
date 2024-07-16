package inheritance;

public class InheritanceTester {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Techie Emma");
        System.out.println("My name is: " + person.getName());
        Employee employee = new Employee();
        employee.setTitle("Software Developer");
        System.out.println("I am a " + employee.getTitle());
    }
}
