package com.Codezeon.crud.dailycode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Codezeon.crud.dailycode.service.QuesService;
import com.Codezeon.crud.dailycode.entity.Question;
import java.util.*;
@CrossOrigin
//(origins="https://codedaily.herokuapp.com/")
@RestController
public class QuesController {
  @Autowired
    private QuesService service;

  @PostMapping ("/addQuestion")
    public Question addQuestion(@RequestBody Question ques)
    {
      return service.saveQues(ques);
    }
  @PostMapping ("/addQuestions")
    public List<Question> addQuestions(@RequestBody List<Question> ques)
    {
        return service.saveQuestions(ques);
    }

  @GetMapping ("/findbyid/{ids}")
  public Question findbyid(@PathVariable int ids)
  {
    return service.findQues(ids);
  }


  @GetMapping ("/getall")
  public List<Question> getall()
  {
    return service.allQuestions();
  }

  @GetMapping ("/findbystatus/{s}")
  public List<Question> getbystatus(@PathVariable String s)
  {
    return service.findQuesbystatus(s);

  }

  @DeleteMapping("/delete/{ids}")
  public void deletebyid(@PathVariable int ids)
  {
    service.delbyid(ids);
  }

  @PutMapping ("/update")
  public Question update(@RequestBody Question qw)
  {
    return service.updateQuestion(qw);
  }

  @PutMapping("/update-status/{ids}")
  public Question updateforstatus(@PathVariable int ids)
  {
    return service.updateQuestionforstatus(ids);
  }

}
