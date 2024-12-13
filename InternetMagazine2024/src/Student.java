import java.util.Objects;

record Student (String name, int age, boolean adult) {

    public static final int adultAge = 18;

    public Student {
        if (age < 0) {
            System.out.println("Вы создали студента с отрицательным возрастом!");
        }
        if (age >= adultAge) {
            adult = true;
        } else {
            adult = false;
        }
    }

    public Student (String name) {
        this(name,18, true);
    }

    public Student (String name, int age) {
        this(name, age, true);
    }


    public boolean isAdult() {
        return age >= adultAge;
    }

    public static Student createAdultStudent(String name) {
        return new Student(name, adultAge);
    }

}
