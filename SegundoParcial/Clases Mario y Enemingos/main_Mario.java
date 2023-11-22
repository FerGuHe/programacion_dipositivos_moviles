import java.util*
import kotlin.current.schedule
        import Clases .

fun main(){
        var mario = Mario()
        mario.collision(collisionObj: "pipe")

        mario.collision(collisionObj:  "goomba")


        for(i in 1..5){
        mario.collision("Goomba")
        println("Te quedan ${mario.getLives()}")

        }

        if(mario.isAlive){
        mario.collision("Gooma")
        println("Te quedan ${mario.getLives()}")

        }



        var newphone = phone()
        newphone.getTurn()
        newphone.turnOn()
        newphone.getTurn()


        var newCoche = vehiculo(marca: "ford", modelo: "chevy",color: "blanco", placas: "ABC- 4212" )
        }








