console.log("angarr")

var i = 100.7;
console.log(i);

// condition handling 
// if-else condition to check even or odd no 
var n = 11;
if(n%2==0)
{
    console.log("its a even number ")
} else 
{
    console.log("its messed up")
}

//Multiple condition handling 
//check if num is negative and deisplay it 
// if no is 0 then display itss 0 
//if number is positive then check its odd or even 

var num = 3
if(num<0)
{
    console.log("this is negative no ")
} else if (num ==0)
{
    console.log("this is zero")
} else if(num%2==0)
{
    console.log("this is even")
} else {
    console.log("its an odd")
}

var num =24
for (i=1;i<=15;i++)
{
    console.log(num+"*"+i+"="+num*i)
}

//functions without argument and return value
function hello()

{
    //console.log(n1)
    console.log("bylat")
}
hello();

//functions with arguments
function sum(a,b){
   
    var c = a+b
    return c
}


function mm(a,b){
    var c = a*b
    console.log(c)

}
z=sum(100,200)
mm(z,30)

