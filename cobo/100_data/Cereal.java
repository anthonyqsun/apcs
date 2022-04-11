/*
uwu kittens: Ivina Wang, Jaylen Zeng, Anthony Sun
APCS
LAB08 -- data
2022-04-06r
time spent: 4 hrs
*/

public class Cereal {
  private String name, type;
  private int calories, protein, fat, sodium, sugar, potassium, vitamins, shelf;
  private double fiber, carbohydrates, weight, cups, rating;

  public Cereal(){String name, String type, int calories, int protein, int fat,
    int sodium, double fiber, double carbohydrates, int sugar, int pottasium,
    int vitamins, int shelf, double weight, double cups, double rating)
}

  public String getName() {
    return name;
  }
  public String getType() {
    return type;
  }
  public int getCalories() {
    return calories;
  }
  public int getProtein() {
    return protein;
  }
  public int getFat() {
    return fat;
  }
  public int getSodium() {
    return sodium;
  }
  public int getSugar() {
    return sugar;
  }
  public int getPotassium() {
    return potassium;
  }
  public int getVitamins() {
    return vitamins;
  }
  public int getShelf() {
    return shelf;
  }
  public double getFiber() {
    return fiber;
  }
  public double getCarbohydrates() {
    return carbohydrates;
  }
  public double getWeight() {
    return weight;
  }
  public double getCups() {
    return cups;
  }
  public double getRating() {
    return rating;
  }

  public String toString(){
    String no = "";
    no += "\nName: " + name + "\nType:" + type + "\nCalories:" + calories + "\nProtein" +
    protein + "\nFat:" fat + "\nSodium:" + sodium + "\nFiber:" + fiber + "\nCarbohydrates:" +
    carbohydrates + "\nSugar:" sugar + "\nPotassium" + potassium + "\nVitamins:" vitamins + "\nShelf:" +
    shelf + "\nWeight:" weight + "\nCups:" cups + "\nRating:" rating;
    return no;
  }

  public static void main (String[] args){
    Cereal applecinnamoncheerios = new Cereal("Apple Cinnamon Cheerios", "C", 110, 2, 2, 180, 1.5, 10.5, 10, 70, 25, 1, 1, 0.75, 29.5);
    Cereal capncrunch = new Cereal("Cap'n'Crunch", "C", 120, 1, 3, 220, 0, 12, 12, 35, 25, 2, 1, 0.75, 18.1);
    Cereal cheerios = new Cereal("Cereal", "C", 110, 6, 2, 290, 2, 17, 1, 105, 25, 1, 1, 1.25, 50.8);
    Cereal cinnamontoastcrunch = new Cereal("Connamon Toast Crunch", "C", 1, 3, 210, 0, 13, 9, 45m 25, 2, 1, 0.75, 19.8);
    Cereal cocoapuffs = new Cereal("Cocoa Puffs", "C", 110, 1, 1, 180, 0, 12, 13, 55, 25, 2, 1, 1, 22.7);

    System.out.println(applecinnamoncheerios);
    System.out.println(capncrunch);
    System.out.println(cheerios);
    System.out.println(cinnamontoastcrunch);
    System.out.println(cocoapuffs);
  }
