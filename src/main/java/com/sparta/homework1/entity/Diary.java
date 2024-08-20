package com.sparta.homework1.entity;

import com.sparta.homework1.dto.DiaryRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity // JPA Entity로 설정
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String contents;
    private String password;
    private String makedate;

    public Diary(DiaryRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.password = requestDto.getPassword();
        this.makedate = requestDto.getMakedate();
    }

    public void update(DiaryRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.password = requestDto.getPassword();
        this.makedate = requestDto.getMakedate();
    }
}
