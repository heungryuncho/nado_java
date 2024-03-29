package chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        Blackbox b2 = new Blackbox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println(" - 개발 전 - ");
        System.out.println(b1.modelName + " 자동 신고 기능: " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능: " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능: " + Blackbox.canAutoReport);

        // 기능 개발
        Blackbox.canAutoReport = true;

        System.out.println(" - 개발 후 - ");
        System.out.println(b1.modelName + " 자동 신고 기능: " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능: " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능: " + Blackbox.canAutoReport); // 권장 되는 방식

        // static 변수는 인스턴스변수에서 가져오는 것보다는 클래스에서 가져오는 것이 권장


    }
}
