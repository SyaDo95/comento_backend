# 주간보고내용

1. 개발환경 셋팅
   IntelliJ Community 버전 설치(완료)

   Debeaver 설치 및 DB Connection(완료)

   Debeaver를 MariaDB에 connection 하는 과정에서 AWS와 RDS의 개념에 대해 공부

   Spring MVC 환경설정 & API PING (완료)

   controller 패키지 아래에 있는 자바 클래스들이 어떤 역할을 하는지 배움.
   maven-compiler-plugin과 jetty-maven-plugin이 내 컴퓨터의 어느 폴더에 위치해 있는지 배움.
   가이드들을 따라 환경설정 밑 코드들을 작성하고 Jetty가 정상 작동하는 것을 localhost:9080/ping 통해 확인함.
   환경성정 도중 오류가 발생할때 마다 구글에 한글 및 영어로 검색하고 ai에게도 문제의 이유를 물어보며 호환성 문제나 버전 문제가 
   있다는것을 알고 인터넷에서 해답을 발견하여 해결.

   datasource & mybatis 연동 (완료)

   Jetty를 구동하고 localhost:9080/request에 접속했을 시 정상적으로 예시와 같은 결과가 나오는 것을 확인

2. api가이드 초안 작성

   
   api란 클라이언트가 서버에 특정 요청을 하면 그에 맞는 응답을 보내줄 수 있도록 하는 서버와 클라이언트 사이의 약속이라고 할 수 있다.
   HTTP 통신에서는 클라이언트-서버 모델을 따르며, 애플리케이션 레벨의 프로토콜로 TCP/IP위에서 작동한다. HTTP는 클라이언트가 HTTP 메시지를 통해 서버에 요청을 보낸다.
   서버가 요청에 대한 결과를 만들어서 응답이 오면 클라이언트가 응답 결과를 열어서 동작을 하게된다.
   
   api에는 여러 종류가 있는데 그 중 대중적으로 쓰이는 것은 rest api이다.
   여기에서는 url에 동사를 쓰지 않고 명사만을 사용하며 GET, POST, DELET, PUT, PATCH 요청을 사용하여 데이터를 읽어올것인지 업데이트 할것인지 삭제할것인지 등을 결정한다.
   get은 url의 해당 데이터를 읽어오는 요청이고, delet는 해당 데이터를 삭제해달라는 요청이다.
   put 요청에는 내가 새롭게 업로드할 데이터가 함께 있으며 새로운 데이터의 업로드를 요청하고, put과 patch는 이전의 데이터를 업데이트 해달라는 요청이다.

3. 스프링부트를 이용하여 restful api 구현하기

   스프링부트 개발 환경 셋팅 (완료)

   통계 API를 위한 DB 및 TABLE 생성 (완료)

   스프링부트, mybatis, mariadb 연동 (완료)

   
