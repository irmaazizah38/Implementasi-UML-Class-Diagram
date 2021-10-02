/**
 *
 * @author fresk
 */
public abstract class Employee {
    private String name;
     private String afm;

    public Employee(String name, String afm) {
        this.name = name;
        this.afm = afm;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String a) {
        this.afm = a;
    }    
 
    public abstract int payment();
   
}


    

