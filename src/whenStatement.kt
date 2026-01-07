fun main()
{
    //use "when" we use have multiple conditional branches
    var a=35
    var b=45
    var c=55
    var opr="subtract"

    when (opr){
        "add"->println("addition is ${a+b}")
        "subtract"->{
            var d= a-c
            println("value of a-c=$d");
        }
        else-> println("wrong operation specified")
    }
    var e=11
    var f=15
    var g=when (e){
        9->e-f
        in 10..20-> e+f
        else->e*f
    }
    //when we assign the value of when to a variable else statement
    // is a must to make when exhaustive
    println(g)
}