package com.Codezeon.crud.dailycode.repository;
import com.Codezeon.crud.dailycode.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

    List<Question> findByStatus(String st);

}
