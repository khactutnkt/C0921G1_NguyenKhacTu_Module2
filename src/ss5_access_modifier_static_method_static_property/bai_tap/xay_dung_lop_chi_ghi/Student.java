package ss5_access_modifier_static_method_static_property.bai_tap.xay_dung_lop_chi_ghi;

public class Student {
    private String name= "John";
    private String Classes= "C02";

    public Student(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.Classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Classes='" + Classes + '\'' +
                '}';
    }
}
