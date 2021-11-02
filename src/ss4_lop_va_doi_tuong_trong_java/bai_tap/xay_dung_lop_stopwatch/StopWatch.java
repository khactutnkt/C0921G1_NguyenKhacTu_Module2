package ss4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stopwatch;

public class StopWatch {
    private long startTime, endTime;
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return this.startTime;
    }
    public long getEndTime() {
        return this.endTime;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
