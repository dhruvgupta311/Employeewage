package Employee;
public class Employeewage {
    String name;
    int id;
    boolean attendence= false;

    public void attendance(boolean a){
        if(a){
            attendence = true;
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }

    Employeewage(String name, int id){
        this.name = name;
        this.id = id;
    }
}