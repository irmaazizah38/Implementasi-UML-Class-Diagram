
/**
 *
 * @author fresk
 */
public class SalariedEmployee extends Employee {
    
    public SalariedEmployee(String name, String afm) {
        super(name, afm);
    }
    private int salary;

    public void setSalary(int s) {
        this.salary = s;
    }
    @Override  
    public int payment(){
    return (salary/52); }
    
}
