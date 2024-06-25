import java.util.Iterator;

public class Stream implements Iterable<StudentGroup> {
    
    public static StringBuilder studentGroups = new StringBuilder();

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroups.append(studentGroup).append(" ");
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamService(this);
    }
}
