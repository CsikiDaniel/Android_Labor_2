import IDictionary.Companion.DictName
import java.io.File
import kotlin.collections.HashSet

object HashSetDictionary : IDictionary{

    val HashSetD = HashSet<String>()

    init {
        File(DictName).forEachLine {HashSetD.add(it)}
    }

    override fun AddWord(word: String) {
        HashSetD.add(word)
    }

    override fun FindWord(word: String): Boolean {
        if(HashSetD.contains(word))
        {
            return true
        }
        return false
    }

    override fun SizeDictionary(): Int {
        return HashSetD.count()
    }

}