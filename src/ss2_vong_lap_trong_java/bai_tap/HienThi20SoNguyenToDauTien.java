package ss2_vong_lap_trong_java.bai_tap;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 0, num = 2;
        while (count < 20){
            boolean check = true;
            for (int i=2; i<=Math.sqrt(num); i++){
                if (num % i == 0){
                    check = false;
                    break;
                }
            }
            if (check){
                count++;
                System.out.println(num);
            }

            num++;
        }
    }
}
