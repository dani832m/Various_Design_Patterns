package Design_Pattern_Exercise;

/**
 * Main-klassen opretter objekter og udfører logikken i forhold til opgave stillet i forbindelse med design patterns.
 *
 * @author Daniel
 */
public class Main {

    public static void main(String[] args) {

        //Opretter to objekter ud fra klassen InfantryUnit og setter deres navn bagefter
        InfantryUnit hugoborge = new CrossbowMan();
        hugoborge.setName("Hugo the CrowwbowMan");

        InfantryUnit mothafukka = new Musketeer();
        mothafukka.setName("Den Glade Musketeer");

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

        System.out.println("\n------------------------------------------------------------\n");

        //Laver objektet humanfactory ud fra klassen HumanInfantryFactory
        //Vi laver med andre ord en fabrik til at "putte karakterer ind i"
        HumanInfantryFactory humanfactory = new HumanInfantryFactory();

        //Kalder metoden createUnit() på vores humanfactory
        //Vi putter altså med andre ord en karakter ind i vores factory
        humanfactory.createUnit(4);
    }
}
