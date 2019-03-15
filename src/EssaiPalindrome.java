

class EssaiPalindrome {
    public static void main(String[] arg) {
        String chaine = "aoiyioa";
        String autre = Palindrome.inverse(chaine);
        System.out.println("L'inverse de " + chaine + " est " + autre);
        if (autre.equals(chaine))
            System.out.println(chaine + " est un palindrome");
        else
            System.out.println(chaine + " n'est pas un palindrome");
    }
}