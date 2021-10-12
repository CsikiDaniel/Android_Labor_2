interface IDictionary {

    fun AddWord(word : String)
    fun FindWord(word : String) : Boolean
    fun SizeDictionary() : Int
    companion object{val DictName = "D:\\My Folder\\4. év I. félév\\Android Programozas\\Labor_02\\src\\main\\resources\\dict.txt"}
}