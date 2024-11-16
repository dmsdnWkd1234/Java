package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 121;
        String checkHeight = 120 <= height ? "가능" : "불가능";
        System.out.println("키가 " + height + "cm 이므로 탑승" + checkHeight + "합니다");
    }
}
