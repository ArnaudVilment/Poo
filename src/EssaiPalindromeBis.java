public class EssaiPalindromeBis {
    public static void main(String[] args) {

        String chaine = "La chaine";



        String autre = Palindrome.inverse(chaine);
        System.out.println("L'inverse de " + chaine + " est " + autre);
        if (autre.equals(chaine))
            System.out.println(chaine + " est un palindrome");
        else
            System.out.println(chaine + " n'est pas un palindrome");
    }

    public String supEspaceChaine(String s) {
        String sSansEspace = "";

        s.concat(" ");

        return sSansEspace;
    }
}
