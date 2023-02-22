package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        //120 이상 탑승가능
        // 삼항연산자
        int height = 121;
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result);

    }
}
