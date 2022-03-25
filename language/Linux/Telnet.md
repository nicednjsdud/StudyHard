Telnet
    - 기본적(default)로 23번 포트 사용
    - ssh와 ftp의 비해서 보완성이 매우 좋지 않음
    - 다른 서비스의 비해 윈도우에서도 별도로 설치할 필요 x
    - 정말 급한 상황에서 사용하고, 왠만하면 사용하지 않음.

    - 일반적으로 root 접속 제한 (일반 사용자를 통한 접속)
    - su- 명령을 통해 관리자 권한을 획득 후 시스템 관리 작업을 할 수 있음
    - 보안이 안좋기 대문에 권장하지 않은 서비스
    - 윈도우에서는 기본적으로 제공하는 기능

    1) telnet 설치

        - 리눅스 내에서 패키지를 설치를 해야합니다.
        - telnet을 이용하려면 의존성 패키지들이 존재하기 때문에 yum으로 설치하여 의존성 패키지도 모두 설치할 수 있도록 해줍니다.

        #rpm -qa|grep telnet
            - (설치가 되어 있는지 한번 확인해 줍니다.)

        #yum -y install telnet*
            - telnet 관련된 패키지를 설치해줍니다.
            - Complete! 라는 문구가 나오면 설치가 완료된 것입니다.

    2) 방화벽 설정 (port 추가)

        - telnet이 사용하는 포트(23)를 방화벽에 추가해주도록 하겠습니다.

        # firewall-cmd --permanent --add-port=23/tcp (23번 포트 tcp 프로트콜로 방화벽에 추가)

        # firewall-cmd --reload                      (설정한 내용 적용)  

    3) telnet 서비스 실행

        # systemctl start telnet.socket
            - telnet 서비스 실행

        # systemctl status telnet.socket
            - telnet 서비스가 잘 작동하고 있는지 확인
            - active 동작 o , inactive 동작 x

    4) 윈도우에서 리눅스로 telnet 접속

        - 윈도우는 telnet이 기본적으로 설정이 되어있습니다. ( 리눅스에서는 yum으로 설치)
        - 윈도우에서 리눅스로 접속하기 전 telnet 서비스 활성화
            1) 윈도우 제어판 -> 프로그램(추가/제거) 접속
            2) 프로그램 및 기능안에서 Windows 기능 켜기/끄기 -> 텔넷 클라이언트를 체크
            3) 윈도우 키 + R을 통해 #cmd 실행
            4) # telnet [서버 IP]
                - cmd 창에 서버 IP를 입력하여 접속을 하면 로그인 할 계정을 입력하라고 나옴
                - telnet은 root 접속을 기본적으로 제한해서 /etc/passwd에 등록된 유저로 접속해야 함
                - 일반 계정으로 접속 후 su- 명령을 통해 루트 계정을 ㅗ접근

        - telnet 서비스는 평문으로 작업되기 때문에 회사에서는 사용 x
            - 주로 암호화가 되어있는 SSH를 통해 사용     

            출처  https://it-serial.tistory.com/77

