Spring
=======

## MVC

* MVC는 Model-View-Controller의 약자이다.
* 원래는 제록스 연구소에서 일을 하던 트뤼그베 린즈커그가 처음으로 소개한   
  개념으로 데스크톱 어플리케이션용으로 고안됨

### 1) MVC?

#### Model 
* 모델은 뷰가 렌더링하는데 필요한 데이터이다. 예를들어 사용자가 요청한 상품  
  목록이나, 주문역내이 이에 해당한다.

#### View
* 웹 애플리케이션에서 뷰(View)는 실제로 보이는 부분이며, 모델을 사용해   
  렌더링을 한다. 뷰는 JSP,JSF,PDF,XML등으로 결과를 표현

#### Controller 
* 컨트롤러는 사용자의 액션에 응답하는 컴포넌트다.
* 컨트롤러는 모델을 업데이트하고, 다른액션을 수행한다.

#### MVC Model 1 아키텍처

![alt](https://cphinf.pstatic.net/mooc/20180219_180/1519003368125BcfqV_PNG/1.png?type=w760)

#### MVC Model 2 아키텍처

![alt](https://cphinf.pstatic.net/mooc/20180219_65/1519003382079lUcI5_PNG/2.png?type=w760)

#### MVC Model 2 발전형태

![alt](https://cphinf.pstatic.net/mooc/20180219_149/15190034013354diDI_PNG/3.png?type=w760)

### Spring Web Module

![alt](https://cphinf.pstatic.net/mooc/20180219_73/1519003417760TqmnB_PNG/4.png?type=w760)

### 2) Spring MVC 구성요소와 동작 이해

![alt](https://cphinf.pstatic.net/mooc/20180219_116/1519003779294ejdEx_PNG/1.png?type=w760)

### 3) 요청 처리를 위해 사용되는 컴포넌트

#### DispatcherServlet

* HandlerMapping
* HandlerAdapter
* MultipartResolver
* LocaleREsolver
* ThemeResolver
* HandlerExceptionResolver
* REquestToViewNameTranslator
* ViewResolver
* FlashMapNanager

## DispatcherServlet

* 프론트 컨트롤러(Front Controller)
* 클라이언트의 모든 요청을 받은 후 이를 처리할 핸들러에게 넘기고 핸들러가  
  처리한 결과를 받아 사용자에게 응답 결과를 보여줌
* DispatcherServlet은 여러 컴포넌트를 이용해 작업을 처리

### 1) DispatcherServlet 내부 동작 호름

![alt](https://cphinf.pstatic.net/mooc/20180219_281/1519003870301bOehw_PNG/2.png?type=w760)

### 2) 요청 선처리 작업

![alt](https://cphinf.pstatic.net/mooc/20180219_91/1519003885824QT31y_PNG/3.png?type=w760)

### 3) 요청 전달

![alt](https://cphinf.pstatic.net/mooc/20180219_281/1519003870301bOehw_PNG/2.png?type=w760)

### 4) 요청 처리

![alt](https://cphinf.pstatic.net/mooc/20180219_167/1519004040926yL8eC_PNG/5.png?type=w760)

### 5) 예외 처리

![alt](https://cphinf.pstatic.net/mooc/20180219_26/1519004078279fGdRP_PNG/6.png?type=w760)

### 6) 뷰 렌더링 과정

![alt](https://cphinf.pstatic.net/mooc/20180219_66/1519004113425TanBR_PNG/7.png?type=w760)

### 7) 요청 처리 종료

![alt](https://cphinf.pstatic.net/mooc/20180219_296/1519004150778ofOPV_PNG/8.png?type=w760)