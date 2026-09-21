# **WebCraft 실시간 게임 서버 구현**

숙련 주차 프로젝트

## 필수 기능 구현 목록
- [X] Lv 1. Docker로 MySQL과 Redis 설정
- [X] Lv 2. SQL을 JPA 인덱스로 표현하기
- [X] Lv 3. 요청 검증과 DTO: 플레이어 등록
- [X] Lv 4. 월드 생성
- [X] Lv 5. 채팅 저장과 내역 조회
- [X] Lv 6. 최근 채팅 조회 API 구현
- [X] Lv 7. WebSocket 연결과 사용자 식별
- [X] Lv 8. HandshakeInterceptor 등록
- [X] Lv 9. 월드별 WebSocket 세션 관리
- [X] Lv 10. Redis 접속 상태 관리
- [X] Lv 11. 메시지 라우팅과 Ping/Pong
- [X] Lv 12. 플레이어 이동 요청 처리
- [X] Lv 13. 채팅 요청 처리와 응답 구성
- [X] Lv 14. 같은 월드의 참여자에게 채팅 전송
- [X] Lv 15. 접속자 목록 조회

## 도전 기능 구현 목록
- [X] Lv 16. 낙관적 락
  - 낙관적 락이란?
      - version과 같은 별도 값으로 수정되었다고 명시를 해 다른 세션이 동일 조건으로 값을 수정할 수 없도록 하는 방식
      - JPA에서는 @Version으로 사용 가능
- [X] Lv 17. 커서 페이지 조회
- [X] Lv 18. Redis 최근 채팅 캐시
- [X] Lv 19. Redis Lua로 채팅 전송 횟수 제한
- [X] Lv 20. 멀티 서버


## 문답
> Redis와 MySQL의 차이는 무엇인가요?
> > ``

> 채팅 기능에 SSE보다는 WebSocket을 더 선호하는 이유는 무엇인가요?
> > ``

> Pub/Sub에서 Publisher와 Subscriber는 각각 어떤 역할을 하나요?
> > ``
