1. 리눅스 쉘 스크립트
    
    - 리눅스에서 가장 많이 사용하는 bash 쉘 스크립트 만들기 방법 
    - 특징
        - 배시 쉘(Bash Shell)의 특징
            - 배시(Bash)은 Bourne Shell(sh)을 대체하는 유닉스 쉘로 리눅스에서 가장 많이 사용되는 쉘이다.
            - 쉘 스크립트는 여러 종류의 텍스트 편집기를 이용하여 개발 할 수 있다.

        - 쉘 스크립트가 필요한 이유
            - 프로그래밍 언어 또는 스크립트 언어로 특정한 작업을 수행하는 프로그램과 스크립트 등을 개발할 수 있다.
            - 하지만, 프로그래밍 언어 또는 기존 Python 등의 스크립트로는 명령어등을 처리하기에는 많은 코드가 필요
            - 리눅스에는 다양한 명령어들이 지원됨. 이러한 명령어등을 조합하여 쉘 스크립트를 개발 할 수 있다면 특정한 직업을
                수행하는 기능을 개발하는데 보다 빠르게 개발이 가능함.

2. 리눅스 쉘 스크립트 예제
     - 기존의 배시 쉘에서 사용되는 명령어 등은 쉘 스크립트 내부에서 그래도 사용가능
         1) 쉘 스크립트 파일을 작성할 때에 제일 처음 #!/bin/bash 구문을 추가하여 내용을 작성하면 됨

                #!/bin/bash
                echo "hello world"

         2) 생성된 쉘 스크립트 실행은 아래와 같이 실행권한을 추가한 뒤에 바로 실행

                $ chmod +x test.sh
                $ ./test.sh

         3) 그리고 다음과 같이 bash 명령어로 쉘 스크립트를 지정하면서 실행

                $ bash test.sh

3. 쉘 스크립트 변수(Variable)

    - 변수는 크게 지역변수, 환경변수, 예약변수들이 존재
    - 변수 생성은 변수명에 대입연산자(=)를 사용하여 값을 대입하면 변수가 생성되면서 값이 초기화

        1) 지역변수 : 함수 내에서만 사용가능한 변수. 함수 내에서 변수 생성시 local 지시어 사용 가능
        2) 전역변수 : 실행되고 있는 스크립트 내에서 사용할 수 있는 변수
        3) 환경변수 : export를 지정하여 사용가능
        4) 예약변수 : 예약된 변수, 시스템과 관련하여 사용

                #!/bin/bash

                hello="hello"
                world="world"

                echo $hello
                echo ${hello}

                echo $hello", "$world
                echo ${hello}", "${world}

4. 쉘 스크립트 조건문

    - bash 쉘에서 사용되는 조건문은 아래와 같은 문법을 갖음

                if[ 값1 조건식 값2 ]; then
                    수행문
                fi

        ex)
                #!/bin/bash

                val = "hello"

                if[ $val == "hello"]; then
                    echo "hello"
                fi

    - 조건이 많아 질 경우 아래와 같이 if ~elif ~else if구문을 사용함

                #!/bin/bash

                val = "hello"

                if [ $val == "hello"]; then
                    echo "hello"
                elif [ $val == "hi"]; then
                    echo "hi"
                else
                    echo "else"
                fi

5. 쉘 스크립트 반복문

    - 쉘 스크립트에서 반복문의 문법

                for (( EXP1; EXP2; EXP3))
                do
                    command1
                    command2
                    command3
                done
    - 기존의 프로그래밍 문법에서와 비슷하게 사용 (for문 예제)

                #!/bin/bash

                for(( c=1; c<=5; c++))
                do
                    echo "value : $c"
                done
    - for ~ in 문법

                #!/bin/bash

                for val in {1..5}
                do
                    echo ${val}
                done 

6. 쉘 스크립트 함수 정의

    - 함수이름을 이용하여 호출 가능

                #!/bin/bash

                test_func(){
                    echo "hello, world"
                }                      
                test_func

    - 파라미터 지정하여 호출

                #!/bin/bash

                test_func(){
                    echo "hello, world"
                    echo $1
                }
                test_func "test"

    - 전달된 파라미터를 포함하여, 함수 내부에서 사용될 수 있는 추가 주요변수

        1) $0 : 실행된 스크립트 이름
        2) $N : $1, $2 등 전달된 파라미터의 변수
        3) $# : 매개변수의 총 개수                             

출처 : https://hiseon.me/linux/linux-shell-script-example/

