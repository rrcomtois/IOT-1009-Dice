import kotlin.random.Random


// default constructor which requires both the string and sides to be provided
class Die(name: String, sides: Int)
{
    private var name = name // Dice name, usually along the lines of "D" prefix + sides
    private var sides = sides // NUmber of sides the die has
    private var sideUp = 0 // Represents the current side up. Will be set properly by rolling during initilization

    init {
        Roll()
    }
    constructor(sides: Int): this("D" + sides, sides) {} // Secondary constructor which just takes a number of sides, name is created by adding a "D" prefix
    constructor(): this("D6", 6) {} // Secondary constructor which uses default values

    // Roll function which changes the current side up on a die
    fun Roll() {this.sideUp = Random.nextInt(1, this.sides)}
    // Gets the name of the die
    fun GetName(): String = this.name
    // Gets the sides of the die
    fun GetSides(): Int = this.sides
    // Gets the side up of the die
    fun GetSideUp(): Int = this.sideUp
    // Setter function which can change the current side up
    fun SetSideUp(newSide: Int) {this.sideUp = newSide}
}