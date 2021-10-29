package ss2_vong_lap_trong_java.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        for (int n=2; n<100; n++){
            boolean check = true;
            for (int i=2; i<=Math.sqrt(n); i++){
                if (n%i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.println(n);
            }
        }
    }
}
