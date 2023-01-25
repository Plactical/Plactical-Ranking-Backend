package com.example.uzuranking;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RankingController {
    private final RankingService rankingService;

    public RankingController(RankingService rankingService) {
        this.rankingService = rankingService;
    }

    @PostMapping("/save")
    public ResponseEntity<Void> saveData(@RequestBody RankingDTO rankingDTO) {
        rankingService.saveData(rankingDTO);
        return ResponseEntity.ok().body(null);
    }

    @GetMapping("/find-data")
    public ResponseEntity<List<RankingDTO>> findAllData() {
        return ResponseEntity.ok().body(rankingService.findAllData());
    }
}
