### 2.2 행동과 데이터 캡슐화: 클래스와 프로퍼티

---

#### 코틀린에서의 클래스 정의와 프로퍼티
```kotlin
class Person(
    val name: String,
    var isStudent: Boolean
)
// Java의 record와 비슷한 느낌
```
- ```val```로 선언한 프로퍼티는 읽기 전용
- ```var```로 선언한 프로퍼티는 변경 가능

#### 커스텀 접근자
```kotlin
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}
```
- ```get() =```
  - 고정적인 값을 반환할 때 사용
  - 이 떄, 반환타입은 반드시 프로퍼티의 타입과 같아야 함
- ```get() {}```
  - 블럭 안의 로직을 수행하고 반환할 수 있음
- ```set(value){ field = value}```
  - 필드에 접근하여 값을 value로 변경할 때 블럭 안의 로직이 수행