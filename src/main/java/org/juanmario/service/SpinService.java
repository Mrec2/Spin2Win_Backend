package org.juanmario.service;

import org.juanmario.model.SpinRequest;
import org.juanmario.model.SpinResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

@Service
public class SpinService {

    public SpinResponse generateRecommendation(SpinRequest request) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();

        while (uniqueNumbers.size() < request.getNumberOfSpins()) {
            uniqueNumbers.add(random.nextInt(37)); 
        }

        List<Integer> recommendedNumbers = new ArrayList<>(uniqueNumbers);

        Collections.sort(recommendedNumbers);

        return new SpinResponse(recommendedNumbers);
    }
}
