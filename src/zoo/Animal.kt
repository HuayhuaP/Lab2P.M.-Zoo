package zoo

abstract class Animal(val nombre: String) {
    abstract val habitat: String
    abstract fun sonido(): String
}
interface AccionAnimal {
    fun moverse(): String
    fun comer(): String
}
class Tiburon(nombre: String) : Animal(nombre), AccionAnimal {
    override val habitat = "Océano"
    override fun sonido() = "..."

    override fun moverse() = "Nadando rápidamente"
    override fun comer() = "Cazando peces"


}

class Delfin(nombre: String) : Animal(nombre), AccionAnimal {
    override val habitat = "Océano"
    override fun sonido() = "Clic clic"

    override fun moverse() = "Nadando ágilmente"
    override fun comer() = "Comiendo peces y calamares"


}


class Zoologico {
    private val animales = mutableListOf<Animal>()

    fun agregarAnimal(animal: Animal) {
        animales.add(animal)
    }

    fun mostrarAnimales() {
        for (animal in animales) {
            println("${animal.nombre}, Habitat: ${animal.habitat}, Sonido: ${animal.sonido()}")
            if (animal is AccionAnimal) {
                println("Moviéndose: ${animal.moverse()}, Comiendo: ${animal.comer()}")
            }
            println()
        }
    }
}