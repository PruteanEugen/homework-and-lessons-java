public class HospitalApp {
    public static void main(String[] args) {
   // Employeee e1 = new Employeee("Joe Depth", (byte)10);
    Doctor doctor1 = new Doctor("Mark", (byte)20, "Cardiology");
    Nurse nurse1 = new Nurse("Mia", (byte) 10, "Certified");
        System.out.println(doctor1);
        System.out.println(nurse1);
    }
}
// Classes that describe nurses, doctors, staff
abstract class Employeee{ // abstract class - can not be created the objects directly from this class// Example Employeee e1 = new Employeee("Joe Depth", (byte)10);//
    private String name;
    private byte expirience;

    //Implicit constuctor {default constroctor}
    // required constructor for Java
    public Employeee(){

    }
    //Constructor
    public Employeee(String name, byte expirience) {
        setName(name);
        setExpirience(expirience);
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3){
            System.out.println("The name is less that 3 Characters");}
    else{
        this.name = name;
    }
    }

    public byte getExpirience() {
        return expirience;
    }

    @Override
    public String toString() {
        return "Employeee{" +
                "name='" + name + '\'' +
                ", expirience=" + expirience +
                '}';
    }

    public void setExpirience(byte expirience) {
        if(expirience < 0 || expirience > 60){
            System.out.println("The experience is not between 0..60");
        } else {
            this.expirience = expirience;
        }

    }
} class Doctor extends Employeee{
    private String speciality;

    public Doctor(String name, byte experience, String speciality){
        super(name, experience); // Constructor delegation
        setSpeciality(speciality);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Doctor{" + "name='" + getName() + '\'' + ", expirience=" + getExpirience() + ", "+" speciality='" + speciality + '\'' + '}';
    }
}
class Nurse extends Employeee{
    private String type;

    public Nurse (String name, byte experience, String type){
        super (name, experience);
        setType(type);
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Nurse{" + "name='" + getName() + '\'' + ", expirience=" + getExpirience() + ", " + "type='" + type+'\'' +'}';
    }
}