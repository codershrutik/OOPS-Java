public class EnhancedPlayer{

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name){
        this(name,100,"sword");
    }
    
    private EnhancedPlayer(Dtring name, int health, String weapon){
        this.name = name;
        this.weapon = weapon;
        if(health<=0){
            this.health = 1;
        } else if(health>100){
            this.health = 10;;
        } else{
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        if(health<=0){
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining(){
        return health;
    }

    public void restoreHealth(int extraHealth){
        
        health = health+extraHealth;
        if(health>100){
            System.out.println("Player restored to 100%");
            health = 100%;
        }
    }
}