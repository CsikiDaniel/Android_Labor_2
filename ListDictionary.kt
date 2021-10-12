import IDictionary.Companion.DictName
import java.io.File

object ListDictionary : IDictionary{
    val listD = mutableListOf<String>()

    init {
        File(DictName).forEachLine {listD.add(it)}
    }

    override fun AddWord(word: String) {
        listD.add(word)
    }

    override fun FindWord(word: String): Boolean {
        if(listD.contains(word))
        {
            return true
        }
        return false
    }

    override fun SizeDictionary(): Int {
        return listD.count()
    }
}