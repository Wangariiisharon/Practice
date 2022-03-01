fun main(){
var x=sum(50,80,100)
    println(x)
    var y= multiply(50,80,100)
    println(y)
    var g=age(2022,2003)
    println(g)
    var d=statement('I',"am",19,"years","old")
    println(d)
}
fun sum(a:Int,b:Int,c:Int):Int{
    var sum=a+b+c
    return sum
}
fun multiply(a:Int,b:Int,c:Int):Int{
    var multiply=a*b*c
    return multiply
}



fun age(yob:Int,current:Int):Int{
    var age=yob-current
    return age
}
fun statement(j:Char,k:String,l:Int,m:String,o:String):String{
    var statement="$j $k $l $m $o"
    return statement

}

