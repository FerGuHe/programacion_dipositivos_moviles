
class Mario (var vidas: Int = 3){
    init {
        println("It´s me mario")   //se presenta al construirlo

    }

    private  var state  = "small"
    private var lives = 3


    private var state = "small"
    private var lives = 3


        set(value){
            if(field == 1)
                field = 0
            gameOver()
        }else if (field == 0){
        println("Necesitas volver a jugar")

    }else{
        field = value
    }
}


private fun die(){       //setter
    lives--
    println("Has perdidio  una vida ")

}

public fun collisio(collisionObj: String) {

    when (collisionObj){
        "Goomba" -> die()
        "super mushroom" -> state = "Super mario"
        "Fire flower" -> state = "fire mario"
        else -> println("Objeto desconocido ¡no pasa nada!")
        "star" -> state = "star"

    }

}

fun getLives(): String{
    return "$lives vidas"




}



}




/*

private fun gameOver(){
   println("Juego TERMINADO")

}





/*




