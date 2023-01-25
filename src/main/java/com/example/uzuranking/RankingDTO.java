package com.example.uzuranking;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RankingDTO {
    private Long id;

    private String name;

    private Double clearTime;

    private Integer score;

    private Integer nodeScore;
}
