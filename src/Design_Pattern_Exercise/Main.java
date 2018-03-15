package Design_Pattern_Exercise;

public class Main {

    public static void main(String[] args) {

        //Opretter to objekter og setter deres navn bagefter
        InfantryUnit hugoborge = new CrossbowMan();
        hugoborge.setName("CrowwbowMan");

        InfantryUnit mothafukka = new Musketeer();
        mothafukka.setName("Musketeer");

        //Lader de to objekter kæmpe til en af dem dør
        while(hugoborge.getHits() > 0 && mothafukka.getHits() > 0) {
            hugoborge.attack(mothafukka);
            System.out.println(hugoborge.getName() + " angreb " + mothafukka.getName() + ", som nu har " + mothafukka.getHits() + " tilbage i liv.");
            mothafukka.attack(hugoborge);
            System.out.println(mothafukka.getName() + " angreb " + hugoborge.getName() + ", som nu har " + hugoborge.getHits() + " tilbage i liv.");
        }

        //Fortæller hvem vinderen af duellen blev
        if (hugoborge.getHits() > 0) {
            System.out.println(hugoborge.getName() + " vandt kampen!");
        }
        else if (mothafukka.getHits() > 0) {
            System.out.println(mothafukka.getName() + " vandt kampen!");
        }

    }
}
