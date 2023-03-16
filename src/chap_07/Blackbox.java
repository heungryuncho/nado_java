package chap_07;

public class Blackbox {
    String modelName; // 모델명
    String resolution; // 해상도
    int price; // 가격
    String color; // 색상
    static boolean canAutoReport = false; // 자동 신고 기능

    Blackbox(){
        System.out.println("기본 생성자 호출");
    }

    Blackbox(String modelName, String resolution, int price, String color) {
        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

    void  autoReport(){
        if(canAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");

        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        } else if (type == 2) {
            return 1;
        }
        return 10;
    }

    // showDateTime: 날짜정보 표시여부
    // showSpeed: 속도정보 표시여부
    // min: 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        // 위에 정의된 record메서드 값을 불러와서 기본값을 적용해서 쓸 수 있음
        record(true, true,  5);
    }

    static void callServiceCenter(){
        System.out.println("서비스 센터(1588-0000)로 연결합니다.");
    }

    void appendModelName(String modelName) {
        this.modelName += modelNa me;
        // this는 클래스가 가진 인스턴스 변수를 지정
    }
}
