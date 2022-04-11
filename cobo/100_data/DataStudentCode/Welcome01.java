/*
uwu kittens: Ivina Wang, Jaylen Zeng, Anthony Sun
APCS
LAB08 -- data
2022-04-06r
time spent: 4 hrs
*/

import core.data.*;

public class Welcome01 {
   public static void main(String[] args) {
      String id = "KCSG";
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml");
      ds.setCacheTimeout(15 * 60);
      ds.load();
      //ds.printUsageString();
      float temp = ds.fetchFloat("temp_f");
      String loc = ds.fetchString("location");
      System.out.println("The temperature at " + loc + " is " + temp + "F");
   }
}
