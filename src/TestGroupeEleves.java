public class TestGroupeEleves {

    public static void main(String[] args) {

        String e1[] = {"arnaud", "5", "14", "18"};
        String e2[] = {"lionel", "15", "14", "18"};

        Eleve eleve1 = new Eleve(e1[0]);
        for (int i = 1; i < e1.length; i++) {
            eleve1.ajouterNote(Integer.parseInt(e1[i]));
            System.out.println("Moyenne de " + eleve1.getNom() +
                    " : " + eleve1.getMoyenne());
        }

        Eleve eleve2 = new Eleve(e2[0]);
        for (int i = 1; i < e2.length; i++) {
            eleve2.ajouterNote(Integer.parseInt(e2[i]));
            System.out.println("Moyenne de " + eleve2.getNom() +
                    " : " + eleve2.getMoyenne());
        }

        GroupeEleves gE = new GroupeEleves();
        gE.ajouterEleve(eleve1);
        gE.ajouterEleve(eleve2);

        gE.getListe();
    }
}
