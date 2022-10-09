# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

---

## 프로그래밍 요구사항

- JDK 8 버전에서 실행가능해야 한다.
- Random 값 추출은 camp.nextstep.edu.missionutils.Randoms의 pickNumberInRange()를 활용한다.
- 사용자가 입력하는 값은 camp.nextstep.edu.missionutils.Console의 readLine()을 활용한다.
- baseball.ApplicationTest에 있는 2개의 Test Case가 성공해야 한다.
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- indent(인덴트, 들여쓰기) depth를 2가 넘지 않도록 구현한다
- 자바 8에 추가된 stream api를 사용하지 않고 구현해야 한다.
- 람다는 사용 가능하다.
- else 예약어를 쓰지 않는다.
- switch/case도 허용하지 않는다.
- 함수(또는 메소드)의 길이가 10라인을 넘어가지 않도록 구현한다.
- 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
- 도메인 로직에 단위 테스트를 구현해야 한다. 단, UI(System.out, System.in, Scanner) 로직은 제외
- 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 분리해 구현한다.
- 일급콜렉션을 활용해 구현한다.
- 모든 원시값과 문자열을 포장한다.

---

## 구현 기능 목록
- 이름
  - 이름은 쉼표로 구분된다.
  - 이름은 공백을 가져서면 안된다.
- 위치
  - 숫자이다.
  - 초기 값은 0이다.
  - 전진시 값이 1 추가된다.
  - 출력시 위치값 * '-' 로 출력된다.
  - 위치 값은 비교 가능하다.
- 자동차
  - 이름과 위치를 갖는다.
  - 자동차를 출력하면 이름 + ':' + 위치로 출력된다.
  - 위치값을 반환 할 수 있다.
  - 비교가 가능하다.(위치 값으로)
  - 조건에 따라 전진 혹은 멈춤이 가능하다. -> 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 시도횟수
  - 시도횟수는 숫자이다.
  - 시도횟수는 0 이상이어야 한다.
  - 한번 시도하면 시도횟수는 줄어든다.
  - 시도횟수가 남아 있는지 확인 할 수 있다.
- 자동차들
  - 자동차 리스트를 갖는다.
  - 우승자 거리를 구할 수 있다.
  - 우승자 목록을 구할 수 있다.
  - 자동차들을 움직인게 한다.(램던값을 뽑아서 전달 한다.)
  - 출력시 현재 자동차들의 이름과 움직인 거리가 출력된다.
- 게임
  - 자동차들을 갖는다.
  - 시도횟수를 갖는다.
  - 참가자 이름을 입력받는다. -> 쉼표로 구분된다.
  - 시도횟수를 입력 받는다.
  - 게임을 실행한다.
  - 우승자를 구할 수 있다.

### 입출력 요구 사항
<img width="800" alt="입출력 요구사항" src="https://user-images.githubusercontent.com/20774279/194691343-2b8e74b5-ec1f-43f1-a31b-aa347ff86ad8.png">

### 프로그램 실행 결과 예시
<img width="800" alt="실행결과" src="https://user-images.githubusercontent.com/20774279/194691347-7cf268c0-e194-4e6c-97a5-1a277c744481.png">
