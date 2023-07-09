import scala.io.StdIn

object solution {
    def checkEven(n : Int) : Boolean = n match{
        case 0 => return true
        case x if (x > 0) => return checkOdd(x-1)
        case x if (x < 0) => return checkOdd(x+1)
    }

    def checkOdd(n : Int) : Boolean = {
        return !(checkEven(n))
    }

    def main(args : Array[String]) : Unit = {
        print("Enter an integer: ")
        var n = scala.io.StdIn.readInt()
        if(checkEven(n)) print("Even") else print("Odd")
    }
}