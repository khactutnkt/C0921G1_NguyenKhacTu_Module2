package ss15_xu_ly_ngoai_le_va_debug.bai_tap.su_dung_lop_IllegalTriangleException;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        super("Giá trị cạnh tam giác không hợp lệ");
    }
    public IllegalTriangleException(String message) {
        super(message);
    }

}
