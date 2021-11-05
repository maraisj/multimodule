package com.jpm.moduleweb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WebController {
    @GetMapping("/web")
    public ResponseEntity<String> webMapping() {
        log.info("inside Webcontroller");
        return ResponseEntity.ok("Inside WebController");
    }
}
