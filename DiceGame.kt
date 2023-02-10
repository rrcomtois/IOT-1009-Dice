fun main() {
    println("Creating a default d6...")
    val dice0 = Die()
    
    println("Creating a d20...")
    val dice1 = Die(20)
    
    println("Creating a percentile die (a special d10)...")
    val dice2 = Die("Percentile",10)
    
    println("The current side up for ${dice0.GetName()} is ${dice0.GetSideUp()}")    
    println("The current side up for ${dice1.GetName()} is ${dice1.GetSideUp()}")
    println("The current side up for ${dice2.GetName()} is ${dice2.GetSideUp()}\n")

    println("Testing the roll method\n")

    println("Rolling the ${dice0.GetName()}...")
    dice0.Roll()
    println("The new value is ${dice0.GetSideUp()}")
    println("Rolling the ${dice1.GetName()}...")
    dice1.Roll()
    if (dice1.GetSideUp() == 20) println("YAY! It's a ${dice1.GetSideUp()}")
    else println("The new value is ${dice1.GetSideUp()}")
    println("Rolling the ${dice2.GetName()}")
    dice2.Roll()
    println("The new value is ${dice2.GetSideUp()}\n")

    println("Setting the ${dice2.GetName()} to show the 20...")
    dice2.SetSideUp(20)
    println("The side up is now ${dice2.GetSideUp()}\n")

    Yahtzee()

}

fun Yahtzee() {
    println("Creating 5 d6...")
    val dice: MutableList<Die> = mutableListOf()
    for (i in 0..4) { dice.add(Die()) }
    var found: Boolean = false
    var counter: Int = 0
    while (!found) {
        counter++
        for (x in dice){
            x.Roll()
        }

        //for (x in dice) { println("${x.GetSideUp()}") }

        if (dice[0].GetSideUp() == dice[1].GetSideUp() && dice[0].GetSideUp() == dice[2].GetSideUp() && dice[0].GetSideUp() == dice[3].GetSideUp() && dice[0].GetSideUp() == dice[4].GetSideUp())
        {
            println("YAHTZEE!!!")
            println("It only took ${counter} rolls! Damn!")
            found = true
        }
    }
    
}

