package p3;

public class P3_main {
    public static void main(String[] args) {

        // 1.
        int a1;
        System.out.println("A1: Betrag von " + (a1 = -34) + " ist " + ((a1>=0) ? a1 : -a1) + ".");

        // 2.
        int a2;
        System.out.println("A2: " + (a2 = 4) * a2 + " ist Quadratzahl von " + a2 + ".");

        // 3.
        int a3;
        System.out.println("A3: " + (((a3 = 3)%2==0) ? (a3 + " ist gerade.") : (a3 + " ist ungearade.")));

        // Values of variables
        System.out.println("A1: " + a1 + "\nA2: " + a2 + "\nA3: " + a3);
    }
}
