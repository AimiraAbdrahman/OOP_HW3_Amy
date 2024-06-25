import java.util.Iterator;

public class StreamService implements Iterator<StudentGroup>{

    private int index = 0;

    public StreamService(Stream stream) {
    }

    private StudentGroup[] getStudentGroups() {
        String[] groupNames = Stream.studentGroups.toString().split(" ");
        StudentGroup[] studentGroups = new StudentGroup[groupNames.length];

        int count = 0;
        for(String name: groupNames) {
            studentGroups[count] = new StudentGroup(name, count);
            count++;
        }
        // System.out.println(Arrays.toString(names));
        return studentGroups;
    }

    @Override
    public boolean hasNext() {
        return index < getStudentGroups().length;
    }

    @Override
    public StudentGroup next() {
        StudentGroup[] studentGroups = getStudentGroups();
        return studentGroups[index++];
    }
}
