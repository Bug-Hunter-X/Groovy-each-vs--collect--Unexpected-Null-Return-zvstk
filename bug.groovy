def list = [1, 2, 3, 4, 5]

println list.each { it * 2 } //this will print null

println list.collect { it * 2 } //this will print [2, 4, 6, 8, 10]