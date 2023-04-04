package ru.mskorotkov.spring.service;

import org.springframework.core.io.ClassPathResource;
import ru.mskorotkov.spring.dao.QuestionDao;
import ru.mskorotkov.spring.domain.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class ResourceLoaderService{
    private final String fileLocation;

    private final QuestionDao qDao;

    public ResourceLoaderService(QuestionDao qDao,String fileLocation){
        this.qDao = qDao;
        this.fileLocation = fileLocation;
    }

    public Question getQuestion(List<String> list){
        return qDao.getQuestion(list);
    }

    public void readResource() throws IOException {
       try{
            InputStream resource2 = new ClassPathResource(this.fileLocation).getInputStream();
            BufferedReader r = new BufferedReader(new InputStreamReader(resource2));
            List<String> test = r.lines().toList();
            test.stream().skip(1).forEach(x -> getQuestion(List.of(x.split(";"))).showQuestion());
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
