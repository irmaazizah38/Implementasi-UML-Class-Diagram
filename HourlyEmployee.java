/**
 *
 * @author fresk
 */
public class HourlyEmployee extends Employee {
    
    public HourlyEmployee(String name, String afm) {
        super(name, afm);
    }
    private int hoursWorked;
     private int hourlyPayment;

    public int getWorkedHours() {
        return hoursWorked;
    }

    public void setWorkedHours(int hw) {
        this.hoursWorked = hw;
    }

    public int getHourlyPayment() {
        return hourlyPayment;
    }

    public void setHourlyPayment(int hp) {
        this.hourlyPayment = hp;
    }
     
    @Override
    public int payment(){
    return (hoursWorked*hourlyPayment)*7;
    } 
    
}
