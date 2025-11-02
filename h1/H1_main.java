package h1;

import java.lang.Math;

public class H1_main {
    
    public static void main(String[] args) {
        double guthaben = 10;
        double monEingang = 4;
        int rating = 0;
        boolean warnhinweis = false;
        boolean negativ = false;

        if(guthaben < 0) {
            // being in debt
            negativ = true;
            if(monEingang>=Math.abs(guthaben)) {
                // being even after paycheck
                rating++;
            } else {
                // being not even after paycheck
                rating--;
                warnhinweis = (rating<0); // money and cycle(time) dependend warning of depts
            }
        } else if (guthaben > 0) {
            // being in positive
            negativ = false;
            rating+=3;
        } else if (guthaben == 0) {
            // being even
            negativ = false;
            rating+=2;
        }
        System.out.println("Guthaben : "+ guthaben);
        System.out.println("Einkommen : " + monEingang);
        System.out.println("Liquditätsrating : " + rating);
        System.out.println("Schuldenwarnung : " + warnhinweis);
        System.out.println("Schulden : " + negativ);
    }
}
