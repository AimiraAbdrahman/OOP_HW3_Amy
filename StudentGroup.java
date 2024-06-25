import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {

    String name;
    int count;
    public int id_group;

    public StringBuilder students = new StringBuilder();

    public StudentGroup(String name, int id_group) {
        this.name = name;
        this.id_group = id_group;
    }

    public void addStudent(Student student) {
        students.append(student).append(" ");
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
