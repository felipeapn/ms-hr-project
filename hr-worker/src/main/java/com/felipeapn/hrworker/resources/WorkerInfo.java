package com.felipeapn.hrworker.resources;

import com.felipeapn.hrworker.entities.Worker;
import com.felipeapn.hrworker.repositories.WorkerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@Slf4j
@RestController
@RequestMapping( value = "/info")
public class WorkerInfo {

    @Autowired
    private Environment environment;

    @GetMapping
    public ResponseEntity<String> info() {

        log.info("test.config=" + environment.getProperty("test.config"));

        return ResponseEntity.ok("test.config=" +  environment.getProperty("test.config"));
    }
}
