public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    Fighter(String name, int damage, int health, int weight) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
    }

    int hit(Fighter foe){
        System.out.println(this.name+" "+"=>"+" "+foe.name+" "+this.damage+" "+"Hasar Vurdu.");
        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }
}
