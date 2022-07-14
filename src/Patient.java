import java.util.ArrayList;
import java.util.Date;


public class Patient {

    private String name,identifier;
    private Integer Age, number;
    private Date date;
    private ArrayList<String> list = new ArrayList<String>();


    public Patient (String name) {
        this.name = name;
    }

    public void setAppointment(String identifier,String name,Date date) {
        this.identifier = identifier;
        this.date = new Date();
        list.add(Integer.parseInt(String.valueOf(date)), name);
    }

    public String getAppointment() {
        String app = name + date ;
        if(list.contains(identifier)) {
            System.out.println("Hello" + name + " Your appointment is set for " + date);
        } else {
            System.out.println("no appointment set please call the front office to schedule an appointment");
        }
        return app;
    }


    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}

