package com.icia.ex2.controller;

import com.icia.ex2.dto.StudentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
        public String index(){
        return "index";
    }
    @GetMapping("/Hello1")
    public String Hello1(){
    return "Hello1";
    }
    @GetMapping("/Hello2")
    public String Hello2(){
    return "Hello2";
    }

    @GetMapping("/hello-param1")
    public String reqParam1(@RequestParam("name") String name, @RequestParam("age") int age){
        System.out.println("name + = " + name + ", age =" + age);
        return "index";
        }


   // 2023.04.21
    @GetMapping("/form-param1")
    public String formParam1(@RequestParam("p1") String p1, @RequestParam String p2 ){
        // 변수 이름과 파라미터 변수 이름을 같게 하면 생략가능하다.
        System.out.println("p1" + p1+"p2 ="+p2);
        return "index";
    }
    @PostMapping("/form-param2")
    public String formParam2(@RequestParam String p3, @RequestParam String p4){
        System.out.println("p3+"+p3+"p4="+p4);

        return "index";
    }
//    @RequestMapping(value= "/hello-param", method = RequestMethod.GET)
    @GetMapping("/Hello3")
    public String Hello3(Model model){
        // 안녕하세요를 m1에 담아갈 코드
        // 화면으로 가지고 갈 때 model.addAttribute를 쓴다.
        //s1에 담긴 변수의 값을 m1 파라미터에 담아서 Hello3로 가져간다.
        String s1 = "안녕하세요";
        model.addAttribute("m1",s1);
        return "Hello3";
    }

    @GetMapping("/Hello4")
    public String Hello4(Model model) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(1L);
        studentDTO.setStudentName("학생1");
        studentDTO.setStudentNumber("12341234");
        model.addAttribute("student", studentDTO);
        // 모델에 object를 담을수 있다. => 어떤 타입이든 담을 수 있따.
        return "Hello4";

        // Hello5 요청을 처리하는 메서드
        // 실행 내용 : StudentDTO 객체를 담는 ArrayList를 선언하고 학생 2명의 정보를 리스트에 저장후
        // 리스트를 모델에 담자.
    }
    @GetMapping("/Hello5")
    public String Hello5(Model model) {
//        StudentDTO s1 = new StudentDTO();
//        StudentDTO s2 = new StudentDTO();
        List<StudentDTO> studentDTOList = new ArrayList<>();
//        s1.setId(2L);
//        s1.setStudentName("학생2");
//        s1.setStudentNumber("00000000");
//        list.add(s1);
//            s2.setId(3L);
//            s2.setStudentName("학생3");
//            s2.setStudentNumber("11111111");
//            list.add(s2);
//            model.addAttribute("studentList",list);
        for(int i=0; i<=10; i++) {
            studentDTOList.add(newStudent(i));
        }
        model.addAttribute("studentList",studentDTOList);
        return "Hello5";
    }

    private StudentDTO newStudent(int i) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId((long) i);
        studentDTO.setStudentName("학생"+i);
        studentDTO.setStudentNumber("11111110"+i);
        return studentDTO;
    }


}
