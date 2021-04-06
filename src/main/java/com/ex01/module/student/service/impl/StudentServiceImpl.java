package com.ex01.module.student.service.impl;

import com.ex01.module.student.dto.StudentInformationCreateDTO;
import com.ex01.module.student.dto.StudentInformationDTO;
import com.ex01.module.student.enums.GenderType;
import com.ex01.module.student.model.StudentInformationModel;
import com.ex01.module.student.repository.StudentInformationRepository;
import com.ex01.module.student.service.StudentService;
import com.ex01.module.student.utils.date.DateConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private DateConverter dateConverter;
    @Autowired
    private StudentInformationRepository studentInformationRepository;

    private Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Override
    public Page<StudentInformationModel> search(int pageStart, int pageSize) {
        Pageable pageable = PageRequest.of(pageStart - 1, pageSize);
        return studentInformationRepository.findAll(pageable);
        // need extra!
    }

    @Override
    public StudentInformationCreateDTO add(StudentInformationCreateDTO request) {

        StudentInformationModel studentInformationModel = new StudentInformationModel();
        studentInformationModel.setCode(request.getCode());
        studentInformationModel.setName(request.getName());
        studentInformationModel.setGender(
                GenderType.toEnum(request.getGender())
        );
        try {
            studentInformationModel.setBirthday(
                    dateConverter.toTimestamp(request.getBirthday())
            );
        } catch (ParseException e) {
            logger.error("StudentService call DateConverter: {}",e);
        }

        studentInformationModel.setEmail(request.getEmail());
        studentInformationModel.setPhone(request.getPhone());
        studentInformationModel.setAvatar(request.getAvatar());
        studentInformationModel.setIdCard(request.getIdCard());
        studentInformationModel.setCurrentAddress(request.getCurrentAddress());
        studentInformationModel.setHomeTown(request.getHomeTown());

        System.out.println(studentInformationModel);
        studentInformationRepository.save(studentInformationModel);
        logger.info("StudentService: add success!");

        return request;
    }

    @Override
    public StudentInformationModel update(StudentInformationDTO request) {

        String id = request.getId();
        StudentInformationModel studentUpdate = studentInformationRepository.findById(id).orElse(null);
        if (studentUpdate == null) {
            logger.error("StudentService: {} not found.", id);
            return null;
        }
        studentUpdate.setCode(request.getCode());
        studentUpdate.setName(request.getName());
        studentUpdate.setGender(
                GenderType.toEnum(request.getGender())
        );
        try {
            studentUpdate.setBirthday(
                    dateConverter.toTimestamp(request.getBirthday())
            );
        } catch (ParseException e) {
            logger.error("StudentService call DateConverter: {}",e);
            return null;
        }
        studentUpdate.setEmail(request.getEmail());
        studentUpdate.setPhone(request.getPhone());
        studentUpdate.setAvatar(request.getAvatar());
        studentUpdate.setIdCard(request.getIdCard());
        studentUpdate.setCurrentAddress(request.getCurrentAddress());
        studentUpdate.setHomeTown(request.getHomeTown());

        studentInformationRepository.save(studentUpdate);
        logger.info("StudentService: update success!");
        return studentUpdate;
    }

    @Override
    public boolean delete(String id) {

        StudentInformationModel studentUpdate = studentInformationRepository.findById(id).orElse(null);
        if (studentUpdate == null) {
            logger.error("StudentService: {} not found.", id);
            return false;
        }
        studentInformationRepository.deleteById(id);
        logger.info("StudentService: delete success!");
        return true;
    }
}
