package LimitDecimalNombre.AdditionnerTriEntier;

public class addTriEntier {

    public static void main(String[] args) {

        String[] tEntier = {"5", "-1", "8", "-3", "12", "20", "-12"};
        int somme = 0;

        for(int i = 0; i < tEntier.length; i++) {

            somme = somme + Integer.parseInt(tEntier[i]);
        }
        System.out.println("La somme est de : " + somme);

        // Tri du tableau
        String tampon = "0";
        boolean b;

        do {
            b = false;
            for (int i = 0; i < tEntier.length - 1; i++) {

                if (Integer.parseInt(tEntier[i]) > (Integer.parseInt(tEntier[i + 1]))) {

                    tampon = tEntier[i];
                    tEntier[i] = tEntier[i + 1];
                    tEntier[i + 1] = tampon;
                    b = true;
                }
            }
        } while (b);

        for (int i = 0; i < tEntier.length - 1; i++) {
            System.out.println(tEntier[i]);
        }
    }
}
