//package com.ex01.module.student.controller;
//
//import com.ex01.module.student.dto.StudentInformationCreateDTO;
//import com.ex01.module.student.dto.StudentInformationDTO;
//import com.ex01.module.student.model.StudentInformationModel;
//import com.ex01.module.student.service.StudentService;
//import com.ex01.module.student.utils.domain.JsonResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController()
//@RequestMapping("/api")
//public class TestServiceController {
//
//    @Autowired
//    private StudentService studentService;
//
//    @PostMapping("/add")
//    public ResponseEntity<?> add(@RequestBody(required=false) StudentInformationCreateDTO request){
//        StudentInformationCreateDTO datas = studentService.add(request);
//        JsonResponse jsonResponse = new JsonResponse(datas, true);
//        return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
//    }
//    @PostMapping("/update")
//    public ResponseEntity<?> upadate(@RequestBody(required=false) StudentInformationDTO request){
//        StudentInformationModel datas = studentService.update(request);
//        JsonResponse jsonResponse = new JsonResponse(datas, true);
//        return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
//    }
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id){
//        boolean success = studentService.delete(id);
//        JsonResponse jsonResponse = new JsonResponse(success);
//        return new ResponseEntity<JsonResponse>(jsonResponse, HttpStatus.OK);
//    }
//}
