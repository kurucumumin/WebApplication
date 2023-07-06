package com.example.demo;

import com.example.localdevelopment.Container;
import com.example.localdevelopment.App;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WebApplicaionController {
    @GetMapping("/result")
    public String getResult() {
        Container container = App.generateContainer();
        return convertToJson(container);
    }

    private String convertToJson(Container container) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(container);
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
