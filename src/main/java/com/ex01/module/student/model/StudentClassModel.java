package com.ex01.module.student.model;//package com.ex01.module.student.model;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.DBRef;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//@Document(collection = "student_class")
//public class StudentClassModel {
//    @Id
//    private String id;
//    private String code;
//    private String name;
//    @DBRef
//    private String facultyId;
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
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getFacultyId() {
//        return facultyId;
//    }
//
//    public void setFacultyId(String facultyId) {
//        this.facultyId = facultyId;
//    }
//}