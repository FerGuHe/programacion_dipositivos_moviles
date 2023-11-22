class Goomba (name: String, strenght: Int):  //clase hijo
    Enemy(Goomba, 1){    //esto es para que no se tengaq que crear cada vez

        init{
            println("iniciando subclase de $name")

        }
    }

