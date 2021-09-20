package com.Codezeon.crud.dailycode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Codezeon.crud.dailycode.entity.Question;
import com.Codezeon.crud.dailycode.repository.QuestionRepository;
import java.util.List;


@Service

public class QuesService {
    @Autowired
    private QuestionRepository repo;

    //POST METHODS
    // saving data or question
    public Question saveQues(Question q1)
    {
        return repo.save(q1);

    }

    //to save a list of questions
    public List<Question> saveQuestions(List<Question> q1)
    {
        return repo.saveAll(q1);

    }

    //----------------------------------------------------------------------------------------------------------------------------------------------//


    //GET METHODS
    // to get a single data or question
    public Question findQues(int id1){
        return repo.findById(id1).orElse(null);
    }

    // to get a undone data or question
    public List<Question> findQuesbystatus(String st){
    	return repo.findByStatus(st);
    }

    //to get all list of questions
    public List<Question> allQuestions()
    {
        return repo.findAll();
    }


//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------//

    //DELETE METHODS
    // delete a data or question
    public void delbyid(int ig)
    {
        repo.deleteById(ig);

    }
//-----------------------------------------------------------------------------------------------------------------------------------------------------//

    //UPDATE METHOD
    //to update a list of questions
      public Question updateQuestion(Question qw)
      {
    	  Question existingques =repo.findById(qw.getId()).orElse(null);
          existingques.setName(qw.getName());
          existingques.setDiff(qw.getDiff());
          existingques.setLink(qw.getLink());
          existingques.setStatus(qw.getStatus());
          return repo.save(existingques);
      }
     //to update a question to change it's status
     public Question updateQuestionforstatus(int qw)
     {
         Question existingques =repo.findById(qw).orElse(null);

          existingques.setStatus("done");

         return repo.save(existingques);
     }

}
