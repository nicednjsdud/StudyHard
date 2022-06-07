IoC/DI 컨테이너
==================

## 컨테이너(Container) 란?

* 컨테이너는 인스턴스의 생명주기를 관리한다.
* 생성된 인스턴스들에게 추가적인 기능을 제공한다. 

## IoC란?

* IoC란 Inversion of Control의 약어이다. inversion은 사전적 의미로는  
  '도치,역전'이다. 보통 IoC를 제어의 역전이라고 번역한다.
* 개발자는 프로그램의 흐름을 제어하는 코드를 작성한다. 그런데, 이 흐름의제어  
  를 개발자가 하는것이 아니라 다른 프로그램이 그 흐름을 제어하는 것을 IoC라고  
  말한다.

## DI란?

* DI는 Dependency Injection의 약자로, 의존성 주입이란 뜻을 가지고 있다.
* DI는 클래스 사이의 의존 관계를 빈(BEAN) 설정 정보를 바탕으로 컨테이너가  
  자동으로 연결해주는 것을 말한다.

## Spring에서 제공하는 IoC/DI 컨테이너

* BeanFactory : Ioc/DI에 대한 기본 기능을 가지고 있다.
* ApplicationContext: BeanFactory의 모든 기능을 포함하며, 일반적으로   
  BeanFactory보다 추천된다. 트랜잭션 처리, AOP등에 대한 처리를 할 수있다.  
  BeanPostProcessor, BeanFactoryPostProcessor등을 자동으로 등록하고,  
  국제화 처리, 어플리케이션 이벤트 등을 처리할 수 있다.

