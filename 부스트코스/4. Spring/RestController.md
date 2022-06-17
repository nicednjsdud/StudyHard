RestController
==================

## 1.@RestController

* Spring 4 에서 Rest API 또는 Web API를 개발하기 위해 등장한 애노테이션
* 이전 버전의 @Controller와 @ResponseBody를 포함한다.

## 2. MessageConvertor

* 자바 객체와 HTTP요청/ 응답 바디를 변환하는 역할
* @ResponseBody, @RequestBody

### 1) @EnableWebMvc로 인한 기본 설정

* WebMvcConfigurationsupport를 사용하여 Spring MVC 구현을 하고 있음
* Default MessageConvertor를 제공하고 있음

### 2) MessageConvertor 종류

![alt](https://cphinf.pstatic.net/mooc/20180219_44/1519025088215YszqO_PNG/1.png?type=w760)

## 3. json 응답하기

* 컨트롤러의 메소드에서는 json으로 변환될 객체를 반환한다.
* jackson라이브러리를 추가할 경우 객체를 json으로 변환하는 메세지 컨버터가  
  사용되도록 @EnableWebMvc에서 기본으로 설정되어 있다.
* jackson라이브러리를 추가하지 않으면 json메세지로 변환할 수 없어 500오류 발생
* 사용자가 임의의 메세지 컨버터를 사용하도록 하려면 WebMvcConfigurerAdapter  
  의 configureMessageConverters 메소드를 오버라이딩 하도록 한다.


<a :href="https://www.boostcourse.org/web326/lecture/58984?isDesc=false">출처-부스트코스</a>




























