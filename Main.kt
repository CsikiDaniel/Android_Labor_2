import DictionaryProvider.createDictionary

fun main() {
    val dict: IDictionary = createDictionary(DictionaryType.HASH_SET)
    println("Number of words: ${dict.SizeDictionary()}")
    var word: String?
    while(true){
        print("What to find? ")
        word = readLine()
        if( word.equals("quit")){
            break
        }
        println("Result: ${word?.let { dict.FindWord(it) }}")
    }

    var monogram = readLine()


}