package com.ex01.module.student.service;

import com.ex01.module.student.dto.StudentInformationCreateDTO;
import com.ex01.module.student.dto.StudentInformationDTO;
import com.ex01.module.student.model.StudentInformationModel;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    Page<StudentInformationModel> search(int pageStart, int pageSize);
    StudentInformationCreateDTO add(StudentInformationCreateDTO request);
    StudentInformationModel update(StudentInformationDTO request);
    boolean delete(String id);

}
