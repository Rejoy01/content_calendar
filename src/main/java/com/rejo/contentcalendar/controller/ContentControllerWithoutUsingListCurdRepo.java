//package com.rejo.contentcalendar.controller;
//
//import com.rejo.contentcalendar.model.Content;
//import com.rejo.contentcalendar.repository.ContentCollectionRepository;
//import jakarta.validation.Valid;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//
//import java.util.List;
//
//public class ContentControllerWithoutUsingListCurdRepo {
//}
//package com.rejo.contentcalendar.controller;
//
//        import com.rejo.contentcalendar.model.Content;
//        import com.rejo.contentcalendar.repository.ContentCollectionRepository;
//        import jakarta.validation.Valid;
//        import org.springframework.http.HttpStatus;
//        import org.springframework.web.bind.annotation.*;
//        import org.springframework.web.server.ResponseStatusException;
//
//        import java.nio.file.Path;
//        import java.util.List;
//
//@RestController
//@RequestMapping("/api/content")
//@CrossOrigin
//public class ContentController {
//
//
//    private final ContentCollectionRepository repository;
//
//    public ContentController(ContentCollectionRepository repository) {
//        this.repository = repository;
//    }
//    @GetMapping("")
//    public List<Content> FindAll(){
//        return repository.findAll();
//    }
//    @GetMapping("/{id}")
//    public Content findByID(@PathVariable Integer id){
//        return repository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Module not Found"));
//    }
//
//    @ResponseStatus(HttpStatus.CREATED)
//    @PostMapping("")
//    public void create(@Valid @RequestBody Content content){
//        repository.save(content);
//    }
//
//    //we are not returning anything
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @PutMapping("/{id}")
//    public void update(@RequestBody Content content,@PathVariable Integer id){
//        if(!repository.existsById(id)){
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Module not Found");
//        }
//        repository.save(content);
//    }
//
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Integer id){
//        repository.delete(id);
//    }
//
//}
