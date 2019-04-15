public class SubString {
    private static void parse() {
        String s = "111 222 333";
        int space1Index = s.indexOf(' ');
        String sub111 = s.substring(0, space1Index);

        s = s.substring(space1Index + 1);
        int spase2Index = s.indexOf(' ');
        String sub222 = s.substring(0, spase2Index);

        s = s.substring(spase2Index + 1);
        String sub333 = s.substring(0, spase2Index);

        System.out.println(Integer.parseInt(sub111)
                + Integer.parseInt(sub222)
                + Integer.parseInt(sub333));
    }
}

