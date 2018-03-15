package Design_Pattern_Exercise;

public class HumanInfantryFactory {

    //Metode der laver et objekt baseret på hvilken techLevel, der angives
    public InfantryUnit createUnit(int techLevel) {

        InfantryUnit character;

        switch(techLevel) {
            case 1:
                character = new RockHauler();
                System.out.println("RockHauler er kreeret.");
                break;
            case 2:
                character = new SpearThrower();
                System.out.println("SpearThrower er kreeret.");
                break;
            case 3:
                character = new CrossbowMan();
                System.out.println("CrossbowMan er kreeret.");
                break;
            case 4:
                character = new Archer();
                System.out.println("Archer er kreeret.");
                break;
            case 5:
                character = new Musketeer();
                System.out.println("Musketeer er kreeret.");
            default:
                character = null;
                System.out.println("Ingen karakter er kreeret.");
                break;
        }

        return character;
    }
}