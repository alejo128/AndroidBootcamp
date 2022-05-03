fun main() {
    println("\nBienvenido al programa para calcular el salario de los diferentes roles\n")
    println("Para seleccionar el puesto de Gerente presione 1 \nPara seleccionar el puesto de Operador presione 2 \nPara seleccionar el puesto de Contador presione 3")
    val x = readln().toInt()
    if (x == 1 || x == 2 || x == 3) {
        println("ingrese el numero de horas trabajadas")
        val nroHoras = readln().toInt()
        var result: Int = 0

        val i = when (x) {
            1 -> "Gerente"
            2 -> "Operador"
            3 -> "Contador"
            else -> {""}
        }
        when (x) {
            1 -> result = nroHoras * 200
            2 -> result = nroHoras * 10
            3 -> result = nroHoras * 50
        }
        println("El puesto seleccionado fue $i con un total trabajado de $nroHoras horas para un sueldo de $result dolares")
    } else {
        println("la opcion seleccionada no existe")
    }
}