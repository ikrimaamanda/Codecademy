fun main () {
  
  val costOfGas = 2.28
  val mileage = 25
  // Declare the variable distance below
    
  println("What's your name?")
  var name = readLine()
  // Write your code below
  println("What's your friend's name?")
  var friendsName = readLine()

  println("How do you describe ur trip?")
  var adjective = readLine()

  println("What city will you and your friend be driving to?!")
  var city = readLine()

  println("What is the band u and ur friend will be driving to see?")
  var bandName = readLine()

  println("what is the job u and ur friend will be working for save money for ur trip?")
  var work = readLine()

  println("Kind of Job we will do in order to save money is $work")

  var distance: Int
  println("How many miles u and ur friend will be travelling?")
  distance = Integer.valueOf(readLine())

  var totalForGas = (costOfGas / mileage) * distance
  totalForGas = Math.round(totalForGas * 100) / 100.00
  var totalMoneySaved = totalForGas + 200



  print("""
    A long time ago, $name and their friend $friendsName planned a(n) $adjective road trip to see their favorite band: $bandName. 
    The venue was $distance miles away which meant they needed to save $$totalForGas dollars to get there.\n
    Both of them worked as $work for the whole summer and managed to save up a total of $$totalMoneySaved dollars!
    To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
    """.trimIndent())
}
