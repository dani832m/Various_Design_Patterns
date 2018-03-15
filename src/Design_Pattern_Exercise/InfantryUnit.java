package Design_Pattern_Exercise;

public abstract class InfantryUnit {

    //Instansvariabler
    private int range;
    private int armor;
    private int hits;
    private int damage;
    private String name;

    //Constructor med 4 parametre
    public InfantryUnit(int range, int armor, int hits, int damage){
        this.range = range;
        this.armor = armor;
        this.hits = hits;
        this.damage = damage;
    }

    //Metode der beregner skade
    public void takeDamage(int damage) {
        int reduction = (int) (Math.random()*armor);
        if(damage>reduction){
            hits = hits - (damage-reduction);
        }
    }

    //Metode der lader et objekt angribe et andet objekt og bruger "takeDamage" til at beregne skaden
    public void attack(InfantryUnit unit) {
        int attackDamage = (int) (Math.random()*damage)+1;
        unit.takeDamage(attackDamage);
    }

    //Lidt getters og setters
    public int getHits() {
        return hits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
