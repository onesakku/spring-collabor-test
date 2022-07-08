package com.example.collabor.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class LottoService {

    public List generateLottoNumbers() {
        List<Integer> numbers = IntStream.range(1, 46).mapToObj(i -> i).collect(Collectors.toList());
        Collections.shuffle(numbers);
        List<Integer> subList = numbers.subList(0, 6);
        Collections.sort(subList);
        return subList;
    }
}
