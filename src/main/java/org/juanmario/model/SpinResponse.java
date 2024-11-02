package org.juanmario.model;

import java.util.List;
import java.util.Collections;

public class SpinResponse {
    private List<Integer> recommendedNumbers;

    public SpinResponse() {
        this.recommendedNumbers = Collections.emptyList();
    }

    public SpinResponse(List<Integer> recommendedNumbers) {
        this.recommendedNumbers = recommendedNumbers;
    }

    public List<Integer> getRecommendedNumbers() {
        return recommendedNumbers;
    }

    public void setRecommendedNumbers(List<Integer> recommendedNumbers) {
        this.recommendedNumbers = recommendedNumbers;
    }
}
