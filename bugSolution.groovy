def list = [1, 2, 3, 4, 5]

// Incorrect use of each: returns null
def doubledListEach = list.each { it * 2 }
println "Result of each: $doubledListEach" //Prints null

// Correct use of collect: returns a new list
def doubledListCollect = list.collect { it * 2 }
println "Result of collect: $doubledListCollect" //Prints [2, 4, 6, 8, 10]