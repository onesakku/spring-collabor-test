package com.example.collabor.controller;

import com.example.collabor.service.LottoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class LottoController {

    private final LottoService lottoService;

    @GetMapping("/numbers")
    public ResponseEntity generateLottoNumbers(){

        List lottoNumbers = lottoService.generateLottoNumbers();

        return ResponseEntity.status(HttpStatus.OK).body(lottoNumbers);
    }
}

