package com.springboot.springboot03admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@Controller
public class FormController {

    @GetMapping("form_layouts")
    public String redirect() {
        return "form/form_layouts";
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("email")String email,
                             @RequestParam("username") String name,
                             @RequestPart("headerImg") MultipartFile img,
                            @RequestPart("photos") MultipartFile[] photos
    ) {
        log.info("email: {}, name: {}, headerImg size: {}, photos: {}", email, name, img.getSize(), photos.length);

        return "main";
    }
}
