

object wholesaleCostForBooks extends App {
    val numberOfCopies = 60
    val coverPrice = 24.95
    val discount = 40.0/100.0





    def calculateWholesaleCost(numberOfCopies:Int ,coverPrice:Double,discount:Double) = {


        //function calculates the sipping cost
        def calculateShippingCost(noOfBooks:Int):Double = {
            if (noOfBooks <= 50) 3.0
            else 3.0 + (0.75 * (noOfBooks - 50))
        }


        //function calculates the discount
        def calculateDiscount(coverPrice:Double ,numberOfCopies:Int, discount:Double) = {
            coverPrice * numberOfCopies * discount
        }

        ( (numberOfCopies * coverPrice) - calculateDiscount(coverPrice,numberOfCopies,discount) + calculateShippingCost(numberOfCopies))
    }

    val wholeSaleValue = calculateWholesaleCost(numberOfCopies,coverPrice,discount)
    print("The Total Wholesale Cost = ")
    println(f"$wholeSaleValue%1.2f") // round off the value into 2 decimal place
}
