package people;

public class Student extends person {
    final int unit = 4 ;
    private String registration;
    private double[] grades = new double[unit];

    public Student(String name, String id, String phone, String email, String registration){
        super(name, id, phone , email);
        this.registration = registration;
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
    public void consolidatedGrades(int unit, double grade ){
        grades[unit - 1] = grade;

    }
    private double finalMedia(){
        double sumOfGrades = 0;
        for (double grade : grades)
            sumOfGrades +=grade;
        return sumOfGrades/unit;

    }
    private int defineUnit(int mouth){
        if(mouth>=1 && mouth<=3){
            return 1;
        }else if(mouth>=4 && mouth<=6){
            return 2;
        }else if(mouth>=7 && mouth<=9){
            return 3;
        }else if(mouth>=10 && mouth<=12){
            return 4;
        }else {
            return 0;
        }
    }
    @Override
    public String report() {
        return getName()+ "\nData:\nID:" +getId() + "\nEMAIL:" + getEmail()+"\nPHONE:"+getPhone()+ "\nREGISTRATION:"
                + getRegistration()+"\nFINAL MEDIA:"+finalMedia() + "\n";
    }

    @Override
    public String situation(int x) {
        int currentUnit = defineUnit(x);
        if (getGrades()[currentUnit-1] >= 7 ){
            return "the student achieved above average in the unit" +currentUnit+ "with the grade: "+getGrades()[currentUnit-1] + "\n";
        }else {
            return "below average in this unit" + "\n";
        }
    }
}
