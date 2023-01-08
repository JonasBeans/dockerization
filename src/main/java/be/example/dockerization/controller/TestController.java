package be.example.dockerization.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @GetMapping
    public ResponseEntity getTest(){
        return new ResponseEntity<>("Test succesfull", HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity getTest(@PathVariable("name") String name){
        return new ResponseEntity<>(String.format("Test succesfull, welcome %s", name), HttpStatus.OK);
    }

}
