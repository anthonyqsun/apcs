/*
uwu kittens: Ivina Wang, Jaylen Zeng, Anthony Sun
APCS
LAB08 -- data
2022-04-06r
time spent: 4 hrs
*/

import core.data.*;
import java.util.ArrayList;

public class PetInfo {
  public static void main(String[] args) {
    DataSource ds = DataSource.connect("https://data.montgomerycountymd.gov/api/views/e54u-qx42/rows.xml").load();
    ArrayList<Animal> animals = ds.fetchList("Animal", "row/row/animalid", "row/row/intype",
    "row/row/indate", "row/row/petname", "row/row/animaltype", "row/row/petage", "row/row/petsize",
    "row/row/color", "row/row/breed", "row/row/sex");
    System.out.println("Total animals: " + animals.size());

    int ownerSurrenderCount = 0;
    for (Animal animal : animals) {
      if (animal.getIntype().equals("OWNER SUR")) {
        ownerSurrenderCount++;
      }
    }
    System.out.println("The percentage of animals taken in because its owner surrendered them is: " + (int) (100*ownerSurrenderCount/animals.size()) + "%");
  }
}
