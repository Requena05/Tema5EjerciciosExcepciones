package com.example.tema5ejerciciosexcepciones

import java.util.Locale

fun main(){
    /*Ejercicio 1
    * Escribe una función que tome una cadena
    * como parámetro e imprima su longitud.*/
    var cadena1="Viva el vino"
    var cadena2="Viva ll vino"
    fun ejercicio1(){
        var cadenita = "Hola mundo perro"
        println(cadenita.length)

    }
    ejercicio1()
    /*
    Ejercicio 2
    Comparación de Cadenas: Crea dos cadenas y
    utiliza el metodo equals para determinar si
    son iguales*/
    fun ejercicio2(){
        println(cadena1.equals(cadena2))
    }
    ejercicio2()
    /*
    * Ejercicio 3
    * Utiliza el metodo compareTo para comparar
    * dos cadenas y muestra el resultado.*/
    fun ejercicio3(){
        println(cadena1.compareTo(cadena2))

    }
    ejercicio3()
    /*
    * Ejercicio 4
    * Toma una cadena y conviértela
    * completamente a mayúsculas.*/
    fun ejercicio4(){
        println(cadena1.uppercase(Locale.ROOT))
    }
    ejercicio4()
    /*
    * Ejercicio 5
    * Haz lo mismo, pero esta vez conviértela
    * completamente a minúsculas. */
    fun ejercicio5(){
        println(cadena1.lowercase(Locale.ROOT))
    }
    ejercicio5()
    /*
    * Ejercicio 6
    * Toma una cadena con espacios al principio y al
    * final. Utiliza trim para eliminar esos espacios.*/
    fun ejercicio6(){
        var cadenaconespacios=" Viva el vino  "
        println(cadenaconespacios.trim())
    }
    ejercicio6()
    /*
    * Ejercicio 7
    *  Dada una cadena larga, extrae una subcadena
    *  de la posición 5 a la 10.
    * */
    fun ejercicio7(){
        var cadenalarga="Viva el vino y las mujeres"
        println(cadenalarga.substring(5,10)) }
    ejercicio7()
    /*
    * Ejercicio 8
    * 8. Reemplaza todas las ocurrencias de un cierto
    * carácter en una cadena con otro carácter
    * */
    fun ejercicio8(){
        println(cadena1.replace('a','c'))
    }
    ejercicio8()
    /*
    * Ejercicio 9
    * 9. Divide una cadena en un array de subcadenas
    * utilizando un carácter específico como separador.
    * */
    fun ejercicio9(){
        println(cadena1.split(" "))
    }
    ejercicio9()
    /*Ejercicio 10
    * 10. Crea dos cadenas y únelas usando el operador
    * +.
    * */
    fun ejercicio10(){
        println(cadena1+cadena2)
    }
    ejercicio10()
    /*
    * Ejercicio 11
    * 11. Crea una cadena de formato que incluya
    * marcadores de posición y luego rellenarlos con
    * valores.
    * */
    fun ejercicio11(){
        var cadenaconformat=" Tengo los huevos en la freidora %s y la leche en la taza %s"
        println(cadenaconformat.format("boss","mihoyo"))
    }
    ejercicio11()
    /*Ejercicio 12
    *12. Utiliza substring para extraer una parte de una
    * cadena, especificando los índices de inicio y final.
    * */
    fun ejercicio12(){
        println(cadena1.substring(5,10))
    }
    ejercicio12()
    /*Operaciones con Nullable:
13. Define dos variables a y b con valores nulos e intenta
realizar operaciones matemáticas (suma, resta,
multiplicación) con ellas. Maneja adecuadamente los casos
de valores nulos.*/
    fun ejercicio13(){
        var numero1:Int?=null
        var numero2:Int?=null

        try {
            var suma=numero1!!+numero2!!
            var resta=numero1!!-numero2!!
            var multiplicacion=numero1!!*numero2!!
            println("Suma"+suma+"Resta"+resta+"Multiplicacion"+multiplicacion)

        }catch (e:Exception){
            println("Error")

        }


    }
    ejercicio13()
    /*Operador Elvis:
14. Utiliza el operador elvis (?:) para asignar un valor
predeterminado a una variable si esta es nula.
*/
    fun ejercicio14(){
        var numero1:Int?=null
        numero1 = numero1?:0
        println(numero1)
    }
    ejercicio14()
    /*Seguridad con Smart Cast:
15. Crea una función que tome un parámetro de tipo Any y
comprueba si es de tipo String. Si es así, imprime su longitud.
Utiliza smart cast para trabajar de manera segura con el tipo.
*/
    fun ejercicio15(parametro:Any){
        if(parametro !is String){
            return println("No es un string")
        }
        println(parametro.length)
    }
    ejercicio15("rere")
    /*Manejo de Excepciones:
16. Escribe una función que divida dos números ingresados
por el usuario. Implementa el manejo de excepciones para el
caso en que el divisor sea cero o si se ingresa un valor no
numérico.*/
    fun ejercicio16() {
        var numero1: Int? = null
        var numero2: Int? = 0

        try {
            var division = numero1!! / numero2!!
            println(division)
        } catch (e: Exception) {
            println("Error al dividir")
        }
    }
    ejercicio16()
    /*Operador de Lectura Segura (readLine):
17. Utiliza readLine() para leer una entrada del usuario. Asegúrate
de manejar el caso en que el usuario ingrese algo que no pueda
convertirse a un tipo específico.*/
    fun ejercicio17(){
        try {
            var a = readLine()
            var b = a!!.toInt()
            println(b)
        }catch (e:Exception){
           println("Error tiene que entrar un entero")
        }

    }
    ejercicio17()
    /*Operadores Matemáticos:
18. Crea una función que acepte dos números y realice operaciones
matemáticas básicas (suma, resta, multiplicación, división). Maneja
casos especiales, como la división por cero.*/
    fun ejercicio18(){
        var numero1:Int?=null
        var numero2:Int?=0
        try {
            var suma=numero1!!+numero2!!
            var resta=numero1!!-numero2!!
            var multiplicacion=numero1!!*numero2!!
            var division=numero1!!/numero2!!
            println("Suma"+suma+"Resta"+resta+"Multiplicacion"+multiplicacion+"Division"+division)
        }catch (e:Exception){
            println("Error")
        }

    }
    ejercicio18()
    /*Casting Seguro e Inseguro:
19. Declara una variable de tipo Any y realiza un casting seguro e
inseguro a otros tipos. Maneja los casos donde el casting inseguro
podría generar una excepción*/
    fun ejercicio19(){

        try {
            var a:Any="Hola"
            var b=a as? Int
            println(b)
            var c=a as Int
            println(c)
        }catch (e :ClassCastException){
            println("Error al hacer el casting")
        }

    }
    ejercicio19()
/*Uso de try, catch y finally:
20. Escribe un bloque try que contenga código propenso a errores.
En el bloque catch, maneja las excepciones y, en el bloque finally,
imprime un mensaje independientemente de si se lanzó una
excepción o no.*/
    fun ejercicio20(){
        try {
            var a:Any="Hola"
            var b=a as? Int
            println(b)
            var c=a as Int
            println(c)
    }catch (e :ClassCastException){
            println("Error al hacer el casting")
        }finally {
            println("Finalizo")
        }

        }
}


