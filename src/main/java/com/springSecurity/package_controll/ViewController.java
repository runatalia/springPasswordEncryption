package com.springSecurity.package_controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/")
    public String getInfoForAllEmpls() {
        return "view_for_all_employees";
    }

    @GetMapping("/hr_info'")
    public String getInfoOnlyForHR() {
        return "view_for_hr";
    }

    @GetMapping("/manager_info''")
    public String getInfoOnlyManagers() {
        return "view_for_managers";
    }

}

//zaur 123
//elena 231
//ivan 321
//ошибка после аутентификации, исправить
