# NutriDelight_Spring
Java Spring Boot로 늘어나는 1인 가구로 인해 불규칙적인 식사 문제를 손쉽게 접근 할 수 있게 밀키트 판매 홈페이지 제작    
Java MVC패턴으로 제작했던 프로젝트를 Spring Boot로 이식    
Java MVC 제작 기간 - (2023-05-29 ~ 2023-06-13)    
Spring 제작 기간 - (2023-06-19 ~ 2023-06-21)
            
<a href="https://drive.google.com/file/d/1ilzlk-_ZHtDSSNQjwnRbURWj2H5ea2XW/view?usp=sharing" title="PDF로 이동">![cover](https://github.com/Okrie/NutriDelight_Spring/blob/main/Nutridelight_Spring.png)</a> 

### 시연 영상
<a href="https://drive.google.com/file/d/1hRXk90BfGT3F6OMyk-XO3JTGbTFnIn15/view?usp=sharing" title="시연영상으로 이동">![image](https://github.com/Okrie/NutriDelight_Spring/blob/main/Thumbnail.png)</a>

---

### 기능 설명
- Image용 서버를 따로 두어 관리
![image](https://github.com/Okrie/NutriDelight_Spring/assets/24921229/5ec0d9ea-758e-41ae-9cc6-3e71d7dad4ec)
    
- 일반 로그인, 소셜 로그인 기능 구현    
   일반 유저라면 홈페이지 메인 페이지로 이동
   어드민이라면 어드민 메인 페이지로 이동    
- 회원가입 기능, 주소 다음API기능으로 구현
- 리뷰 작성 및 기능 구현
- 장바구니 추가, 제거 등 기능 구현
- 찜하기, 제거 기능 비동기처리로 구현
- 유저 마이페이지 내
   상세정보 (상세정보 확인을 위한 비밀번호 재확인, 수정 및 변경 기능 구현)    
   장바구니 (장바구니 내 품목 확인, 추가 및 삭제 기능 구현)    
   위시리스트 (찜한 품목 확인, 제거 기능 구현)    
- 구매내역 페이지 구현
   사진, 품명, 수량, 가격, 구매일자, 배송상태, 환불상태, 리뷰작성(상품페이지) 항목으로 제작    
   배송 완료된 상태라면 배송상태 내 텍스트 변경    
   환불신청이 가능한 상태라면 환불 신청 버튼 활성화, 불가능한 상태라면 환불 신청 버튼 비활성화 및 '환불 완료'로 변경
   환불신청이 가능 할 때, 환불 버튼 터치시 Modal로 실제 진행할 건지 노출기능 구현
   환불 신청 완료시 Ajax로 비동기 처리로 화면 갱신
  
---
---
#### Database    
    : MySQL    
    
    
#### 기술 스택
<p align="left">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=git,github,eclipse,vscode,mysql,java,spring,css,html,figma" />
  </a>
    <img src="https://cdn.icon-icons.com/icons2/2107/PNG/512/file_type_js_official_icon_130509.png" height="53" title="Java Script">
    <img src="https://cdn.icon-icons.com/icons2/2107/PNG/512/file_type_jsp_icon_130498.png" height="53" title="JSP">
    <img src="https://cdn.icon-icons.com/icons2/2415/PNG/512/tomcat_original_wordmark_logo_icon_146324.png" height="53" title="Tomcat">
    <img src="https://cdn.icon-icons.com/icons2/2699/PNG/512/slack_tile_logo_icon_168820.png" height="53" title="Slack">
    <img src="https://cdn.icon-icons.com/icons2/3913/PNG/512/miro_logo_icon_248450.png" height="53" title="Miro">
    <img src="https://cdn.icon-icons.com/icons2/3221/PNG/512/docs_editor_suite_docs_google_icon_196688.png" height="53" title="Google Docs">
</p>

---
##### 추가 작업
- 팀원의 오류 수정 도움
- 일부 필요한 부분 작업 수정

---
---
