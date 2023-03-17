package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super super.메서드로 부모 클래스에 있는 동작을 수행 할 수 있음
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("---------------");
        speedCam.takePicture();
    }
}
