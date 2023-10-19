package com.example.ejerciciosentrega



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

        println(ejer13("div.clase#POLO"))

        println(ejer14(6))

        val arrayA = intArrayOf(1,2,3,4,5)

        val arrayB = intArrayOf(1,2,3,6,5)
        val resultado=(ejer15(arrayA,arrayB))
        println("Cmparacion de arrays: ${resultado.joinToString () }")
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
            res="<div class="+div[1]+"</div>"
        }else if(cadena.contains("#") && cadena.contains(".")){
            res="<div class="+id2[1]+" id="+id[1]+"></div>"
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

