fun main(args: Array<String>){
    	
myloop@for (i in 1..10) {
     
    	for ( j in 1..3){
            
            println("$i $j")
            if ( i == 2 && j == 2 )
            break@myloop
        }
}
    
    myloop@for (k in 1..10) {
     
    	for ( l in 1..3){
            
            
            if ( k == 2 && l == 2 )
            continue@myloop
            
            println("$k $l")
        }
}
}
