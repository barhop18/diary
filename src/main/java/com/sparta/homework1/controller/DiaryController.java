package com.sparta.homework1.controller;

import com.sparta.homework1.dto.DiaryRequestDto;
import com.sparta.homework1.dto.DiaryResponseDto;
import com.sparta.homework1.entity.Diary;
import com.sparta.homework1.service.DiaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diaries")
public class DiaryController {

    private final DiaryService diaryService;

    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    // 다이어리 생성
    @PostMapping
    public DiaryResponseDto createDiary(@RequestBody DiaryRequestDto requestDto) {
        Diary diary = diaryService.createDiary(requestDto);
        return new DiaryResponseDto(diary);
    }

    // 모든 다이어리 조회
    @GetMapping
    public List<DiaryResponseDto> getDiaries() {
        return diaryService.getDiaries();
    }

    // 특정 다이어리 조회
    @GetMapping("/{id}")
    public DiaryResponseDto getDiary(@PathVariable Long id) {
        Diary diary = diaryService.getDiary(id);
        return new DiaryResponseDto(diary);
    }

    // 다이어리 수정
    @PutMapping("/{id}")
    public DiaryResponseDto updateDiary(@PathVariable Long id, @RequestBody DiaryRequestDto requestDto) {
        Diary diary = diaryService.updateDiary(id, requestDto);
        return new DiaryResponseDto(diary);
    }

    // 다이어리 삭제
    @DeleteMapping("/{id}")
    public Long deleteDiary(@PathVariable Long id) {
        return diaryService.deleteDiary(id);
    }
}
