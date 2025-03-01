package com.example.SpringInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    // Use Case 1: Basic GET Request
//    Use GET Request Method
//- Use CURL to demonstrate the REST API Call
//- curl localhost:8080/hello -w "\n"
//    http://localhost:8080/hello
    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    // Use Case 2: GET Request with Query Parameter
//    Use GET Request Method and pass name as
//    query parameter
//- Use CURL to demonstrate the REST API Call
//- curl localhost:8080/hello/query?name=Mark-w "\n"
//    http://localhost:8080/hello/query?name=Bhoovan
    @GetMapping("/query")
    public String sayHelloWithQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }


    // Use Case 3: GET Request with Path Variable
//    Use GET Request Method and pass name as
//    path variable
//- Use CURL to demonstrate the REST API Call
//- curl localhost:8080/hello/param/Mark -w"\n"
//    http://localhost:8080/hello/param/Anshu_Pathak
    @GetMapping("/param/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

//     Use Case 4: POST Request with JSON Body
//Use POST Request Method and pass first name and
//    last name in the Body
//- Create User DTO Bean with firstName and lastName as
//    attributes.
//- Use CURL to demonstrate the REST API Call
//- curl -X POST -H "Content-Type: application/json" -d
//'{"firstName": ”Mark","lastName": ”Taylor"}'
//        "http://localhost:8080/hello/post" -w "\n"
//    http://localhost:8080/hello/post
/*{
    "firstName" : "Bhoovan",
        "lastName" : "Kumar"
}*/
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    // Use Case 5: PUT Request with Path Variable and Query Parameter
//    Use PUT Request Method and pass first name as
//    Path Variable and last name as Query Parameter
//- Use CURL to demonstrate the REST API Call
//- curl -X PUT
//    localhost:8080/hello/put/Mark/?lastName=Taylor-w "\n"
//    http://localhost:8080/hello/put/Bhoovan?lastName=Kumar
    @PutMapping("/put/{firstName}")
    public String sayHelloWithPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }



}
