public class Palindrome {
    public static String inverse(String s) {
        int longueur = s.length();
        StringBuffer envers = new StringBuffer();
        int i;

        for (i = 0; i < longueur; i++) {
            envers.append(s.charAt(longueur - i - 1));
        }
        return new String(envers);
    }
}