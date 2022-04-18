Maven
===========

## Maven 이란?

* Maven은 지금가지 애플리케이션을 개발하기 위해 반복적으로 진행해왔던   
  작업들을 지원하기 위하여 등장한 도구이다.
* 빌드, 패키징, 문서화, 테스트와 테스트 리포팅, git, 의존성관리, svn등과  
  같은 형상관리서버와 연동(SCMs),배포 등의 작업을 손쉽게 할 수 있습니다.

### CoC란?
* Convention over Configuration
* 일종의 관습을 말하는데, 예를 들자면 프로그램의 소스 파일은 어떤 위치에  
  있어야 하고, 소스가 컴파일된 파일들은 어떤 위치에 있어야하고 등을 정해놈

* 관습에 이미 익숙한 사용자는 Maven을 쉽게 사용할 수 있는데. 익숙하지 않은  
  사용자는 이러한 제약사항에 대해서 심한 거부감을 느낌.

* Maven을 사용한다는 것은 -> Coc에 대해서 알아나가는 것이라고 말함

## Maven을 사용할 경우 장점?

* 편리한 의존성 라이브러리 관리
* 설정 파일에 몇 줄 적어줌으로써 직접 다운로드 받거나 하는것을 하지않아도  
  라이브러리 사용가능
* Maven에 설정한 대로 모든 개발자가 일관된 방식으로 빌드를 수행
* 다양한 플러그인을 제공해줘서, 굉장히 많은 일들을 자동화 시킴

## Maven 기본

* Archetype을 이용하여 Maven 기반 프로젝트를 생성할 경우 생성된 프로젝트  
  하위에 pom.xml 파일이 생성
 
```xml

<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>kr.or.connect</groupId>
    <artifactId>examples</artifactId>
    <packaging>jar</packaging>
    <version>1.0-SNAPSHOT</version>
    <name>mysample</name>
    <url>http://maven.apache.org</url>
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>3.8.1</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

* project : pom.xml 파일의 최상위 루트 엘리먼트(Root Element)입니다.
* modelVersion : POM model의 버전입니다. 
* groupId : 프로젝트를 생성하는 조직의 고유 아이디를 결정합니다.   
            일반적으로 도메인 이름을 거꾸로 적습니다.
* artifactId : 해당 프로젝트에 의하여 생성되는 artifact의 고유 아이디를  
               결정합니다. Maven을 이용하여  pom.xml을 빌드할 경우 다음과   
               같은 규칙으로 artifact가 생성됩니다.   
                artifactid-version.packaging. 위 예의 경우 빌드할 경우  
               examples-1.0-SNAPSHOT.jar 파일이 생성됩니다.

* packaging : 해당 프로젝트를 어떤 형태로 packaging 할 것인지 결정합니다.  
               jar, war, ear 등이 해당됩니다.
* version : 프로젝트의 현재 버전. 추후 살펴보겠지만 프로젝트가 개발 중일 때는  
            SNAPSHOT을 접미사로 사용합니다. Maven의 버전 관리 기능  
            라이브러리 관리를 편하게 합니다.
* name : 프로젝트의 이름입니다.
* url : 프로젝트 사이트가 있다면 사이트 URL을 등록하는 것이 가능합니다.

* Maven을 이용 할 경우 얻게되는 큰 이점 중의 하나는 Dempendency Management 기능
