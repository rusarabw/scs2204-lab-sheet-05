import scala.io.StdIn
import scala.collection.immutable._

object solution {
    def fibonacci(n : Int) : Int = n match{
        case x if (x == 1) => return 0
        case x if (x == 2) => return 1
        case x => return fibonacci(x-1) + fibonacci(x-2)
    }

    def fibonacciSeq(n : Int, arr : List[Int] = List()) : List[Int] = n match{
        case 1 => return fibonacci(1) :: arr
        case x => return fibonacciSeq(n-1, fibonacci(n) :: arr)
    }

    def main(args : Array[String]) : Unit = {
        print("Enter an integer: ")
        var n = scala.io.StdIn.readInt()
        if(n > 0) {print("Fibonacci Sequence = "); for element <- fibonacciSeq(n) do printf("%d ", element)} else print("Invalid Input!")
    }
}