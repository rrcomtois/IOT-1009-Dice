fun main() {
    println("Creating a default d6...")
    val dice0 = Die()
    
    println("Creating a d20...")
    val dice1 = Die(20)
    
    println("Creating a percentile die (a special d10)...")
    val dice2 = Die("Percentile",10)
    
    println("The current side up for ${dice0.GetName()} is ${dice0.GetSideUp()}")    
    println("The current side up for ${dice1.GetName()} is ${dice1.GetSideUp()}")
    println("The current side up for ${dice2.GetName()} is ${dice2.GetSideUp()}")
    //println("Empty constructor: Name=${dice0.GetName()}, Sides=${dice0.GetSides()}, SideUp=${dice0.GetSideUp()}")
    //println("1 Arg constructor: Name=${dice1.GetName()}, Sides=${dice1.GetSides()}, SideUp=${dice1.GetSideUp()}")
    //println("2 Arg constructor: Name=${dice2.GetName()}, Sides=${dice2.GetSides()}, SideUp=${dice2.GetSideUp()}")
}

