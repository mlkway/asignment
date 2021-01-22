 class Latte(private var sugar: Double, private var milk:  Double) {



    fun price():Double{

        return CoffeMachine.calculatePrice(sugar,milk,false)

    }


}