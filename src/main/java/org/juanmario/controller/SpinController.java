package org.juanmario.controller;

import org.juanmario.model.SpinRequest;
import org.juanmario.model.SpinResponse;
import org.juanmario.service.SpinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SpinController {

    private final SpinService spinService;

    @Autowired
    public SpinController(SpinService spinService) {
        this.spinService = spinService;
    }

    @PostMapping("/spin")
    public ResponseEntity<SpinResponse> getSpinRecommendation(@RequestBody SpinRequest request) {
        SpinResponse response = spinService.generateRecommendation(request);
        return ResponseEntity.ok(response);
    }
}
