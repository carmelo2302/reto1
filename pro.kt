import java.lang.NumberFormatException

fun main (args: Array<String>){
    println("Bienvenido a Recipes Market")
    println("")
    println("")
    println("")
    println("Elige una Opcion Deseada :")
    println("1. hacer una receta ")
    println("2. ver las recetas guardadas ")
    println("3. salir ")
    var agua=0
    var leche=0
    var carne=0
    var verdura=0
    var fruta=0
    var cereal=0
    var huevo=0
    var aceite=0
    var list_reseta:String= ""
    var resp=readLine()!!.toInt()
    try{
        when(resp){
             1 ->{
                println("Estas listo para creal la receta ?")
                println("mira los ingredientes: ")
                 var ingredientes ="""
                     |1. Agua  
                     |2. Leche 
                     |3. Carne 
                     |4. verduras 
                     |5. Frutas 
                     |6. Cereal 
                     |7. Huevos 
                     |8. Aceite
                     | """.trimMargin()

                 println(ingredientes)


                 var ingrediente:String=""
                 var i=0
                 do{
                     println("Cuantos ingredientes tendra la receta?")
                     var cant= readLine()!!.toInt()
                     println("ingrese el ingrediente aqui ,todas las introducciones se tendran que hacer por numeros ")
                     var ingre:String?= readLine()
                     if(ingre=="1"){
                         ingrediente="agua"
                     }
                     if(ingre=="2"){
                         ingrediente="leche"
                     }
                     if(ingre=="3"){
                         ingrediente="carne"
                     }
                     if(ingre=="4"){
                         ingrediente="verdura"
                     }
                     if(ingre=="5"){
                         ingrediente="frutas"
                     }
                     if (ingre=="6"){
                         ingrediente="cereal"
                     }
                     if (ingre=="7"){
                         ingrediente="huevos"
                     }
                     if (ingre=="8"){
                         ingrediente="aceite"
                     }
                     list_reseta=list_reseta+"$ingrediente"
                     println("Usted a agregado el ingrediente : $ingrediente")



                 }while (i>=cant)


            }
            2 ->{
                println("su resetas guardadas son : $list_reseta")


            }
            3 ->{
                println("adios :)")

            }
        }
    }catch(e: NumberFormatException ){
        println("no es valida esa opcion")
    }

}