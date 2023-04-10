import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course math101 = new Course("Math 101", 1);
        Course english101 = new Course("English 101", 2);

        Student alice = new Student("Alice");
        alice.enroll(math101);
        alice.enroll(english101);
        alice.enroll(math101);

        alice.printEnrollments();

        alice.withdraw(math101);
        alice.withdraw(math101);

        alice.printEnrollments();

        Student bob = new Student("Bob");
        bob.enroll(math101);
        bob.enroll(english101);

        bob.printEnrollments();
    }
}

class Course {
    private String name;
    private int capacity;
    private List<Student> students;

    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumStudents() {
        return students.size();
    }

    public boolean isFull() {
        return getNumStudents() >= capacity;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enroll(Course course) {
        if (course.isFull()) {
            System.out.println(course.getName() + " is full.");
            return;
        }
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void withdraw(Course course) {
        if (courses.contains(course)) {
            courses.remove(course);
            course.removeStudent(this);
        }
    }

    public void printEnrollments() {
        System.out.println(name + "'s enrollments:");
        for (Course course : courses) {
            System.out.println(course.getName());
        }
        System.out.println();
    }
}
