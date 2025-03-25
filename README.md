# 도서대출 관리 프로그램

## 프로젝트 소개
도서관에서 도서 대출, 반납, 회원 관리 등을 효율적으로 처리할 수 있는 관리 시스템입니다.

## 주요 기능
- 도서 관리 (등록, 수정, 삭제, 검색)
- 회원 관리 (등록, 수정, 삭제, 검색)
- 대출/반납 관리
- 통계 및 보고서 생성

## 기술 스택
- Java 17
- Spring Boot 3.x
- Spring Data JPA
- H2 Database (개발 환경)
- Gradle

## 시작하기

### 사전 요구사항
- JDK 17 이상
- Gradle 8.x 이상

### 설치 방법
1. 저장소 클론
```bash
git clone [repository-url]
```

2. 프로젝트 디렉토리로 이동
```bash
cd library
```

3. 프로젝트 빌드
```bash
./gradlew build
```

4. 애플리케이션 실행
```bash
./gradlew bootRun
```

### API 문서
- API 명세서: [API_SPEC.md](API_SPEC.md)
- Swagger UI: http://localhost:8080/swagger-ui.html

## 프로젝트 구조
```
src/main/java/com/group/libraryapp/
├── config/         # 설정 클래스
├── controller/     # API 엔드포인트
├── domain/        # 도메인 모델
├── dto/           # 데이터 전송 객체
├── repository/    # 데이터 접근 계층
└── service/       # 비즈니스 로직
```

## 개발 가이드
1. 브랜치 전략
   - main: 프로덕션 브랜치
   - develop: 개발 브랜치
   - feature/*: 기능 개발 브랜치
   - hotfix/*: 긴급 수정 브랜치

2. 커밋 메시지 규칙
   - feat: 새로운 기능
   - fix: 버그 수정
   - docs: 문서 수정
   - style: 코드 포맷팅
   - refactor: 코드 리팩토링
   - test: 테스트 코드
   - chore: 빌드 업무 수정, 패키지 매니저 수정

## 기여하기
1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 라이선스
이 프로젝트는 MIT 라이선스를 따릅니다. 자세한 내용은 [LICENSE](LICENSE) 파일을 참조하세요.

## 연락처
프로젝트 관리자 - [이메일 주소]

프로젝트 링크: [GitHub Repository URL]
