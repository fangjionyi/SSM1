package net.togogo.bean;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 方炯翊
 * Date: 2018-09-08
 * Time: 2:37
 */
public class Student {
 private int stuId;
 private String stuName;
 private String stuSex;
 private int stuAge;

    public Student() {
    }

    public Student(int stuId, String stuName, String stuSex, int stuAge) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
