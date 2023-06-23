package com.rejo.contentcalendar.repository;

import com.rejo.contentcalendar.model.Content;
import com.rejo.contentcalendar.model.Status;
import com.rejo.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository(){
    }
    public List<Content> findAll(){
        return contentList;
    }
    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(c ->c.id().equals(id)).findFirst();
    }
    public void save(Content content){
        contentList.removeIf(c->c.id().equals(content.id()));

        contentList.add(content);
    }


    @PostConstruct
    public void init(){
        Content c = new Content(1,"myFirst Blog","my first Blog Post,Status.idea",Status.IDEA,Type.ARTICLE,LocalDateTime.now(),null,"");
        Content a = new Content(2,"mySecond Blog","my first Blog Post,Status.idea",Status.IDEA,Type.ARTICLE,LocalDateTime.now(),null,"");
        contentList.add(c);
        contentList.add(a);
    }
    public boolean existsById(Integer id){
        return  contentList.stream().filter((c)->c.id().equals(id)).count() ==1;
    }

    public void delete(Integer id){
        contentList.removeIf(c->c.id().equals(id));
    }
}
