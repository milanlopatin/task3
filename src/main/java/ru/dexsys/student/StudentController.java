package ru.dexsys.student;

import java.util.ArrayList;

public class StudentController {
    private static ArrayList<Student> students;
    public static ArrayList<Student> CreateListOfStudents(){
        students = new ArrayList<Student>();
        students.add(new Student("Pavel", "Fillipov", 21, 1234567));
        students.add(new Student("Ivan", "Petrov", 28, 6483456));
        students.add(new Student("Maksim", "Lukyanov", 23, 7696753));
        students.add(new Student("Andrey", "Bazhenov", 18, 4575467));
        students.add(new Student("Envgeniy", "Anisimov", 30, 5474743));
        students.add(new Student("Oleg", "Lukin", 20, 3467658));
        return students;
    }
}
