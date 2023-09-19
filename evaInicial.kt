package com.pablo.evinicial

import kotlin.math.PI
import kotlin.math.round

//MENU PARA ACCEDER A EJERCICIOS
fun presentacion(opciones: MutableList<String>){
    for(i in opciones){
        println(i)
    }
}
fun main(){
    var n: Int
    do{
        var opciones: MutableList<String> = mutableListOf("1 - EJERCICIO 1", "2 - EJERCICIO 2", "3 - EJERCICIO 3", "4 - EJERCICIO 4", "5 - EJERCICIO 5", "6 - EJERCICIO 6", "7 - EJERCICIO 7", "8 - EJERCICIO 8",
            "9 - EJERCICIO 9", "10 - EJERCICIO 10", "11 - EJERCICIO 11")
        presentacion(opciones)
        println("Esta es mi evaluación inicial, introduce el número del ejercicio que quieras comprobar, 0 para salir: ")
        n= readLine()?.toInt() as Int

        when(n){
            1->ejercicio1()
            2->ejercicio2()
            3->ejercicio3()
            4->ejercicio4()
            5->ejercicio5()
            6->ejercicio6()
            7->ejercicio7()
            8->ejercicio8()
            9->ejercicio9()
            10->ejercicio10()
            11->ejercicio11()
        }
    }while(n!=0)
    println("Saliendo..")
}

//ejercicio 1
fun ejercicio1(){
    println("EJERCICIO 1: Hacer una programa que compruebe si el contenido de una variable entera es par o impar.")

    var n: Int
    print("Introduce un número: ")
    n= readLine()?.toInt() as Int

    if(n%2==0){
        println("La variable es par")
    }
    else println("La variable es impar")
}

//ejercicio 2
fun ejercicio2(){
    println("EJERCICIO 2: Hacer una programa con una función que calcule la longitud de la circunferencia y el área del círculo a partir de su  radio. ")

//longitud circunferencia 2piR
//area circunferencia piR^2
    var l: Double
    var a: Double
    print("Introduce un radio: ")
    l= readLine()?.toDouble() as Double
    a=PI*l*l
    l=2*PI*l
    println(String.format("La longitud de la circunferencia es: %.2f",l))
    println(String.format("El área de la circunferencia es: %.2f",a))
}

//ejercicio 3
fun ejercicio3(){
    println("EJERCICIO 3: Hacer una programa que a partir de un valor contenido en una variable entera solicitada por consola, cuyo valor debe estar entre 1 y 7, muestre el nombre del día de la semana correspondiente (lunes=1, martes=2  …) \n" +
            " También otra versión que indique si el nº corresponde a un día laborable o a un festivo.")

    var n: Int
    var contador: Int = 0
    do{
       if(contador==0){
           print("Introduce un número entero entre 1 y 7: ")
       }
       else {
           print("Error. Introduce un número entero entre 1 y 7: ")
       }
        n= readLine()?.toInt() as Int
        contador++
    }while(n !in 1..7)
    when(n){
        1-> print("Lunes")
        2-> print("Martes")
        3-> print("Miércoles")
        4-> print("Jueves")
        5-> print("Viernes")
        6-> print("Sábado")
        7-> print("Domingo")
    }
    when(n){
    1,2,3,4,5->print("Laborable")
    else->print("Festivo")
    }
}

//ejercicio 4
fun ejercicio4(){
    println("EJERCICIO 4: Programa que dados tres datos numéricos  los muestre ordenados de menor a mayor.")

    var n1: Int
    var n2: Int
    var n3: Int
    var aux: Int
    print("Introduce un número: ")
    n1= readLine()?.toInt() as Int
    print("Introduce un número: ")
    n2= readLine()?.toInt() as Int
    print("Introduce un número: ")
    n3= readLine()?.toInt() as Int
    var datos: List<Int> = listOf(n1,n2,n3)
    println("Los datos ordenados de menor a mayor son: ")
    for (i in datos.sorted()){
        println(i)
    }
}

//ejercicio 5
fun ejercicio5(){
    println("EJERCICIO 5: Programa que genere un nº aleatorio entre 0 y 500 e informe del intervalo en el que se encuentra dicho nº, entre los siguientes: [0,100), [100,200), [200,300), [300,400), [400,500].")

    var n: Double = Math.random()*500
    println("El número es $n")
    when((n/100).toInt()){
        0->print("Se encuentra en el intervalo [0,100)")
        1->print("Se encuentra en el intervalo [0,200)")
        2->print("Se encuentra en el intervalo [0,300)")
        3->print("Se encuentra en el intervalo [0,400)")
        4->print("Se encuentra en el intervalo [0,500)")
    }
}

