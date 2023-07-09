import scala.io.StdIn

object solution {
    def getEvenSum(n : Int, i : Int = 2) : Int = i match{
        case x if(n <= x) => return 0
        case x => return x + getEvenSum(n, x+2)
    }

    def main(args : Array[String]) : Unit = {
        print("Enter an integer: ")
        var n = scala.io.StdIn.readInt()
        if(n > 0) printf("Even sum = %d", getEvenSum(n)) else print("Invalid Input!")
     }
}