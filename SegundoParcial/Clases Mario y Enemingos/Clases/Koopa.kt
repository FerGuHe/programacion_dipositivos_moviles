class Koopa:      //HERENCIA
    Enemy ("Koopa", 2){

    }

override fun collision(collider: String){
    super.collision(collider)                                  //mandar a llamar metodo collition, imprimir un mensaje
    println("Usando la colision de la clase enemy")
}



/*
override fun collision(collider: String){
    when (collider){
        "weapon" -> {
            state = "shell"
            println("El estado es ahora $state")
        }

        "Enemy" -> changeDirection()
    }
}
 */
 */
+/


//polimorfismo: