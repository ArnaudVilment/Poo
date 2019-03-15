class TestEleve {
    public static void main(String[] arg) {

        String t[] = {"arnaud", "5", "14", "18"};
        Eleve eleve = new Eleve(t[0]);
        for (int i = 1; i < t.length; i++) {
            eleve.ajouterNote(Integer.parseInt(t[i]));
            System.out.println("Moyenne de " + eleve.getNom() +
                    " : " + eleve.getMoyenne());
        }
        System.out.println(eleve);
    }
}