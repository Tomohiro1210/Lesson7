package com.lesson7.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.Map;


@RestController
public class HttpMethod_Controller {

    @GetMapping("/sukuaka")
    public Postcontent getPostcontents(){
        return new Postcontent(LocalDateTime.now(),"Tomohiro","イベント","○○公民館で子育てイベント");
    }

    @PostMapping("/sukuaka")
    public ResponseEntity<String> create(@RequestBody @Validated CreateForm form){
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/sukuaka/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created!");
    }

    @PatchMapping("/sukuaka/{id}")
    public ResponseEntity<Map<String,String>> update(@PathVariable("id") int id, @RequestBody @Validated UpdateForm form){
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/sukuaka/{id}")
    public ResponseEntity<Map<String,String>> delete(@PathVariable("id") int id){

        return ResponseEntity.ok(Map.of("message", "name successfully deleted"));
    }

}

