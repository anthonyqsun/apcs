/*
uwu kittens: Ivina Wang, Jaylen Zeng, Anthony Sun
APCS
LAB08 -- data
2022-04-06r
time spent: 4 hrs
*/

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name",
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      System.out.println("Stations in " + state);

      WeatherStation lowest = allstns.get(0);
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
           lowest = ws;
           break;
         }}
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            System.out.println("  " + ws.getId() + ": " + ws.getName() + " at latitude: " + ws.getLatitude());
            if (ws.getLatitude() < lowest.getLatitude()){
              lowest = ws;
            }
         }

      }
      System.out.println("The southernmost weather station in " + state + " is " + lowest.getId());

   }
}
