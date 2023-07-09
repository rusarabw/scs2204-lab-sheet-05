import scala.io.StdIn
import scala.collection.immutable._

object solution {
    // GCD calculation using Euclidean Algorithm
    def gcd(p : Int, q : Int) : Int = p match{
        case x if (x < q) => return gcd(q, x)
        case x if (x%q == 0) => return q
        case x => return gcd(q, x%q)
    }

    def prime(n : Int, i : Int = 2) : Boolean = n match{
        case x if (x == i) => return true
        case x if (gcd(x, i) > 1) => return false
        case x => return prime(x, i+1)
    }

    def primeSeq(n : Int, arr : List[Int] = List()) : List[Int] = n match {
        case x if (x == 1) => return arr
        case x if (prime(x)) => return primeSeq(x-1, x :: arr)
        case x => return primeSeq(x-1, arr)
    }

    def main(args : Array[String]) : Unit = {
        print("Enter an integer: ")
        var n = scala.io.StdIn.readInt()
        if(n > 1) {printf("primeSeq(%d) = ", n); for element <- primeSeq(n-1) do printf("%d ", element)} else print("Invalid Input!")
    }
}