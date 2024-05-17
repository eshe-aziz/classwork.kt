//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    myFriends()
}

fun myFriends(){
    var friends = arrayOf("Ben", "Paul", "Ken", "Mary", "Susan")
    friends = friends.plus(arrayOf("Natalie", "Gitahi", "Gatweri"))
    println(friends.contentToString())
    println(friends.indexOf("Ken"))

    val statistics = arrayOf(21,14,56,18,9,32,5,6,32,67,88,43)
    println(statistics.sum().toDouble()/statistics.size)

    var friendss = arrayOf("Ben", "Ken", "Paul", "Meg", "Abraham")
    friendss = friendss.sortedArray()
    println(friendss.contentToString())

    friends.forEach { f ->
        println(f)
    }

    statistics.forEach { stat ->
        println(stat*stat)
    }

    for (f in friendss){
        println(f)
    }

    for (stat in statistics){
        println(stat*stat)
    }

    friendss.forEachIndexed{idx, f->
        if(idx in arrayOf(1,2)){
            println(f)
        }
    }
}
