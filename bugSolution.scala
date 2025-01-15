```scala
class MyClass(var value: Int) {
  def getValue: Int = value
  def setValue(newValue: Int): Unit = {
    value = newValue
  }
}

object Main extends App {
  val myObject = new MyClass(10)
  println(myObject.getValue) // prints 10

  val myObject2 = new MyClass(20)
  myObject2.setValue(30) // Correctly modify using setter method
  println(myObject2.getValue) //Prints 30
}
```