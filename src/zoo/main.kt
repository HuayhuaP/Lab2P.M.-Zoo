package zoo

fun main() {
    val zoologico = Zoologico()

    val tiburon = Tiburon("Tiburón Blanco")
    val delfin = Delfin("Delfín Nariz de Botella")

    zoologico.agregarAnimal(tiburon)
    zoologico.agregarAnimal(delfin)

    zoologico.mostrarAnimales()
}