package net.javaguides.springmvc.requestparam.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ramesh Fadatare
 */
@Controller
public class DemoController {

  /*
    * Binding a request parameter to a method parameter using 'name' or 'value'
    * attribute of @RequestParam
    */
   @RequestMapping("/request1")
   @ResponseBody
   public String handler(@RequestParam(name = "name") String name) {
      return "URL parameter <br> " 
            + "name =" + name;
   }

  /*
    * Binding request parameters to method parameters without using 'name' or
    * 'value' attribute of @RequestParam.
    */
   @RequestMapping("/request2")
   @ResponseBody
   public String handler(@RequestParam String firstName, @RequestParam String lastName) {

      return "URL parameters - <br>" 
            + " firstName = " + firstName + " <br>" 
            + " lastName = " + lastName;
   }

  /*
    * If method parameter type is not String then Spring automatically converts
    * to the appropriate type such as int, long, float etc.
    */
   @RequestMapping("/request3")
   @ResponseBody
   public String handler(@RequestParam("name") String name, 
         @RequestParam("age") int age,
         @RequestParam("amount") double amount, 
         @RequestParam("active") boolean active) {

      return "URL parameters - <br>" 
            + " name = " + name + " <br>" 
            + " age = " + age + " <br>" 
            + " amount = " + amount
            + " <br>" + " active = " + active;
   }

  /*
    * Binding all request parameters to Map
    */
   @RequestMapping("/request4")
   @ResponseBody
   public String handler(@RequestParam Map<String, String> params) {

      StringBuilder builder = new StringBuilder();
      builder.append("URL parameters - <br>");
      for (Entry<String, String> entry : params.entrySet()) {
         builder.append(entry.getKey() + " = " + entry.getValue() + "<br>");
      }
      return builder.toString();
   }

  /*
    * The required=false attribute of @RequestParam annotation is used to make
    * method parameter as Optional i.e. it bind a null value to method parameter
    * if request parameter is not present.
    */
   @RequestMapping("/request5")
   @ResponseBody
   public String handler(@RequestParam("firstName") String firstName,
         @RequestParam(name = "middleName", required = false) String middleName,
         @RequestParam("lastName") String lastName) {

      return "URL parameters - <br>" 
            + " firstName = " + firstName + " <br>" 
            + " middleName = " + middleName + " <br>"
            + " lastName = " + lastName;
   }

  /*
    * Binding date and time request parameters to LocalDate and LocalTime
    * using @DateTimeFormat and @RequestParam
    */
   @RequestMapping("/request6")
   @ResponseBody
   public String handler(
         @DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam("date") LocalDate date,
         @DateTimeFormat(pattern = "HH:mm:ss") @RequestParam("time") LocalTime time) {

      return "URL parameters - <br>" 
            + " date = " + date + " <br>" 
            + " time = " + time;
   }

  /*
    * Binding request parameter to array and list
    */
   @RequestMapping("/request7")
   @ResponseBody
   public String handler(@RequestParam("country") String[] country, 
         @RequestParam("city") List<String> city) {

      return "URL parameters - <br>" 
            + " country = " + Arrays.asList(country) + " <br>" 
            + " city = " + city;
   }

  /*
    * Using default value of a method parameter if request parameter is not
    * provided or has an empty value
    */
   @RequestMapping("/request8")
   @ResponseBody
   public String handler(@RequestParam(name = "code", defaultValue = "10") int code
        ) {

      return "URL parameters - <br>" 
            + " code = " + code;
   }

}