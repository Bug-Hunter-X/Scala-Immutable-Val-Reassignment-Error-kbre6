```scala
class MyClass(val value: Int) {
  def getValue: Int = value
}

object Main extends App {
  val myObject = new MyClass(10) 
  println(myObject.getValue) // prints 10

  val myObject2 = new MyClass(20)
  myObject2.value = 30 //This line will cause an error because 'value' is a val (immutable)
  println(myObject2.getValue)
}
```