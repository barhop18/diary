package com.sparta.homework1.repository;

import com.sparta.homework1.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
    // 기본적인 CRUD 메서드는 JpaRepository에서 제공됩니다.
}
