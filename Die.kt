import kotlin.random.Random

class Die(
    name: String,
    sides: Int
) {
    private var name = name
    private var sides = sides
    private var sideUp = 0

    init {
        Roll()
    }
    constructor(sides: Int): this("D" + sides, sides){}
    constructor(): this("D6", 6)

    fun Roll() {this.sideUp = Random.nextInt(1, this.sides)}
    fun GetName(): String = this.name
    fun GetSides(): Int = this.sides
    fun GetSideUp(): Int = this.sideUp
}