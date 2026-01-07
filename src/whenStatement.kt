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

}