package org.juanmario.service;

import org.juanmario.model.SpinRequest;
import org.juanmario.model.SpinResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class SpinService {

    public SpinResponse generateRecommendation(SpinRequest request) {
        List<Integer> recommendedNumbers = new ArrayList<>();
        Random random = new Random();

        // Genera una lista de números aleatorios entre 0 y 36
        for (int i = 0; i < request.getNumberOfSpins(); i++) {
            recommendedNumbers.add(random.nextInt(37));
        }

        return new SpinResponse(recommendedNumbers);
    }
}