//ejercicio 6
fun ejercicio6(){
    println("EJERCICIO 6: Programa que dado un número entero obtenga y devuelva la tabla de multiplicar de un número resolviéndolo con los 3 tipos de estructuras de control repetitivas: mientras, repetir hasta y para.")

    var n: Int
    var producto: Int
    var j: Int=1
    print("Introduce un número: ")
    n= readLine()?.toInt() as Int
    println("Su tabla de multiplicar es:")
    //forma 1
    for(i in 1..10){
        producto = i*n
        println("$i x $n = $producto")
    }
    println("Su tabla de multiplicar es:")
    //forma 2
    while(j in 1..10){
        producto = j*n
        println("$j x $n = $producto")
        j++
    }
    j=1
    println("Su tabla de multiplicar es:")
    //forma 3
    do{
        producto = j*n
        println("$j x $n = $producto")
        j++
    }while(j in 1..10)
}

//ejercicio 7
fun ejercicio7(){
    println("EJERCICIO 7: Programa que presente las tablas de multiplicar del 1 al 10, cada una con su un título TABLA DE MULTIPLICAR DEL n")

    var producto: Int
    for(i in 1..10){
        println("TABLA DE MULTIPLICAR DE $i: ")
        for(j in 1..10){
            producto=i*j
            println("$j x $j = $producto")
        }
    }
}

//ejercicio 8
fun ejercicio8(){
    println("EJERCICIO 8: Programa que obtenga y devuelva la lista de los divisores positivos de un nº entero positivo guardado en una variable. Por ejemplo, si el nº introducido  es el 14 deberá devolver los números 1, 2, 7 y 14.")

    var n: Int
    var listaDivisores:MutableList<Int> =mutableListOf(1)
    do {
        print("Introduce un número entero positivo: ")
        n = readLine()?.toInt() as Int
    }while(n<=0)
    for(i in 2..n/2){
        if(n%i==0) listaDivisores.add(i)
    }
    println("Sus divisores son: ")
    for(i in listaDivisores){
        println("$i")
    }
}

//ejercicio 9
fun ejercicio9(){
    println("EJERCICIO 9: Programa que obtenga y devuelva los 20 primeros términos de la serie de Fibonacci definida por: \n" +
            "\n" +
            "F0=0    F1=1   F2=1   F3= F2 + F1  …..Fn=Fn-1 + Fn-2")

    var serieFib: MutableList<Int> = mutableListOf(0,1,1)

    for(i in 3..19){
        serieFib.add(serieFib.get(i-2)+serieFib.get(i-1))
    }
    println("Los 20 primeros términos de la serie de Fibonacci son: ")
    for(i in serieFib){
        println(i)
    }
}

//ejercicio 10
fun getDivisores(n: Int):MutableList<Int>{
    var listaDivisores: MutableList<Int> = mutableListOf(1)
    for(i in 2..n/2){
        if(n%i==0) listaDivisores.add(i)
    }
    return listaDivisores
}
fun ejercicio10(){
    println("EJERCICIO 10: Programa que dado un nº entero positivo devuelva si es o no primo")

    var n: Int
    do {
        print("Introduce un número entero positivo: ")
        n = readLine()?.toInt() as Int
    }while(n<=0)
    if(getDivisores(n).size==1){
        println("Es primo")
    }
    else{
        println("No es primo")
    }
}

//ejercicio 11
/*fun getDivisores(n: Int):MutableList<Int>{
    var listaDivisores: MutableList<Int> = mutableListOf(1)
    for(i in 2..n/2){
        if(n%i==0) listaDivisores.add(i)
    }
    return listaDivisores
}*/
fun perfecto(n: Int):Boolean{
    var total: Int = 0
    for(i in getDivisores(n)){
        total+=i
    }
    return n==total
}
fun ejercicio11(){
    println("EJERCICIO 11: Programa que dado un nº  entero positivo  devuelva si es o no perfecto. Un número perfecto es aquel que es igual a la suma de sus divisores menos él mismo")

    var n: Int
    do {
        print("Introduce un número entero positivo: ")
        n = readLine()?.toInt() as Int
    }while(n<=0)
    if(perfecto(n)){
        print("Es perfecto")
    }
    else{
        print("No es perfecto")
    }
}

