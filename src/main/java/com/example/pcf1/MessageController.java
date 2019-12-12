package com.example.pcf1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController
{
    @Value("${Variable}")
    private String message;

    @GetMapping("/new")
    public String pcf()
    {
        return message;
    }

}
