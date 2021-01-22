class Cappucinno(private var sugar: Double, private var milk: Double, private var cinamon: Boolean) {



    fun price():Double{
        return CoffeMachine.calculatePrice(sugar,milk,cinamon)
    }

}