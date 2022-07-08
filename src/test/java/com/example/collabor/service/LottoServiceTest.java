package com.example.collabor.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class LottoServiceTest {


    @Test
    void lottoTest(){
        LottoService lottoService = new LottoService();
        List<Integer> lottoNumbers = lottoService.generateLottoNumbers();
        System.out.println("랜덤한 값은 어떻게 테스트 하나요???");

        int max = lottoNumbers.stream().max(Comparator.comparing(i -> i)).get();
        int min = lottoNumbers.stream().min(Comparator.comparing(i -> i)).get();


        Assertions.assertThat(max).isLessThanOrEqualTo(45);
        Assertions.assertThat(Collections.max(lottoNumbers)).isLessThanOrEqualTo(45);

        Assertions.assertThat(min).isGreaterThanOrEqualTo(1);
        Assertions.assertThat(Collections.min(lottoNumbers)).isGreaterThanOrEqualTo(1);
    }

}