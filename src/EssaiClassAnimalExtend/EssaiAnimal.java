package EssaiClassAnimalExtend;

class EssaiAnimal {
    static java.util.Random alea = new java.util.Random();

    static Animal tirage()
    {
        return (Math.abs(alea.nextInt()) % 2 == 0 ? new Chien() : new Chat());
    }

    public static void main(String[] arg)
    {
        tirage().action();
    }
}