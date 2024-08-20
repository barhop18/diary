# API

| 기능      | Method | URL               | Return                 |                   
|---------|--------|-------------------|------------------------|
| 일정 작성   | POST   | /api/diaries      | DiaryResponseDto       | 
| 일정 조회   | GET    | /api/diaries/{id} | List<DiaryResponseDto> | 
| 목록 조회   | GET    | /api/diaries      | List<DiaryResponseDto> |
| 일정 수정   | PUT    | /api/diaries/{id} | Long                   |
| 일정 삭제 | DELETE | /api/diaries/{id} | Long                   |
                                   