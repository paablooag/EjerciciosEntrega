package com.example.ejerciciosentrega

import kotlin.math.ln


fun main() {
        var array = arrayOf(1, 10, 3, 4)
        println(Maximo(array))

        println(Sumatoria(array))

        println(distancia(12.0))

        println(palindromo("Nose jaja"))

        println(contar("pito", 'a'))

        println(contar2("pito pito", "it"))

        println(ejer7("pito chico jaja, eres to gay mirate los apuntes pringao"))

        println(ejer8(245))

        println(ejer9(23, 29))

        println(ejer10(9))

        println(ejer11(12,12))

        println(ejer12(5444))

        println(ejer13("p.pito"))

        println(ejer14(6))


        val arrayA = intArrayOf(1,2,3,4,5)
        val arrayB = intArrayOf(1,2,3,6,5)
        val resultado=(ejer15(arrayA,arrayB))
        println("Comparacion de arrays: ${resultado.joinToString () }")

        println(ejer20(4))

        println(ejer21("hola"))

        println(ejer22(6))

    println(ejer23(153))

    println(ejer26("Hola bebe me llamo guacamole"))

    println(ejer28("holapepe"))

    println(ejer29("paco", "paco"))

    println(ejer30(6))
    }


    //ejercicios1
    fun Maximo(array: Array<Int>): Int {
        var ress = array[0]
        for (i in array.indices) {
            if (array[i] > ress) {
                ress = array[i]
            }

        }
        return ress

    }

    //ejercicios2
    fun Sumatoria(array:Array<Int>): Int{
        var sumatoria=0
        for ( i in array.indices){
            sumatoria+=array[i]
        }
        return sumatoria
    }

    //Ejercicios3
    fun distancia(double: Double): Double{
        return double*1.6
    }

    //ejercicios4
    fun palindromo(frase:String):Boolean{
        var reversa= frase.reversed().lowercase()
        var siono=true
        for(i in frase.indices){
            if(reversa[i]!=frase[i]){
                siono=false
            }
        }
        return siono
    }

    //ejercicios5
    fun contar(frase: String, letra:Char):Int{
        var contador=0
        for(i in frase.indices){
            if(frase[i]==letra){
                contador++
            }
        }
        return contador
    }

    //ejercicios6
    fun contar2(frase: String, frase2:String):Int{
        var contador=0
        var contFrase=0
        var contadorfrase=frase.length
        var elementopito = frase[0]

        for(i in frase) {
            if (contador>0) {
                if(i==frase[contador]){
                    contador++
                }else{
                    contador=0
                }
            } else {
                if (i == elementopito) {
                    contFrase++
                }
            }
        }
        return  contFrase
    }


    //ejercicio7
    fun ejer7(frase: String):String{
        var arrayPalabra = frase.split(" ")
        var res="";
        for (i in arrayPalabra.indices){
            res+=arrayPalabra[i][0].uppercase()+arrayPalabra[i].substring(1)+" "
        }
        return res
    }

    //ejercicio8
    fun ejer8 (numero:Int):Int{
        var res = 0
        var cifra = 0
        var numero2 = numero
        while (numero2%10!=0){
            cifra=numero2%10
            numero2 = numero2/10
            res+=cifra
        }
        return res
    }

    //ejercicio9

    fun ejer9(numero: Int, numero2: Int): Int{
        var res=0

        for (i in numero .. 0 ){
            res=numero2%numero

        }

        return res
    }

//ejercicio10
fun ejer10(n: Int): Int {

    var a = 0
    var b = 1
    var resultado = 0

    for (i in 2..n) {
        resultado = a + b
        a = b
        b = resultado
        print(resultado)
    }
    return resultado
}

//ejercicio11
    fun ejer11(n1:Int, n2:Int):Boolean{

    var fact1=0
    var fact2=0

    for (n in 1 .. n1){
        if(n1%n==0){
            fact1=n
        }
    }
    for (n in 1 .. n2){
        if(n1%n==0){
            fact2=n
        }
    }

    if(fact1!=0 && fact2!=0){
        if(fact1==fact2){
            return false
        }
    }
    return true
    }

