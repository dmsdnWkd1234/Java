package chap_01;
/*노원09번 버스
약 3분 후 도착
남은 거리 1.2km*/
public class _Quiz_01 {
    public static void main(String[] args) {
//        버스 번호 (1234, 노원09)
        String busName = "노원09";
//                남은 시간 (3분, 5분)
        int time = 3;
//                남은 거리 (1.5km, 0.6km)
        float distance = 1.2f;

        System.out.println(busName + "번 버스");
        System.out.println("약 " + time + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
