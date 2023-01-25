package com.example.uzuranking;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<RankingDTO> findAllData() {
        List<RankingEntity> datas = rankingRepository.findAllByOrderByScore();
        List<RankingDTO> result = new ArrayList<>();
        for (RankingEntity data : datas) {
            result.add(
                    RankingDTO.builder()
                            .clearTime(data.getClearTime())
                            .name(data.getName())
                            .nodeScore(data.getNodeScore())
                            .score(data.getScore())
                            .build()
            );
        }
        return result;
    }
}
