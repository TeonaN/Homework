
fun main() {
    val f1 = Fraction(80,40)
    val f2 = Fraction(2,3)
    val res = f1.method2(f2)
    f1.reduce()
    println(f1)
    print("Multiplied: ")
    println(res)
}



open class Fraction (private var num1: Int = 0, var num2: Int = 0) {

    init {
        if ( num2 == 0) throw Exception("Error!")
    }



    override fun toString(): String {
        return "$num1/$num2"
    }


    fun reduce() {
        var a = gcd(num1, num2)

        this.num1 /=a
        this.num2 /=a
        print("Reduced fraction: ")

    }


    fun gcd(x: Int, y: Int): Int {
        if (y==0)
            return x
        return gcd(y, x%y)


    }

    fun method2(fraction: Fraction) : Fraction {
        val b = this.num1 * fraction.num1
        val c = this.num2 * fraction.num2
        return Fraction(b, c)

    }


}