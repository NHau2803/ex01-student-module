package com.ex01.module.student.model;//package com.ex01.module.student.model;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//@Document(collection = "course_information")
//public class CourseInformationModel {
//
//    @Id
//    private String id;
//    private String code;
//    private int yearStarted;
//    private int yearFinished;
//    private String typeOfEducation;
//    private String academicAdvisor;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public int getYearStarted() {
//        return yearStarted;
//    }
//
//    public void setYearStarted(int yearStarted) {
//        this.yearStarted = yearStarted;
//    }
//
//    public int getYearFinished() {
//        return yearFinished;
//    }
//
//    public void setYearFinished(int yearFinished) {
//        this.yearFinished = yearFinished;
//    }
//
//    public String getTypeOfEducation() {
//        return typeOfEducation;
//    }
//
//    public void setTypeOfEducation(String typeOfEducation) {
//        this.typeOfEducation = typeOfEducation;
//    }
//
//    public String getAcademicAdvisor() {
//        return academicAdvisor;
//    }
//
//    public void setAcademicAdvisor(String academicAdvisor) {
//        this.academicAdvisor = academicAdvisor;
//    }
//}