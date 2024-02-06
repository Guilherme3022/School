import people.Responsible;
import people.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Guilherme","009","47","gui","12");
        student1.consolidatedGrades(1,8);
        student1.consolidatedGrades(2,7);
        student1.consolidatedGrades(3,9);
        student1.consolidatedGrades(4,10);
        System.out.println(student1.report());
        System.out.println(student1.situation(2));

        Responsible responsible1 = new Responsible("Eduarda", "050","duda","53");
        responsible1.mensalPayments(1,true);
        responsible1.mensalPayments(2,true);
        responsible1.mensalPayments(3,true);
        responsible1.mensalPayments(4,true);
        responsible1.mensalPayments(5,true);
        responsible1.mensalPayments(6,true);
        responsible1.mensalPayments(7,true);
        responsible1.mensalPayments(8,true);
        responsible1.mensalPayments(9,true);
        responsible1.mensalPayments(10,true);
        responsible1.mensalPayments(11,true);
        responsible1.mensalPayments(12,false);
        System.out.println(responsible1.report());
        System.out.println(responsible1.situation(2));
        System.out.println(responsible1.situation(12));

    }

}