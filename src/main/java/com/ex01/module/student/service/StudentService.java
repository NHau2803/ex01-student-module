package com.ex01.module.student.service;

import com.ex01.module.student.dto.StudentInformationCreateDTO;
import com.ex01.module.student.dto.StudentInformationDTO;
import com.ex01.module.student.model.StudentInformationModel;
import org.springframework.data.domain.Page;

public interface StudentService {
    Page<StudentInformationModel> search(int pageNo, int pageSize);
    StudentInformationModel add(StudentInformationCreateDTO request);
    StudentInformationModel update(StudentInformationDTO request);
    boolean delete(String id);

}
