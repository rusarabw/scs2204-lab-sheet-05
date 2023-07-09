import scala.io.StdIn

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

    def main(args : Array[String]) : Unit = {
        print("Enter an integer: ")
        val n = scala.io.StdIn.readInt()
        if(n > 1) printf("prime(%d) = %b", n, prime(n)) else printf("Invalid Input!")
    }
}