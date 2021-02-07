# java-racingcar

Junit5 학습 / 문자열 덧셈 계산기 / 자동차 경주 게임 미션을 위한 저장소

## 문자열 덧셈 계산기

### 구현 기능 목록

- #### 문자열 구분과 계산
  - 입력 문자열이 빈 문자열 또는 null 값 입력 시 0을 반환한다.
  - 단일 정수 입력 시 해당 숫자를 반환한다.
  - 쉼표(,)를 구분자로 사용하여 두 숫자의 합을 반환한다.
  - 콜론을 구분자로 사용한다.
  - 커스텀 구분자를 지정할 수 있도록 한다. (예 : “//;\n1;2;3” => 6)
  - 음수가 포함되어 있는 경우 예외를 발생시킨다.

- #### 테스트 코드 작성과 기능 확인
  - null 또는 빈 문자 입력 시 0을 반환하는지 확인한다.
  - 단일 숫자 입력 시 해당 숫자를 반환하는지 확인한다.
  - 쉼표로 구분된 입력 문자열을 각 숫자로 정상 분리하는지 확인한다.
  - 쉼표 또는 클론으로 구분된 입력 문자열을 각 숫자로 정상 분리하는지 확인한다.
  - 커스텀 구분자로 구분된 입력 문자열을 각 숫자로 정상 분리하는지 확인한다.
  - 음수가 전달될 경우 RuntimeException을 정상 발생시키는지 확인한다.
  - 커스텀 구분자가 두 글자 이상인 경우의 입력 문자열을 처리할 수 있는지 확인한다.
  - dash(-)가 구분자로 포홤되는 경우 음수 판별 가능 여부를 확인한다.

## 자동차 경주

## 기능 명세

* 필요한 객체 - Car, Car 리스트를 관리하는 객체, Round 관리하는 객체, RandomUtil, InputUtil, OutputView, GameRunner, GameController
* 자동차 이름 입력 / 시도 횟수 력력
* 자동차에 이름을 부여 -> 자동차 생성자로 초기화
* 자동차를 전진 멈춤 -> GameController 관리
* 원하는 범위 랜덤값 생성
* 각 라운드별 자동차 움직임 출력
* Car 리스트 우승자 선정 -> 복수 우승자 가능
* 우승자 출력

## 테스트 케이스

* 사용자 입력 예외처리 테스트
  * 시도 횟수 예외 처리
  * 자동차 이름 예외 처리
* 자동차 움직임/멈춤 테스트
* 자동차 움직임 출력 테스트
* 랜덤값 범위 테스트
* 우승자 선정 테스트
