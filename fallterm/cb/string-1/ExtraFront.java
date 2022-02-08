public class ExtraFront {
public String extraFront(String str) {
  String x;
  int len;
  if (str.length() < 2) {
    len = str.length();
  }
  else {
    len=2;
  }
  x=str.substring(0,len);
  return x+x+x;
}

}
