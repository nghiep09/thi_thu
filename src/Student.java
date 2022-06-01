public class Student {
    private String msv;
    private String name;
    private int age;
    private String sex;
    private String address;
    private double mediumScore;

    public Student() {

    }

    public Student(String msv, String name, int age, String sex, String address, double mediumScore) {
        this.msv = msv;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.mediumScore = mediumScore;
    }

    public Student(String msv, String name, int age, String sex, String address, String mediumScore, Student st) {

    }

    public Student(String msv, String name, int age, String sex, String address, String mediumScore) {

    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "msv='" + msv + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", mediumScore=" + mediumScore +
                '}';
    }

    public String write() {
        return msv + "," +
                 name + "," +
                age + ", " + sex + "," +
                 address + "," +
                mediumScore ;
    }
}
