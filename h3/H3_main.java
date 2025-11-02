package h3;

public class H3_main {

    public static void main(String[] args) {
        int max = 8;
        int fix = 5;
        int wartend = 2;
        System.out.println("\nmax     : "+ max + "\nfix     : "+ fix + "\nwartend : "+ wartend);
        // kind of works | Integer Overflow not solved
        boolean istVoll = ((fix = (fix+wartend<=max) ? (fix+wartend + (wartend = 0)) : (max + (wartend = fix + wartend - max) - (wartend)))==max);
        System.out.println("\nmax     : "+ max + "\nfix     : "+ fix + "\nwartend : "+ wartend + "\n\nistVoll : "+ istVoll);
    }
}
