import java.util.LinkedList;
import java.util.Queue;

public class Doctor {
    private String name;
    private int patientCount ;
    private float Shift;
    private Queue<String> patientQue = new LinkedList<>();
    public Doctor (String name) {this.name = name;}

    public String getDoctor () {
        return this.name;
    }



}
