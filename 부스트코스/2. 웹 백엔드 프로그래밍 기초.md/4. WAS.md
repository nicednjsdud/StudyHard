WAS
====

## 클라이언트/서버 구조

* 클라이언트(Client)는 서비스(Service)를 제공하는 서버(Server)에게 정보를  
  요청하여 응답 받는 결과를 사용한다.

![alt](https://cphinf.pstatic.net/mooc/20180213_10/151849899068982T3i_PNG/05.png?type=w760)

## DBMS(database management system)

* 다수의 사용자들이 데이터베이스 내의 데이터를 접근할 수 있도록 해주는 소프트웨어
* 최초 구현은 Oracle

![alt](https://cphinf.pstatic.net/mooc/20180122_74/15166087526093WS9P_PNG/1_1_7_DBMS.PNG?type=w760)

## 미들웨어 (MiddleWare)

* 클라이언트 쪽에 비즈니스 로직이 많은 경우, 클라이언트 관리(배포 등)로 인해  
  비용이 많이 발생하는 문제가 발생
* 비즈니스 로직을 클라이언트와 DBMS사이의 미들웨어 서버에서 동작하도록   
  함으로써 클라이언트는 입력과 출력만 담당하도록 함.

![alt](https://cphinf.pstatic.net/mooc/20180122_267/1516608805247GN2hK_PNG/1_1_7_.PNG?type=w760)

## WAS (Web Application Server)

* WAS는 일종의 미들웨어로 웹 클라이언트(보통 웹 브라우저)의 요청 중 보통  
  웹 애플리케이션이 동작하도록 지원하는 목적을 가진다.
* 프로그램 실행 환경과 데이터베이스 접속 기능을 제공한다.
* 여러개의 트랜잭션을 관리한다.
* 업무를 처리하는 비즈니스 로직을 수행한다.

![alt](https://cphinf.pstatic.net/mooc/20180122_270/1516606715302CWRJG_PNG/1_1_7_was.PNG?type=w760)

## 웹서버

* 웹 서버는 프록시 서버(Proxy Server)의 용도로도 사용한다.
* 프록시서버란 간단히 말해서 클라이언트와 애플리케이션 서버 사이에서 요청을  
  중계해주는 역할을 수행하는 서버이다.
* 애플리케이션 서버는 각 서버마다 '포트'를 가지고 있다.
* https://example.com:8080처럼 서버 url과 포트와 함께 웹 어플리케이션을 이용  
  할수 있다. 하지만 프록시 서버를 이용하면 https://example.com/myapp과 같은  
  url로 접근하도록 접속을 우회(proxy)할 수 있다.

## 웹 서버 vs WAS

* WAS도 보통 자체적으로 웹서버 기능을 내장하고 있다.
* 현재는 WAS가 가지고 있는 웹 서버도 정적인 컨텐츠를 처리하는데 있어 성능상   
  큰 차이가 없다.
* 규모가 커질수록 웹서버와 WAS를 분리한다. 그 목적은 장애 극복 기능(failover)  
  인 경우가 많다.
* 웹서버는 WAS보다 간단한 구조로 이루워져 있다.




## 생각해보기

* 톰캣 버전별 차이점에 대해서 알아보세요.
    https://isabeller.tistory.com/23

## Tomcat

## 생각해보기

* Apache Tomcat 외에 WAS는 어떤 것들이 있을까요?

```
    Web Logic, Web spere, Jeus, JBOSS, Sum application Server 등 있다. 
```

* WAS가 없으면 웹 어플리케이션은 왜 실행할 수 없을까요?

``
    정의된 비즈니스 로직을 실제로 실행할 컴퓨터가 필요하다.
    비즈니스 로직 : 유저 눈에 보이지 않지만 요구사항을 잘 도출하기 위해 
    처리되는 코드들
```
