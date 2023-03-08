fun main() {
val banker=Banker("Nancy",25,56.0)
    banker.eat()
    banker.sleep()
    banker.talk("Hello customers")
    var total=banker.countMoney(arrayOf(50,100,150,200))
    println(total)
    println(banker.name)
    println(banker.age)
    val doctor=Doctor("Purity",40)
    doctor.eat()
    doctor.talk("Hello how are you")
    doctor.sleep()
    doctor.treatPatient("Kimani","covid")
    doctor.inroduction()

    val farmer=Farmer("Peter",25)
    farmer.eat()
    farmer.talk("Hello here is the farm")
    farmer.sleep()
    farmer.cultivateland()


}
  open class Person(var name:String,var age:Int ) {
      fun talk(words: String) {
          println(words)
      }

      open fun eat() {
          println("yum")
      }

      fun sleep() {
          println("zzzzz")
      }

      open fun inroduction() {
          println("Hi my name is doctor $name")
      }
  }
 class Banker(name :String, age :Int,var weight:Double): Person(name,age){

    fun countMoney(notes:Array<Int>):Int{
        return notes.sum()
    }


}
class Doctor( name :String, age :Int): Person(name,age, ){
    fun treatPatient(patient:String,disease:String){
        println("Treat $patient for $disease")
    }

    override fun inroduction() {
        super.inroduction()
    }
}
class Farmer( name:String,age:Int):Person(name,age){
    fun cultivateland(){
        println("dig dig dig ")
    }

    override fun eat() {
        super.eat()
        println("I am eating the beans from my farm")
    }
}