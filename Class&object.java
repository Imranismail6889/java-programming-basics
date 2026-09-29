class Student {
    String name;
    int age;
    double cgpa;
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Imran";
        student1.age = 20;
        student1.cgpa = 7.5;
        student1.displayDetails();
    }
}
