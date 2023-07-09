import scala.io.StdIn

object solution {
    def sum(n : Int) : Int = n match{
        case 0 => return 0
        case _ => return n + sum(n-1) 
    }

    def main(args : Array[String]) : Unit = {
        print("Enter an integer: ")
        var n = scala.io.StdIn.readInt()
        if(n > 0) printf("sum(%d) = %d", n, sum(n)) else print("Invalid Input!")
    }
}