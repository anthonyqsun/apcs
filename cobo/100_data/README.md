# uwu kittens(Ivina Wang, Jaylen Zeng, Anthony Sun): lab 08

## Guidelines:
data sets: \
\
§ http://www.kaggle.com\
§ http://www.data.gov\
§ https://toolbox.google.com/datasetsearch\

\
To make a JAR available to runtime environment (JRE)...\

```
$ javac -classpath .:sinbad.jar -d . Driver.java
$ java -classpath.:sinbad.jar Driver

$ javac -classpath .:../sinbad.jar -d . Welcome01.java
$ java -classpath .:../sinbad.jar -d . Welcome01
```

411 on sinbad\
https://berry-cs.github.io/sinbad/install-java

## Our experience:
Many activities were tedious and did not require a lot of thinking; In PetInfo.java and Cereal.java we declare, initialize, and write accessor methods for too many instance variables.


## Responses
### Activity 1
1.
    * nytimes.com
    * piazza.com
2. nytimes.com collects:
    * payment information
    * ip address
3. delimited means that a file has separators to compartmentalize its data
4. you can access the first element and determine its type
5.
    * cats
    * video games
6.
    1. how many cats have short tails?
    2. how many people are playing video games at a given instant?
7.
    * https://www.statista.com/statistics/748044/number-video-gamers-world/
    * https://www.statista.com/statistics/936654/weekly-time-spent-playing-video-games-usa/
    Searched up "video game players"
8. It is behind a paywall :(
9. No, it collected our IPs and banned us from seeing the data. Now we have to pay money.

(SKIPPED REST OF QUESTIONS BECAUSE OF PAYWALL)

### Activity 2
1. Cereal
2. skipped (no question given)
3. public class Cereal
4. 15 instance variables. One for each column of the table
5. Skipped, can be found in Cereal.java
6.
    *private String name;
    *private int calories, protein, fat, sodium, sugar, potassium, vitamins, shelf;
    *private double fiber, carbohydrates, weight, cups, rating;
7. completed
8. Does a serving of All-Bran have over 100 calories?
9. Which cereal brand has the most fiber?
10. We can add a method to compare instance variables across different Cereal objects.

### Activity 3
1. The temperature at Atlanta, Hartsfield - Jackson Atlanta International Airport, GA is 65.0F
2. KCSG: The temperature at Columbus, Columbus Metropolitan Airport, GA is 63.0F
3. completed
4. 48
5. wind direction
6. KJFK for NY
7. Which station is the northernmost in a given state?
8. We need to switch a < sign to a > sign.

### Activity 4
1. What percentage of animals taken in at a given shelter were because their owner surrendered them?
2. Our data is 61 items long, and is in the form of a XML.
3. We figured out how fetchList() works, and then translated it into our own version.
4. Entries are considered to be of "Animal" type. Instance variables were chosen to match those given, so that other questions can be answered with the same data set.
5. The code is:
DataSource ds = DataSource.connect("https://data.montgomerycountymd.gov/api/views/e54u-qx42/rows.xml").load();
ArrayList<Animal> animals = ds.fetchList("Animal", "row/row/animalid", "row/row/intype",
"row/row/indate", "row/row/petname", "row/row/animaltype", "row/row/petage", "row/row/petsize",
"row/row/color", "row/row/breed", "row/row/sex");

It corresponds to the constructor of Animal.java, and was accessed thru xml indexing (e.g. row/row/petsize)
