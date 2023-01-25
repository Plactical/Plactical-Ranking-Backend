package com.example.uzuranking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RankingRepository extends JpaRepository<RankingEntity, Long> {
    List<RankingEntity> findAllByOrderByScore();
}
