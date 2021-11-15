package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stopwatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("Thời gian bắt đầu: "+stopWatch.getStartTime());
        stopWatch.start();
        int[][] arr = new int[100000][1000];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * 100000);
            }
        }
        stopWatch.stop();
        System.out.println("Thời gian kết thúc: "+stopWatch.getEndTime());
        System.out.println("Thời gian đã trôi qua: "+stopWatch.getElapsedTime());
    }
}
