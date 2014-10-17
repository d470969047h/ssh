package com.shinowit.entity;

import javax.persistence.*;

/**
 * Created by daihui on 2014/10/16.
 */
@Entity
@Table(name = "studentInfo")
public class StudentInfoEntity {
    private int stuNumb;
    private String stuName;
    private String nativePlace;
    private String phone;

    @Id
    @Column(name = "stuNumb")
    public int getStuNumb() {
        return stuNumb;
    }

    public void setStuNumb(int stuNumb) {
        this.stuNumb = stuNumb;
    }

    @Basic
    @Column(name = "stuName")
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Basic
    @Column(name = "nativePlace")
    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentInfoEntity that = (StudentInfoEntity) o;

        if (stuNumb != that.stuNumb) return false;
        if (nativePlace != null ? !nativePlace.equals(that.nativePlace) : that.nativePlace != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (stuName != null ? !stuName.equals(that.stuName) : that.stuName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stuNumb;
        result = 31 * result + (stuName != null ? stuName.hashCode() : 0);
        result = 31 * result + (nativePlace != null ? nativePlace.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
