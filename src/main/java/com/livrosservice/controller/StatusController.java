package com.livrosservice.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/status")
public class StatusController {

    @GetMapping
    public String status() {
        String msg = "Livros-Service está ativo.";
        System.out.println(msg);
        return msg;
    }
}
