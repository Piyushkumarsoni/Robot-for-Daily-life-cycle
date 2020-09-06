import java.util.*

fun main() {

    /*Initialize the object Robot and give it a name*/
    val robot = Robot("Piyush Kumar")

    /*Print the details of the Robot along with a greeting*/
    println("Hey, there. My name is ${robot.name} and I will be your personal assistant!!")
    println()

    /*Input an alarm time you want to wake up*/
    robot.ringAlarm("7:00 AM")
    println()

    /*Let the robot know whether you'll take black coffee or not along with the number of spoons of sugar*/
    robot.makeCoffee(Coffee(true, 1))
    println()

    /*Input the water temperature in Celsius*/
    robot.heatWater(37)
    println()

    /*The robot packs the bag according to the day to the week*/
    robot.packBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println()

    /*A random breakfast is made depending on the items you have*/
    robot.cook()
    println()

    /*Just tell the color combination you want to wear. The robot will select the same from your wardrobe*/
    robot.ironClothes("Blue", "Black")
    println()
}