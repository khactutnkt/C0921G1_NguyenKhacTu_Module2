package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stopwatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("Thời gian bắt đầu: "+stopWatch.getStartTime());
        stopWatch.start();;
        stopWatch.stop();
        System.out.println("Thời gian kết thúc: "+stopWatch.getEndTime());
        System.out.println("Thời gian đã trôi qua: "+stopWatch.getElapsedTime());
    }
}
