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