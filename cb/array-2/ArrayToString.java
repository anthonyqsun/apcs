public class ArrayToString {
    public static String stringify(int[] x) {
        String out="";
        for (int y : x) {
            out+=y+", ";
        }
        return out.substring(0,out.length()-2);
    }
}
