import kotlin.random.Random
import kotlin.random.Random as Random1

fun main(args: Array<String>) {
  val myAge: Int = 18 //Зд 1
  val isTeenager: Boolean = if (myAge in 13..19) true else false

  val theirAge: Int = 30 //Зд 2
  val bothTeenagers: Boolean = if (theirAge in 23..19) true else false

  val reader: String = "Vladimir" //Зд3
  val author: String = "Richard Lucas"
  val authorIsReader:Boolean= if(author==reader) true else false

  val readerBeforeAuthor:Boolean = if (reader > author) true else false //Зд4

  val myAge2:Int = 18 //Зд 5
  if (myAge2 in 13..19)
  {
    println("Подросток")
  }
  else
    println("Не Подросток")

  val answer:String = if (myAge2 in 13..19) "Подросток" else "Не Подросток" //Зд 6
  println(answer)

  var counter:Int = 0 //Зд 7
 while (counter<10)
 {
   println("Counter=$counter")
   counter++
 }
  var counter2:Int = 0 //Зд 8
  var roll:Int = 0
  do {
    roll = Random.nextInt(6)
    counter2++
  }
    while (roll != 0)
    println("Бросков $counter2 , значение $roll")
  val range = 1 until 11 //Зд9
  for (i in range)
  {
    println(1*1)
  }
 for(i in range) //Зд10
 {
   println(kotlin.math.sqrt((i*i).toDouble()))
 }
  var sum=0 //Зд11
  for (row in 0 until 8)
  {
    for (column in 0 until 8)
    {
      sum +=row *column
    }
  }
  println(sum)
}