package h2;

public class H2_main {

    public static void main(String[] args) {
        int jahr = 2100;
        boolean schalt = ((jahr%4==0) && (jahr%100!=0 || jahr%400==0));
        System.out.println("Jahr : "+jahr + "\nIst Schaltjahr : "+ schalt);
    }
}
