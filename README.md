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

### Ch17 - Observer pattern
- 관찰대상과 관찰자가 다대일의 의존관계가 되어, 관찰대상의 상태가 변하면, 관찰자에게 통지되어, 객체의 상태변화에 따른 처리를 기술할 때 유용하게 사용된다.
- 관찰자와 관찰 대상을 논리적으로 분리함으로써, 각각을 쉽게 교체할 수 있다. =>확장성/교환가능성 높아짐.
<image src="/images/Observer.png" width="600" height="600">

### Ch20 - Flyweight pattern
- 인스턴스를 가능한 한 공유시켜, 메모리를 절약한다. 이미 만들어져있는 인스턴스를 또 생성하지 않고, 재사용한다.
<image src="/images/Flyweight.png" width="410" height="500">

### Ch22 - Command pattern
- 클래스(객체)가 일을 처리할 때는, 자신의 클래스(객체)나 다른 클래스(객체)의 메소드를 호출한다. 실행하고자 하는 일이 메소드 호출이 아닌, 명령을 나타내는 클래스의 인스턴스 생성으로 표현된다.
- 이는 명령의 history 를 관리하고 싶을 때, 명령의 집합을 보존해서 재사용 할수도 있고, 여러 개의 명령을 모아서 새로운 클래스로 두면, 재사용 가능하다. 
<image src="/images/Command.png" width="600" height="600">

