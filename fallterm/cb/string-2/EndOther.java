public class EndOther {
public boolean endOther(String a, String b) {
  if (a.length() > b.length()) {
    return (a.substring(a.length()-b.length())).toLowerCase().equals(b.toLowerCase());
  }
  else {
    return (b.substring(b.length()-a.length())).toLowerCase().equals(a.toLowerCase());
  }
}
}
