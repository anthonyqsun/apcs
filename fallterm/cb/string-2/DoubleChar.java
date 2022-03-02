public class DoubleChar {
public String doubleChar(String str) {
  String str1 = ;
  for(int i = 0; i < str.length(); i++) {
    str1 += str.substring(i,i+1);
    str1 += str.substring(i,i+1);
  }
  return str1;
}
}

