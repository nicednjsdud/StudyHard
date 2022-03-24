리눅스 find 명령어 사용법 정리 ( 파일, 디렉토리검색, 찾기)
    - 리눅스에서는 find 명령어로 원하는 조건에 파일, 디렉토리를 검색 할 수 있습니다. f

    1. 리눅스 find 명령어 사용법

        1) find
            - find 명령만 입력하면 현재 디렉토리(.)에 있는 파일을 찾는다.(하위 디렉토리, 숨겨진 파일도 표시)

        2) find /etc
            - 특정 디렉토리(여기서는/etc)에 있는 파일을 검색
            - ex) find/etc -name "ssh*"

    2. 리눅스 find 명령어 옵션 정리 및 활용법

        1) find. -name "test*"
            - name옵션으로 찾을 파일 이름을 지정

        2) find. -name "test" -type d
            - 디렉토리만 찾을려면 -type d옵션을 사용한다.

        3) sudo find/ -size +10M -exec ls -lh{}\;
            - size 옵션으로 파일 사이즈를 지정할 수 있음
            (디렉토리 권한 때문에 앞에 sudo 사용)                     

        4) find. -empty
            - 빈 파일을 찾기위해 -empty 옵션 사용

        5) find/etc -macdepth 2 -name 'x*'
            - maxdepth 옵션으로 서브 디렉토리 검색 깊이를 지정

        6) find. -newer game.py
            - newer 옵션 뒤에 적힌 파일보다 최근에 변경된 파일을 검색

        7) find. -empty -exec ls -l {} \;
           find. -empty -exec rm {} \;

            - exec 옵션 뒤에 명령어를 입력하여 검색한 파일로 부가적인 작업 수행
                - 검색된 파일이 {}위치에 입력되어 처리

        8) find /-name "test*" 2>/dev/null
            - 'permission denied'와 같은 오류를 무시하기 위해 리다이렉션 사용
                - sudo 명령을 사용할 수 없는 경우 효과적    
