public class Monster {
    public int health;
    private int damage;
    
      public Monster() {
          health = (int)(Math.random()*10+15);
    }
    
    public boolean isAlive() {
      return health > 0;
    }
    public int attack(Protagonist pro){
        damage = (int) (Math.random()*10 + 5);
        pro.health = pro.health - (int) (damage*pro.vuln);
        return damage;  
    }
    
  }