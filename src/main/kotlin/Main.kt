fun main(args: Array<String>) {
    println("escolha um numero para sabermos a tabuada: ")
    var numero = readLine()!!.toInt()

    print("assim é a tabuada do $numero: \n")

    for (i in 1..10){


        println("$numero x $i = ${numero * i}\n")

    }

    println("a tabuada do numero $numero invertida é: \n ")
    for (i in 10 downTo 1){

        println("$numero x $i = ${numero * i}")
    }


}