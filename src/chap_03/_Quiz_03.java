package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String s1 = "901231-1234567";
        String s2 = "030708-4567890";

        System.out.println(s1.substring(s1.indexOf("9"), s1.lastIndexOf("2")));
        System.out.println(s2.substring(0,8));
    }
}
