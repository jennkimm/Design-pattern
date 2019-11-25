# Design-pattern
Software architecture &amp; design pattern

### Ch01- Iterator pattern
* Class diagram
<img src="/images/Iterator_UML.png" width="410" height="200">

### Ch02- Adapter pattern
* Class diagram
1) 상속
<img src="/images/Adapter 상속.png" width="410" height="200">

2) 위임
<img src="/images/Adapter 위임.png" width="410" height="200">

### Ch03 - TemplateMethod pattern
<img src="/images/TemplateMethod.png" width="410" height="200">

### Ch04 - FactoryMethod pattern
<img src="/images/FactoryMethod.png" width="410" height="200">

### Ch05 - Singleton pattern
- 클래스당 하나의 인스턴스만 생성되야 하는 경우
- Singleton pattern 을 적용하는 방법에는 2가지가 있다.
  1) 속성에서 미리 생성하는 방식
  2) getInstance 메소드에서 인스턴스가 한번생성됐었는지 검사
* 주의할 점: 다중스레드 환경에서 다른 스레드가 cpu를 할당받고 getInstance 메소드를 호출하여 singleton == null을 비교하는 경우, 아직 singleton 변수에 Singleton객체가 할당되어있지 않으므로 비교결과 참이되어 Singleton 객체 또 생성하려고 하므로, synchronized 키워드 붙여줘야함 
<img src="/images/Singleton.png" width="410" height="300">

### Ch10 - Strategy pattern
- 알고리즘/전략/작전/책략 등을 동적으로 교체할 수 있는 패턴. player가 전략(strategy class)을 갖고있어, 다음 수를 어떻게 둘지 역할을 위임한다.
- 프로그램 동작 중에 전략 교체를 할 수 있다.
<image src="/images/StrategyPattern.png" width="410" height="200"> 

### Ch11 - Composite pattern
- 단일 객체든 객체들의 집합이든 같은 방법으로 취급하는 패턴. 내용물들을 트리구조로 구성. 
- ex) 파일과 디렉토리. 
<image src="/images/Composite.png" width="410" height="200">

### Ch16 - Mediator pattern
- 모든 클래스간의 복잡한 로직을 캡슐화하여 하나의 래스에(Mediator)위임하여 처리
- 그러나.. 실습을 자바 스윙으로 했는데, Colleague 들이 구현해야하는 여러가지 이벤트리스너들이 있을 때, 각 메소드를 다른컴포넌트에서 다르게 구현하고 싶을 때는 이 패턴을 지키지 못하는 것 같다.(?)
<image src="/images/Mediator.png" width="600" height="600">
