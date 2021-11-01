public class XYZThere.java {
public boolean xyzThere(String str) {
  if (str.length() < 3) {return false;}
  if (str.substring(0,3).equals("xyz")) {return true;}
  
  for(int i = 0; i < str.length()-3; i++) {
    if (str.substring(i,i+1).equals(".")) {continue;}
    if (str.substring(i+1,i+4).equals("xyz")) {
      return true;
    }
  }
  return false;
}
}
