package com.nest.studentappnew_backend.controller;

import com.nest.studentappnew_backend.dao.StudentDao;
import com.nest.studentappnew_backend.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public Map<String, String> AddStudent(@RequestBody Students s) {
        System.out.println(s.getName().toString());
        System.out.println(s.getAdmno().toString());
        System.out.println(s.getRollno());
        System.out.println(s.getCollege().toString());
        dao.save(s);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;


    }
}
