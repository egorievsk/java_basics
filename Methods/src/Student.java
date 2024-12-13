import java.security.PublicKey;

record Student (String name, int age){

    public static final int adultAge = 18;

    public Student{
        if (age < 0) {
            System.out.println("Your created student with negative age!");
        }
    }

    public Student(String name) {
        this(name,18);
    }

    public boolean isAdult() {
        return age > adultAge;
    }

    public static Student createAdultStudent(String name) {
        return new Student(name, adultAge);
    }

}
