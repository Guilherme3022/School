package people;

public class Student extends person {
    private String registration;
    private double[] grades = new double[4];

    public Student(String name, String id, String phone, String email, String registration, double[] grades){
        super(name, id, phone , email);
        this.registration = registration;
        this.grades = grades;
    }
    public String getRegistration(){
        return registration;
    }
    public void setRegistration(String registration){
        this.registration = registration;
    }
    public double[] getGrades(){
        return grades;
    }
    public void setGrades(double[] grades){
        this.grades = grades;
    }
    public void consolidatedGrades(int unit, double nota ){

    }
    private double finalMedia(){
        return 0;
    }

    @Override
    public String report() {
        return null;
    }

    @Override
    public String situation(int x) {
        return null;
    }
}
