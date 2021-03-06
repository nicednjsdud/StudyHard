HTTP
====
HTTP(Hyper Text Transfer Protocol)은 인터넷에서 데이터를 주고 받을수 있는 
프로토콜(약속)이다.
-----------------------------------------------------------------------
 웹에서는 Client 와 Server 의 요청과 응답이 기본이 되어 통신을 하기 때문에
 HTTP도 서버와 클라이언트의 요청과 응답의 방식으로 동작한다.

   * 요청 : 클라이언트 -> 서버
   * 응답 : 서버 -> 클라이언트
   
요청
========
  * 클라이언트가 서버에게 요청할 때는 요청에 대한 정보를 담아 서버로 보낸다.
  * 클라이언트에게 응답할 때 응답에 대한 정보를 담아 클라이언트에게 보내는데 
    이런 정보가 담긴 메세지를 HTTP 메세지 라고한다.
        - HTTP 메세지는 시작줄, 헤더, 본문으로 구성된다.

        GET https:// www.cks3066.com HTTP/1.1
        User-Agent: Mozilla/5.0 (Windows NT 10.-; Win64; x64)...
        Upgrade-Insecure-Request: 1
        (본문 없음)

        위의 실제 요청 HTTP 메세지를 분석해보면
        GET https:// www.cks3066.com HTTP/1.1 의 첫줄에서
        GET 은 HTTP 메서드이다. 
                - ( GET, POST, PUT, DELETE 등의 메서드가 있다.)
        www.zerocho.com은 주소이며.
        HTTP/1.1은 HTTP버전이다.
        
        즉, 요청 메시지의 시작줄은 메서드 주소 버전으로 구성된 것이라고 한다.

        두번째 줄부터는 헤더라고 하며 요청에 대한 정보를 담고 있다.
        User-Agent, Upgrade-Insecure-Requests 등등이 헤더에 해당된다.

        헤더는 한 줄 띄고 본문이 시작된다. 본문은 요청을 할 때 함께 보낼
        데이터를 담는 부분이다.
        위의 요청 HTTP메세지는 단순히 주소로만 요청을 보내고 있기 때문에
        따로 데이터를 담지는 않아서 본문은 비어있는 상태이다.
응답
====
응답 HTTP 메시지
---------------
        HTTP/1.1 200 OK
        Connection: keep-alive
        Content-Encoding: gzip
        Content-Length: 35653
        Content-Type: text/html;

        <!DOCTY PEhtml><htmllang="ko"data-reactroot=""><head>
        <title...

        요청과 마찬가지로 시작줄, 헤더, 본문으로 구성되어 있다.
        HTTP/1.1 200OK의 첫줄은 버전 | 상태코드 | 상태메세지 로 구성되어있다.
        200의 상태코드는 성공적인 요청이었다는 뜻이다.
        
        두 번째 줄부터는 헤더이며 응답에 대한 정보를 담고 있다.
        시작줄, 헤더와 한줄 띄면 요청과 마찬가지로 본문이 시작되는데 본문에는
        요청한 데이터가 담겨져있다. 위의 HTTP 메세지에는 HTML이 담겨져있으며
        이 HTML을 받아 브라우저가 화면에 렌더링을 하게된다.
HTTP 메서드
==============
   * 요청 HTTP 메시지에서 서버에 요청시에 주소와 함께 HTTP 메서드를 보낼 수있다
     자주 사용되는 HTTP메서드에는 GET, POST, PUT, PATCH, DELETE 정도가 있다.

   * 해당 주소에 대한 어떤 동작을 하려고 할 때 알맞은 HTTP를 사용하면 된다.
     실제로 요청만 보낸다고 이루어지는 것은 아니고, 서버가 요청을 검증한 후
     유효하면 실행된다.

   * HTML의 form에서 method의 속성이 HTTP 메서드이며, action에서 주소, 인풋
     태그의 데이터들이 본문으로 POST action주소 HTTP/1.1 등과 같은 HTTP요청
     을 하는 HTML의 방법이 있다.

   * 보통 GET은 데이터 요청, POST는 데이터 전송 및 생성, PUT은 데이터 전체
     수정(대체), PATCH는 데이터 부분 수정, DELETE는 데이터 제거 요청시사용

   * 주소를 자원으로 보고, 메서드를 동사라고 보는 개발 방식이 REST이다.

   * 예를 들어 GET /user라고 하면, 사용자들의 정보를 가져온다는 의미가
     되고, DELETE/user/5 라고 요청을 보내면 아이디가 5인 사용자를 제거

   * GET과 DELETE을 제외한 POST, PUT, PATCH는 요청을 보낼 때 본문을 같이
     보낼 수 있다.
     GET과 DELETE도 본문을 넣어 보낼 수는 있지만 처리의 방식은 일관적이기 
     때문에 본문의 내용은 무시된다.

     POST myfit.xyz/male/upper HTTP/1.1
     Accept-encoding: gzip
     Accept-language: ko-KR
     ...
     {data:{type: "UPPER_ANALYZE_REQUEST",brand:"MYFIT"...}

     위와 같은 요청 HTTP메세지에서 POST 메서드를 사용하면 본문의 데이터를
     받아 파싱(해석)한 후 사용한다.

  * 만약 GET에 데이터를 담아 보내고 싶다면 어떻게 할까?
        - 주소 뒤에 ?를 붙인 후 키=값 & 키=값 식으로 데이터를 보낸다.
        - GET 요청은 본문 대신 주소에 쿼리스트링으로 데이터를 동봉하는 것이다.
        - 예를 들어 사용자를 이름순으로 가져오고 싶다면 GET /users?sort=name HTTP/1.1
          요청을 보내면 되게된다.
        - GET/users?sort=name&filter=developer&limit=100 HTTP/1.1 처럼 쿼리스트링
          간에 & 로 구별도 가능하다.

출처 : https://velog.io/@cks3066
