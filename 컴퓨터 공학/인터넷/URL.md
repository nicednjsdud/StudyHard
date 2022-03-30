URL? 개념잡기
==============
   1.URL(Uniform Resource Locator)이란?
=========================================
   * URI(Uniform Resource Identifier, URL)란 인터넷에 있는 자원의 위치를 
     나타내는 유일한 주소이며, 인터넷에서 요구되는 기본조건으로 인터넷 
     프로토콜에 항상 붙어있다.

   * URI의 하위개념으로 URL, URN이 있다.

   * 주소 식별 체계인 URI가 브라우저에서는 주소 입력창을 통해
     URL(Uniform Resource Locator)이란 이름으로 사용된다.

   * URL 이란 Uniform Resource Locator의 약자이다.

   * URL 은 web address 또는 문화어로 파일식별자, 유일자원지시기 라고 불린다.

   * 자원(Resource)이란 웹페이지, 이미지, 음악파일, 동영상파일 등 웹상에
     존재하는 다양한 종류의 리소스를 통칭해 말한다.

   * URL은 흔히 웹사이트 주소로 알지만, 주소 뿐 아니라 컴퓨터 네트워크상의 
     자원을 모두 나타낼 수 있다.

   * 주소에 접속하려면 해당 URL에 맞는 프로토콜을 알아야 하고, 그와 동일한
     프로토콜로 접속해야 한다.

   * FTP 프로토콜인 경우에는 FTP 클라이언트를 이용해야 하고
     HTTP인 경우에는 웹 브라우저를 이용해야 한다.

   * 텔넷의 경우에는 텔넷 프로그램을 이용해서 접속해야 한다.

   * 웹 브라우저는 URL을 통해 URI(자원식별자) 정보를 추출하여, 웹 상에서 
     HTTP통신규약을 통해 자원을 찾는다.

 2.URL 문법(Uniform Resource Locator)
=========================================
    URL은 스킴에 따라 문법이 모두 다르지만, 아래의 구조를 기반으로 선택적 사용
    
    <스킴>://<user>:<password>@<host><port>/<경로>?<질의>#<프레그먼트>

    scheme:[//[user:password@]host[:port]][/]path[?query][#fragment]

 1)스킴 (scheme)
--------------------

   * URL은 가장 앞(scheme)에 자원에 접근할 방법을 정의해 둔 프로토콜 이름을 
     적는다. (gopher, telnet, ftp, http, usenet 등)

   * 웹에서 주로 HTTP 프로토콜을 사용한다.

   * 그 밖에 ftp, mailto(이메일), rtsp(스트리밍)과 같은 프로토콜을 사용할 수
     있다.
   * 프로토콜 이름 다음에는 프로토콜 이름을 구분하는 구분자인 :을 적는다.

   * 만약 IP 혹은 Domain name 정보가 필요한 프로토콜이면 : 다음에 //를 적는다.

   * 프로토콜명 구분자인 : 혹은 // 다음에는 프로토콜 마다 특화된 정보를 넣는다.
      - 예1) http://www.somehost.com/a.gif 
         - IP 혹은 Domain name 정보가 필요한 형태
            - www.somehost.com에 있는 a.gif를 가리키고 있음

      - 예2) ftp://id:pass@192.168.1.234/a.gif 
         - IP 혹은 Domain name 정보가 필요한 형태
            - 192.168.1.234.에 있는 a.gif를 가리키고 있음.

      - 예3) somebody@mail.somehost.com 
         - IP정보가 필요없는 프로토콜 ( mailto 프로토콜은 단지 메일을 받는
           사람의 주소를 나타냄)

 2)사용자 이름과 비밀번호
---------------------------          
