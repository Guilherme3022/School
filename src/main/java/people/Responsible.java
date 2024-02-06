package people;

import java.util.ArrayList;

public class Responsible extends person {
    private boolean[] payments = new boolean[12];

    public Responsible(String name, String id, String email, String phone) {
        super(name, id, email, phone);
    }
    public boolean[] getPayments(){
        return payments;
    }
    public void setPayments(boolean[] payments){
        this.payments = payments;
    }


    public boolean mensalPayments (int month,boolean situation){
        payments[month-1] = situation;
        return situation;
    }

    @Override
    public String situation(int month) {
        if (month >= 1 && month <= 12) {
            if (getPayments()[month - 1]) {
                return "payment already made in the month " + month;
            } else {
                return "payment not made in the month " + month;
            }
        } else {
            return "Invalid month index: " + month;
        }
    }

    public String convertsListOnString(ArrayList<Integer> list){
        String resultado ="";
        for(int l : list){
            resultado +=l+", ";
        }
        return resultado;
    }
    public String paymentsMade(){
        ArrayList<Integer> paidMonths = new ArrayList<Integer>();
        for (int month =1; month < payments.length;month++){
            if(payments[month-1]){
                paidMonths.add(month);
            }
        }return convertsListOnString(paidMonths);
    }
    @Override
    public String report() {
        return getName()+ "\nData:\nID:" +getId() + "\nEMAIL:" + getEmail()+"\nPHONE:"+getPhone()+ "\nPAID MONTHS:"+ paymentsMade();
    }
}
