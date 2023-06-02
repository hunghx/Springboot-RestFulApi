package ra.springboot.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ra.springboot.model.Students;
import ra.springboot.service.student.IStudentService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/students")
@CrossOrigin(origins = "*")
public class StudentController {

    private IStudentService studentService;
    @GetMapping
    public List<Students> findAll(){
        List<Students> list = studentService.findAll();
        return list;
    }
    @PostMapping("/create")
    public Students create(@RequestBody Students student){
        return studentService.save(student);
    }
    @PutMapping("/update")
    public Students update(@RequestBody Students s) {
        Students update = studentService.findById(s.getId());
       if(update != null){
           return studentService.save(s);
       }else {
           return  null;
       }
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        studentService.deleteById(id);
    }
}
