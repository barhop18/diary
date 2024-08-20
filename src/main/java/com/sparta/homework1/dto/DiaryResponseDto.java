package com.sparta.homework1.dto;

import com.sparta.homework1.entity.Diary;
import lombok.Getter;

@Getter
public class DiaryResponseDto {
    private Long id;
    private String username;
    private String contents;
    private String password;
    private String makedate;

    public DiaryResponseDto(Diary diary) {
        this.id = diary.getId();
        this.username = diary.getUsername();
        this.contents = diary.getContents();
        this.password = diary.getPassword();
        this.makedate = diary.getMakedate();
    }

    public DiaryResponseDto(Long id, String username, String contents, String password, String makedate) {
        this.id = id;
        this.username = username;
        this.contents = contents;
        this.password = password;
        this.makedate = makedate;

    }
}