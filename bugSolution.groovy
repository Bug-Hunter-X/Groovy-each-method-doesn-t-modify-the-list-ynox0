def list = [1, 2, 3, 4, 5]

list.eachWithIndex { item, index ->
    list[index] = item * 2
}

println list

//Alternative using collect

def newList = list.collect { it * 2 }
println newList

//Alternative using map
def anotherList = list.map { it * 2 }
println anotherList