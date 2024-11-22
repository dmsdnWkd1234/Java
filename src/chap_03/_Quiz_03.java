package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String man = "901231-1234567";
        String woman = "030708-4567890";

        System.out.println(man.substring(0,8));
        System.out.println(woman.substring(0,woman.indexOf("-") + 2));
    }
}