//ejercicio12
    fun ejer12(n:Int):Boolean{
    var siono=false
    var numero=""
    var numero2=""

        numero=n.toString()
        numero2=numero.reversed()
    if(numero.equals(numero2)){
        siono=true
    }
    return siono
    }

//ejercicio13
    fun ejer13(cadena:String):String{
        var res=""
        var id= cadena.split("#")
        var id2 = id[0].split(".")
        var div = cadena.split(".")
         if(cadena.contains(".") && !cadena.contains("#")){
            res="<"+div[0]+" class="+div[1]+"</div>"
        }else if(cadena.contains("#") && cadena.contains(".")){
            res="<div"+id[0]+" class="+id2[1]+" id="+id[1]+"></div>"
        }else{
            res="<"+cadena+"><"+cadena+"/>"
        }
        return res
    }

//ejercicio14
    fun ejer14(n:Int){
        for (i in 1 .. n){
            for (j in 1 .. i){
                print(i)
            }
                println()
        }
    }

//ejercicio15
    fun ejer15(array1:IntArray, array2:IntArray):BooleanArray{

       var resultado = BooleanArray(array1.size)

        for (i in array1.indices){
            if(array1[i]!=array2[i]){
                resultado[i]=false
            }else{
                resultado[i]=true
            }
        }

    return resultado
    }

//ejercicio20
fun ejer20(numero: Int):Int{
    var factorial = 1
    for (i in 1..numero) {
        factorial *= i
    }
    return factorial
}

fun ejer21(palabra:String):String{
    return palabra.reversed()
}

fun ejer22(numero:Int):Boolean{
    var divisores=1
    for (i in 2 .. numero/2){
        if(numero%i==0){
            divisores+=i
        }
    }
    return divisores==numero
}

fun ejer23(numero:Int):Boolean{
    var n=0
    var n1=numero
    var res=0
    for (i in numero.toString()){
        n=n1%10
        n1=n1/10
        res+= Math.pow(n.toDouble(), n1.toString().toDouble()).toInt()
    }
    return res==numero
}

fun ejer24(matriz:Array<Array<Int>>):Int{
    var res = matriz[0][0]
    for (i in matriz.indices){
        for (z in matriz[0].indices){
            if(matriz[i][z]>res){
                res=matriz[i][z]
            }
        }
    }
    return res
}

fun ejer25(matriz:Array<Array<Int>>):Int{
    var res = matriz[0][0]
    for (i in matriz.indices){
        for (z in matriz[0].indices){
            if(matriz[i][z]<res){
                res=matriz[i][z]
            }
        }
    }
    return res
}

fun ejer26(text:String):String{
    var lista= text.split(" ")
    var res=lista[0]
    for (i in lista.indices){
        if(lista[i].length>res.length){
            res=lista[i]
        }
    }

    return res
}

fun ejer27(text:String):String{
    var lista= text.split(" ")
    var res=lista[0]
    for (i in lista.indices){
        if(lista[i].length<res.length){
            res=lista[i]
        }
    }

    return res
}

fun ejer28(text:String):Boolean{
    var lista=text.split("")
    var siono=true
    for (i in lista.indices){
        for (z in 0 .. 9){
            if(lista[i].equals(z.toString())){
                siono=false
            }
        }

    }
    return siono
}

fun ejer29(text:String, text2:String):Boolean{

    var confirmar= BooleanArray(text.length)

    var z=0
    loop1@ for (i in text.indices){
        loop2@ for (z in text2.indices){
            if(text[i].equals(text2[z])){
                confirmar[i]=false
                continue@loop1
            }else{
                confirmar[i]=true
            }
        }
    }
    for (i in confirmar.indices){
        if(confirmar[i]==false){
            return true
        }
    }
    return  false
}

fun ejer30(number:Int):Boolean{
    if(number<0){
        return false
    }

    var suma=0
    var n=1
    while(suma<number){
        suma+=n
        if(suma==number){
            return true
        }
        return false
    }
    return false
}

