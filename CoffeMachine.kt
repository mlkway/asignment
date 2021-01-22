import java.util.*

class CoffeMachine (private var input: Scanner) {


    fun request():Double {
        val forRet: Double

        forRet = if (whichCoffe() == "capucinno"){
            Cappucinno(sugar(),milk(),Cinamon()).price()
        }else{
            Latte(sugar(),milk()).price()
        }


    return forRet
    }



    private fun whichCoffe():String{
        println("Hello, we have only capucinno and late please enter which coffe you want")
        var forRet = ""
        var check = false
        while (!check){
            input = Scanner(System.`in`)
            if (input.hasNextLine()){
                forRet = input.nextLine().toLowerCase()
                if (forRet == "capucinno" || forRet == "latte"){
                    check = true
                }else{
                    println("please enter capucinno or latte")
                }

            }else{
                println("please enter text capucinno or latte not a number")
            }
        }
    return forRet
    }

    private fun sugar():Double{

       println("Please enter sugar quantity")
        var forRet = 0.0
        var check = false
        while (!check){
            input = Scanner(System.`in`)
            if (input.hasNextDouble()){
                forRet = input.nextDouble()
                if (forRet < 15 && forRet >= 0){
                    check = true
                }else{
                    println("you can add max 15  and min 0!")
                }

            }else{
                println("Please enter number")
            }
        }

    return forRet

    }

    private fun milk():Double{

        println("Please enter milk quantity")
        var forRet = 0.0
        var check = false
        while (!check){
            input = Scanner(System.`in`)
            if (input.hasNextDouble()){
                forRet = input.nextDouble()
                if (forRet < 10 && forRet >= 0){
                    check = true
                }else{
                    println("you can add milk from 0 to 10!")
                }

            }else{
                println("Please enter number not a text")
            }
        }

        return forRet

    }

    private fun Cinamon():Boolean{

        println("Please enter true or false")
        var forRet = false
        var check = false
        while (!check){
            input = Scanner(System.`in`)
            if (input.hasNextBoolean()){
                forRet = input.nextBoolean()
                check = true

            }else{
                println("if you wannt to add cinamon enter true  and if you dont like cinamon enter false")
            }
        }
    return forRet
    }


    companion object{
        private const val priceOfCup: Double = 3.00
        private const val sugarPrice: Double = 0.25
        private const val milkPrice: Double = 0.75
        private const val cinamonPrice: Double = 0.50

        @JvmStatic
        fun calculatePrice(sug: Double,  mil: Double, cin: Boolean):Double {


            return if (cin){
                sug * sugarPrice + milkPrice * mil + cinamonPrice + priceOfCup
            }else {
                sug * sugarPrice + milkPrice * mil + priceOfCup
            }



        }

    }

}