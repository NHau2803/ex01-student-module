package com.ex01.module.student.enums;

public enum GenderType {
    Male, Female, None;

    public static Boolean isGenderType(String gender){

        GenderType[] genderModels = GenderType.values();
        for(GenderType genderModel : genderModels){
            if(genderModel.name().equals(gender)){
                return true;
            }
        }
        return false;
    }

    public static String toString(GenderType gender){
        return gender.toString();
    }

    public static GenderType toEnum(String gender){
        GenderType[] genderModels = GenderType.values();
        for(GenderType genderModel : genderModels){
            if(genderModel.name().equals(gender)){
                return genderModel;
            }
        }
        return None;
    }

}
