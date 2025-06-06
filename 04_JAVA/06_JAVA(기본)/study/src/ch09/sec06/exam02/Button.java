package ch09.sec06.exam02;

public class Button {
    // 중첩 인터페이스 생성
    public static interface ClickListener {
        // 추상 메소드
        void onClick();
    }
    // 필드
    private ClickListener clickListener;
    // 메소드
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
}
