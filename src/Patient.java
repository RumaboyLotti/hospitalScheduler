import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Patient {

    private String name,identifier;
    private Integer Age;
    private String number;
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
        if (Age == null) {

            System.out.println("Please enter your age first");
        }
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        String allCountryRegex = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$";
        Pattern p = Pattern.compile(allCountryRegex);
        Matcher m = p.matcher(number);
        if (m.matches()) {
            System.out.println("Number is accepted");
        } else {
            System.out.println("Please Enter a number in the following format 314-111-1111");
        }
        this.number = number;
    }
}

