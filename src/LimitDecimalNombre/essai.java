package LimitDecimalNombre;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

class Essai {
    public static void main(String[] arg) {
        double d = -1114.123456789;
        String sD = String.valueOf(d);

        /*DecimalFormat f = new DecimalFormat();
        f.setMaximumFractionDigits(2);*/

        String result = tronqueDecimal2(sD,2);
        System.out.println(d + " avec deux decimales : " + result);


        //System.out.println(d + " avec deux decimales : " + f.format(d));
        //System.out.printf("et aussi\n%f avec deux decimales : %.2f\n", d, d);
    }

    public static String tronqueDecimal(String chaine, int nbDecimales) {

        String avant;
        String apres;

        StringTokenizer st = new StringTokenizer(chaine,".");
        avant = st.nextToken();
        if (st.hasMoreTokens()) apres = st.nextToken();
        else return avant;

        if (apres.length() <= nbDecimales) return chaine;
        return chaine.substring(0, chaine.length() -
                apres.length() + nbDecimales);
    }

    public static String tronqueDecimal2(String chaine, int nbDecimales) {

        System.out.println(chaine);

        String[] tab = chaine.split("\\.");
        System.out.println(tab[0]);
        if(tab.length < 2) {
           return chaine;
        } else {
            if(tab[1].length() <= nbDecimales){
                return chaine;
            }else{
                return chaine.substring(0, tab[0].length() + 1 + nbDecimales );
            }
        }
    }
}