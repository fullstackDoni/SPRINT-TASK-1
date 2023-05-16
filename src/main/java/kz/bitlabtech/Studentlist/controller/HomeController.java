package kz.bitlabtech.Studentlist.controller;

import kz.bitlabtech.Studentlist.db.DBManager;
import kz.bitlabtech.Studentlist.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController{

    @GetMapping(value = "/")
    public String index(Model model){
        ArrayList<Student> students = DBManager.getStudents();
        model.addAttribute("student",students);
        return "index";
    }
    @PostMapping(value = "/add")
    public String addStud(Student student) {
        DBManager.addStud(student);
        return "redirect:/";
    }
    @GetMapping(value = "/add")
    public String addStud(){
        return "addStud";
    }
}
