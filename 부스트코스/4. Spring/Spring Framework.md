Spring FrameWork
==================

## Spring Framework란?

* 엔터프라이즈 급 어플리케이션을 구축할 수 있는 가벼운 솔루션이자,  
  원스-스탑-숍(one-stop-shop)
* 원하는 부분만 가져다 사용할 수 있도록 모듈화가 잘 되어 있다.
* IoC 컨테너이다.
* 선언적으로 트랜잭션을 관리할 수 있다.
* 완전한 기능을 갖춘 MVC Framework를 제공한다.
* AOP지원
* 스프링은 도메인 논리 코드와 쉽게 분리될 수 있는 구조를 가지고 있다.
* 원-스탑-숍 : 모든 과정을 한꺼번에 해결하는 상점 

## AOP와 인스트루멘테이션(Instrumentation)

* spring-AOP : AOP얼라이언스(Aliance)와 호환되는 방법으로 AOP를 지원
* spring-aspects : AspectJ와의 통합을 제공
* spring-instrument : 인스트루멘테이션을 지원하는클래스와 특정 WAS에서 사용  
  하는 클래스로더 구현체를 제공한다. 참고로 BCI(Byte Code Instrumentations)  
  은 런타임이나 로드(Load)때 클래스의 바이트 코드에 변경을 가하는 방법

## 메시징(Messaging)

* spring -messaging : 스프링 프레임워크 4는 메세지 기반 어플리케이션을 작성  
  할 수 있는 Message, MessageChannel, MessageHandler 등을 제공한다.
* 해당 모듈에는 메소드에 메시지를 맵핑하기 위한 어노테이션도 포함되어 있으며,  
Spring MVC 어노테이션과 유사하다.

## 데이터 엑세스(Data Access) / 통합(Integration)

* 데이터 엑세스/통합 계층은 JDBC,ORM,OXM,JMS 및 트랜잭션 모듈로 구성
* spring-jdbc : 자바 JDBC프로그래밍을 쉽게 할 수 있도록 기능을 제공
* spring-tx : 선언적 트랜잭션 관리할 수 있는 기능을 제공
* spring-orm : JPA,JDO및 Hibernate를 포함한 ORM API를 위한 통합 레이어 제공
* spring-oxm : JAXB,Castor,XMLBeans,JiBX 및 XStream과 같은 Object/XML  
  맵핑 지원
* spring-jms : 메세지 생성(producing) 및 사용(consuming)을 위한 기능을 제공

## 웹(Web)

* 웹 계층은 spring-web,spring-webmvc,spring-websocket,spring-webmvc-portlet  
모듈로 구성
* spring-web : 멀티 파트 파일 업로드, 서블릿 리스너등 웹 지향 통합 기능을 제공
    * HTTP클라이언트와 Spring의 원격 지원을 위한 웹 관련 부분을 제공
* Spring-webmvc: Web-Servlet모듈이라고도 불리며, Spring MVC및 REST 웹  
  서비스 구현을 포함한다.
* spring-websocket : 웹 소켓을 지원
* spring-webmvc-portlet : 포톨릿 환경에서 사용할 MVC구현을 제공한다.
