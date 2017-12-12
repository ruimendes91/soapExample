package com.example.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calc {
  
  @WebMethod
  public String squared(String number){
    double num = Double.valueOf(number);
    return Double.toString(num * num);
  }  
  
  // Annotate this method. Name the operation "add"
  @WebMethod(operationName="add")
  public String addTwo(String aStr, String bStr){
    // Convert strings and calculate result
    double result = Double.parseDouble(aStr) + Double.parseDouble(bStr);
    return "" + result;      
  }

  // Annotate this method. Name the operation "subtract"
  @WebMethod(operationName="subtract")
  public String subtractTwo(String aStr, String bStr){
    // Convert strings and calculate result
    double result = Double.parseDouble(aStr) - Double.parseDouble(bStr);
    return "" + result;  
  }
}
