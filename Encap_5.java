class Patient{
    private final int id;         // Immutable once set
    private String name;
    private String disease;

    // Constructor to set id (only once)
    public Patient(int id,String name, String disease) {
        this.id = id;
        this.name=name;
        this.disease=disease;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for disease
    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    void Display(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Disease : "+disease);
    }
}

public class Encap_5 {
    public static void main(String[] args) {
        Patient patient = new Patient(102," sagar ","Fever");

        patient.Display();

        patient.setName("shivam ");
        patient.setDisease("Cancer");
        
        System.out.println("Old Id : "+patient.getId());
        System.out.println("Updated Name : "+patient.getName());
        System.out.println("Updated Disease : "+patient.getDisease());

    }
    
}
