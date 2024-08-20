package com.sparta.homework1.service;

import com.sparta.homework1.dto.DiaryRequestDto;
import com.sparta.homework1.dto.DiaryResponseDto;
import com.sparta.homework1.entity.Diary;
import com.sparta.homework1.repository.DiaryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DiaryService {

    private final DiaryRepository diaryRepository;

    public DiaryService(DiaryRepository diaryRepository) {
        this.diaryRepository = diaryRepository;
    }

    public Diary createDiary(DiaryRequestDto requestDto) {
        Diary diary = new Diary(requestDto);
        return diaryRepository.save(diary);
    }

    public List<DiaryResponseDto> getDiaries() {
        return diaryRepository.findAll().stream()
                .map(DiaryResponseDto::new)
                .collect(Collectors.toList());
    }

    public Diary getDiary(Long id) {
        return diaryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 다이어리가 없습니다. ID: " + id));
    }

    public Diary updateDiary(Long id, DiaryRequestDto requestDto) {
        Diary diary = getDiary(id);
        diary.update(requestDto);
        return diaryRepository.save(diary);
    }

    public Long deleteDiary(Long id) {
        Diary diary = getDiary(id);
        diaryRepository.delete(diary);
        return id;
    }
}
