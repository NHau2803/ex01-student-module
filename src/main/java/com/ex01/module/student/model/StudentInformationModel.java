package com.ex01.module.student.model;

import com.ex01.module.student.enums.GenderType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "student_information")
public class StudentInformationModel {
    @Id
    private String id;
    private String code;
    private String name;
    private GenderType gender;
    private long birthday;
    private String email;
    private String phone;
    private String avatar;
    private String idCard;
    private String homeTown;
    private String currentAddress;
//    @DBRef
//    private String facultyId;
//    @DBRef
//    private String studentClassId;
//    @DBRef
//    private String courseInformationId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

//    public String getFacultyId() {
//        return facultyId;
//    }
//
//    public void setFacultyId(String facultyId) {
//        this.facultyId = facultyId;
//    }
//
//    public String getStudentClassId() {
//        return studentClassId;
//    }
//
//    public void setStudentClassId(String studentClassId) {
//        this.studentClassId = studentClassId;
//    }
//
//    public String getCourseInformationId() {
//        return courseInformationId;
//    }
//
//    public void setCourseInformationId(String courseInformationId) {
//        this.courseInformationId = courseInformationId;
//    }
}