package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

  /*** Main ***/
  @RequestMapping(value = "", method = {RequestMethod.GET, RequestMethod.POST})
  public String main() {
    System.out.println("[νμ¬ μμΉ: MainController.main]");

    return "main/index";
  }

}
