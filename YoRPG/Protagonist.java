public class Protagonist {
    public int health;
    private int damage;
    public double vuln;
    private String name;
    
    public Protagonist(String name) {
      health = 100;
      this.name = name;
    }
    
    public String getName() {
      return name;
    }
    
    public boolean isAlive() {
      return health > 0;
    }
    
    public int attack(Monster mon) {
      mon.health = mon.health - damage;
      return damage;
    }
    
    public void specialize() {
      vuln = 1.3;
      damage = (int) (Math.random()*10 + 10);
    }
    
    public void normalize() {
      vuln=1;
      damage = (int) (Math.random()*10 + 5);
    }
  }