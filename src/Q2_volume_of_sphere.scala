
object Q2_volume_of_sphere extends App {
    val radiusOfSphere = 5
    println("Calculate the volume of a sphere with radius 5\n")

    // calculating volume. Import value of pi and use math power function
    val volume = (4.0/3.0) * (math.Pi) * ( math.pow(radiusOfSphere,3) )

    println("The volume = " + volume )
}
