import DictionaryProvider.createDictionary

fun main() {
    val dict: IDictionary = createDictionary(DictionaryType.HASH_SET)
    println("Number of words: ${dict.SizeDictionary()}")
    var word: String?
   /* while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict.FindWord(it) }}")
    }*/

    val name = "Csiki Daniel"

println("My name Monogram is: ")
    println(name.monogram())

    val list = mutableListOf<String>("Gorog Dinnye","pear","Strawberry","mokus")

    println(list.joining("#"))

    println(list.longest())


}

fun String.monogram() : String{
    return this.split(" ").map { it[0] }.joinToString { "" }
}

fun List<String>.joining(separator: String) : String{
    return this.joinToString(separator)

}

fun List<String>.longest() : String{
    return this.maxByOrNull { it.length }.toString()
}
