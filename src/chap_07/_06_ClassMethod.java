package chap_07;

public class _06_ClassMethod {
    public static void main(String[] args) {
//        Blackbox b1 = new Blackbox();
//        b1.callServiceCenter();
//
//        Blackbox b2 = new Blackbox();
//        b2.callServiceCenter();

        Blackbox.callServiceCenter();

        // static variable은 객체가 만들어지지 않고도 쓸수있다.
        // 인스턴스 변수는 객체를 만들지 않으면 쓸 수 없다

        String s = String.valueOf(3);
    }
}
