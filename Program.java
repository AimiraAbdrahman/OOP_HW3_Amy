// Создать класс Студент
// � Создать класс УчебнаяГруппа
// � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// � Реализовать его контракты (включая удаление)

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {

        StudentGroup studentGroup1 = new StudentGroup("A", 20);
        StudentGroup studentGroup2 = new StudentGroup("B", 10);
        
        Stream stream = new Stream();

        Student van = new Student("Van", 4);
        Student igor = new Student("Igorechick", 1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);

        studentGroup1.addStudent(van);
        studentGroup1.addStudent(igor);
        studentGroup2.addStudent(alex);
        studentGroup2.addStudent(alexey);
        
        stream.addStudentGroup(studentGroup1);
        stream.addStudentGroup(studentGroup2);

        System.out.println("студенты " + studentGroup1.students);
        System.out.println("студенты " + studentGroup2.students);
        
        // Iterator<Student> iterator = new StudentGroupIterator(studentGroup);
        Iterator<StudentGroup> iterator = new StreamService(stream);

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // for(Student student: studentGroup1) {
        //     System.out.println(student);
        // }

        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        // for(StudentGroup studentGroup: stream) {
        //     System.out.println(studentGroup);
        // }

        // ArrayList<Student> arrayList = new ArrayList<>(List.of(van, igor, alex, alexey));

        ArrayList<StudentGroup> arrayList = new ArrayList<>(List.of(studentGroup1, studentGroup2));
        System.out.println(arrayList);

        // // public int compare(Student o1, Student o2) {
        // //     return o1.id - o2.id;
        // // }
        // Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id); // лямда выражение

        // // Collections.sort(arrayList, new StudentComparator()); // сортировка, второй аргумент обратная сортировка
        // System.out.println(arrayList);

        Collections.sort(arrayList, (A, B) -> A.id_group - B.id_group);
        System.out.println(arrayList);
    }

}