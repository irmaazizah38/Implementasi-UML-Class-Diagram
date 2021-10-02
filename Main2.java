//calculating salaried employee and hourly employee's salary in a week in dollar 
/**
 *
 * @author fresk
 */
public class Main2 {
    public static void main(String[] args) {
    
   
    SalariedEmployee se = new SalariedEmployee("irma azizah",  "05.855.081.4-412.000");    
    HourlyEmployee he = new HourlyEmployee("jane ruby","05.856.132.3-412.000" ); 
    
    se.setSalary(37440);
    he.setHourlyPayment(10);
    he.setWorkedHours(6);
    
    Employee[] employee = new Employee[2];
    employee[0] =  se;
    employee[1] =  he;

        for (Employee employee1 : employee) {
            System.out.println( employee1.payment() );
            
        }
    
    }
}
