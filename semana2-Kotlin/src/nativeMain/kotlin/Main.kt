fun main() {
    /*val tipoDeEmpleado: Int = 0
    val empleado = tipoDeEmpleado()
    val salario = Salario(empleado as Empleado)
    println("Usted escogio el puesto de $empleado el salario del puesto escogido es de "+ salario.calcularSueldo())*/
    metodoSinPOO()
}

fun tipoDeEmpleado(): Any {
    println("\nBienvenido al programa para calcular el salario de los diferentes roles\n")
    println("Para seleccionar el puesto de Gerente presione 1 \nPara seleccionar el puesto de Operador presione 2 \nPara seleccionar el puesto de Contador presione 3")
    val empleado = when (readln().toInt()) {
        1 -> Gerente()
        2 -> Operador()
        3 -> Contador()
        else -> Gerente()
    }
    return empleado
}

class Salario(private val empleado: Empleado){
    fun calcularSueldo(): Int {
        return empleado.sueldo()
    }
}

abstract class Empleado{
    protected abstract val pagoHora: Int
    protected abstract val nroHoras: Int
    protected abstract val pagoMes: Int

    fun sueldo(): Int {
        return pagoMes
    }
}

class Gerente : Empleado(){
    override val pagoHora: Int = 200
    override val nroHoras: Int = 200
    override val pagoMes = nroHoras * pagoHora
}

class Operador : Empleado(){
    override val pagoHora: Int = 10
    override val nroHoras: Int = 230
    override val pagoMes = nroHoras * pagoHora
}

class Contador : Empleado(){
    override val pagoHora: Int = 50
    override val nroHoras: Int = 200
    override val pagoMes = nroHoras * pagoHora
}

fun metodoSinPOO() {
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
            else -> {"la opcion seleccionada no existe"}
        }
        when (x) {
            1 -> result = nroHoras * 200
            2 -> result = nroHoras * 10
            3 -> result = nroHoras * 50
        }
        println("El puesto seleccionado fue $i con un total trabajado de $nroHoras horas para un sueldo total de $result")
    } else {
        println("la opcion seleccionada no existe")
    }
}