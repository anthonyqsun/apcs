public class CatDog {
public boolean catDog(String str) {
  int catCtr = 0;
  int dogCtr = 0;
  
  for (int i = 0; i < str.length()-2; i++) {
    if (str.substring(i,i+3).equals("dog")) {dogCtr++;}
    if (str.substring(i,i+3).equals("cat")) {catCtr++;}
  }

  return catCtr==dogCtr;
}
}
