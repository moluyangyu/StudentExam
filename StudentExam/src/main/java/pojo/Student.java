package pojo;

public class Student {
    private Integer sno;
    private String sName;
    private Integer ssex;
    private String sClass;
    private String birthday;
    private Integer tag;

    public Integer getSno() {
        return this.sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getsName() {
        return this.sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getSsex() {
        return this.ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    public String getsClass() {
        return this.sClass;
    }

    public void setsClass(String sClass) {
        this.sClass = sClass;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getTag() {
        return this.tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public Student(Integer sno, String sName, Integer ssex, String sClass, String birthday, Integer tag) {
        this.sno = sno;
        this.sName = sName;
        this.ssex = ssex;
        this.sClass = sClass;
        this.birthday = birthday;
        this.tag = tag;
    }

    public String toString() {
        return "Student [sno=" + this.sno + ", sName=" + this.sName + ", ssex=" + this.ssex + ", sClass=" + this.sClass + ", birthday=" + this.birthday + ", tag=" + this.tag + "]";
    }
}


