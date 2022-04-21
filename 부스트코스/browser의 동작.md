Browser의 동작
================

## Browser

* 브라우저는 월드와이드웹(WWW)에서 정보를 검색, 표현하고 탐색하기 위한  
  소프트웨어이다.
* 인터넷에서 특정 정보로 이동할 수 있는 주소 입력창이 있고 서버와 HTTP로  
  정보를 주고 받을 수 있는 네트워크 모듈도 포함하고 있습니다.
* 서버에서 받은 문서 (HTML,CSS,Javascript)를 해석하고 실행하며 표현하기 위한  
  해석기(Parser)들을 가지고 있다.
* 브라우저 마다 서로 다른 엔진을 포함하고 있다.

![alt](https://cphinf.pstatic.net/mooc/20171231_32/1514692895834EoHUo_PNG/webkitflow.png?type=w760)

* HTML을 해석해서 DOM Tree를 만들고, CSS를 해석해서 역시 CSS Tree를 만든다.
* 토큰 단위로 해석되는 방식은 일반적인 소스코드의 컴파일 과정이라고 보면 된다.
* DOM Tree와 CSS Tree, 이 두개는 연관되어 있으므로 Rander Tree로 다시 조합
* 조합된 결과는 화면에 어떻게 배치할지 크기와 위치 정보를 담고 있다.
* 이렇게 구성된 Render Tree 정보를 통해서 화면에 어떤 부분에 어떻게 색칠을  
  할지 Painting 과정을 거치게 된다.


## 생각해보기

* 우리가 흔히 브라우저 탐색을 할 때 스크롤을 하거나, 어떤 것을 클릭하면서  
  화면의 위치를 바꿀 때, 브라우저는 어떻게 다시 화면을 그릴까요?

```
    Rander Tree가 변경된다면 다시 Rendering을 진행
    변경되지 않으면 화면에 보이는 UI만 바꿀것이다.
```

* 위에서 표현된 그림처럼 다시 렌더링 되지 않을까요?

```
    무조건 적으로 렌더링이 다시 되지는 않을것이다.
```

```html
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <title>부스트 코스</title>
    <link rel="stylesheet" href="./main.css">
     <script>
      alert(1)
    </script>
  </head>
  <body>
  <div>웹프론트엔드</div>
  </body>
    <script>
      alert(2)
    </script>
</html>
```

## 웹서버란?

* 웹서버는 소프트웨어(Software)를 보통 말하지만, 웹서버 소프트웨어가 동작하는  
  컴퓨터를 말한다.
* 웹 서버의 가장 중요한 기능은 클라이언트(Client)가 요청하는 HTML문서나 각종  
  리소스(Rescource)를 전달하는 것이다.
* 웹 브라우저나 웹 크롤러가 요청하는 리소스는 컴퓨터에 저장되어 있는 정적  
  (static)인 데이터이거나 동적인 결과가 될 수 있다.