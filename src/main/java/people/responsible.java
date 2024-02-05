package people;

public class responsible extends person {
    private boolean[] payments = new boolean[12];

    public responsible(String name, String id, String email, String phone, boolean[] payments) {
        super(name, id, email, phone);
        this.payments = payments;
    }
    public boolean[] getPayments(){
        return payments;
    }
    public void setPayments(boolean[] payments){
        this.payments = payments;
    }


    public boolean mensalPayments (int month,boolean situation){
        return false;
    }

    @Override
    public String situation(int x) {
        return null;
    }

    @Override
    public String report() {
        return null;
    }
}
