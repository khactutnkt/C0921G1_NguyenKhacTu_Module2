package bai_tap_cuoi_tuan_candidate.models;

public class Fresher extends Cadidate{
    private int graduation_date;
    private String graduation_rank;
    private String education;

//    public Fresher(int graduation_date, String graduation_rank, String education) {
//        this.graduation_date = graduation_date;
//        this.graduation_rank = graduation_rank;
//        this.education = education;
//    }

    public Fresher(String id, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType, int graduation_date, String graduation_rank, String education) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduation_date = graduation_date;
        this.graduation_rank = graduation_rank;
        this.education = education;
    }

    public int getGraduation_date() {
        return graduation_date;
    }

    public void setGraduation_date(int graduation_date) {
        this.graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        this.graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" +super.toString()+
                "graduation_date=" + graduation_date +
                ", graduation_rank='" + graduation_rank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
