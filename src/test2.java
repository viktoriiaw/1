public class test2 {
    public static void main(String[] args) {
        String s = "111 222 333";
        String a = s.substring(0, 3);
        String v = s.substring(4, 7);
        String l = s.substring(8, 11);
        int o = Integer.parseInt(a);
        int p = Integer.parseInt(v);
        int n = Integer.parseInt(l);
        int c = o + p + n;
        System.out.println(c); // так не правильно
    }
}
