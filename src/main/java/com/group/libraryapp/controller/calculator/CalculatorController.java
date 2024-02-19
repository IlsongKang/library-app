package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {


  @GetMapping("/add") // GET /add
  public int addTwoNumbers(CalculatorAddRequest request) {
    //객체로 바로 받아서
    return request.getNumber1() + request.getNumber2();
  }

/*
  @GetMapping("/add")
  public int addTwoNumbers(@RequestParam int number1, @RequestParam int number2){
    return number1+number2;
  }
*/

  @PostMapping("/multiply") // POST /multiply
  public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
    return request.getNumber1() * request.getNumber2();
  }

}
