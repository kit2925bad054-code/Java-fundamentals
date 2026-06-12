public class str {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "1234";

        int sum = 0;

        for (int i = 0; i < s2.length(); i++) {
            sum = sum + (s2.charAt(i));
        }

        System.out.println(s2 + " " + sum);
    }
}
