package ru.dexsys.student;

public class Student {
    private static int counter;
    private static int studentId;
    private String firstName;
    private String lastName;
    private int age;
    private long phone;

    public Student(String firstName, String lastName, int age, long phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.studentId = ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Student.counter = counter;
    }

    public static void setStudentId(int studentId) {
        Student.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public Student() {
        this.firstName = null;
        this.lastName = null;
        this.age = 0;
        this.phone = 0;
        this.studentId = ++counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                '}';
    }
}
