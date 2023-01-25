package com.example.uzuranking;

import org.springframework.stereotype.Service;

@Service
public class RankingService {
    private final RankingRepository rankingRepository;

    public RankingService(RankingRepository rankingRepository) {
        this.rankingRepository = rankingRepository;
    }

    public void saveData(RankingDTO rankingDTO) {
        rankingRepository.save(RankingEntity.builder()
                .clearTime(rankingDTO.getClearTime())
                .name(rankingDTO.getName())
                .nodeScore(rankingDTO.getNodeScore())
                .score(rankingDTO.getScore())
                .build());
    }
}
