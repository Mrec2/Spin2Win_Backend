package org.juanmario.model;

import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.List;

@Entity
public class SpinHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime timestamp;
    private int numberOfSpins;
    private String strategy;

    @ElementCollection
    private List<Integer> recommendedNumbers;

    
    public SpinHistory() {}

    public SpinHistory(int numberOfSpins, String strategy, List<Integer> recommendedNumbers) {
        this.timestamp = LocalDateTime.now();
        this.numberOfSpins = numberOfSpins;
        this.strategy = strategy;
        this.recommendedNumbers = recommendedNumbers;
    }

    
    public Long getId() {
        return id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getNumberOfSpins() {
        return numberOfSpins;
    }

    public String getStrategy() {
        return strategy;
    }

    public List<Integer> getRecommendedNumbers() {
        return recommendedNumbers;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setNumberOfSpins(int numberOfSpins) {
        this.numberOfSpins = numberOfSpins;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public void setRecommendedNumbers(List<Integer> recommendedNumbers) {
        this.recommendedNumbers = recommendedNumbers;
    }
}
