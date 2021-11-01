public class XYBalance {
public boolean xyBalance(String str) {
  for(int i = str.length()-1; i >= 0; i--) {
    if (str.substring(i,i+1).equals("y")) {break;}
    if (str.substring(i,i+1).equals("x")) {return false;}
  }
  return true;
}
}
