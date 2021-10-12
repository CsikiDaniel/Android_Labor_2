import IDictionary.Companion.DictName
import java.io.File
import java.util.*

object TreeSetDictionary : IDictionary {

    val treeSetD = TreeSet<String>()

    init {
        File(DictName).forEachLine {treeSetD.add(it)}
    }

    override fun AddWord(word: String) {
        treeSetD.add(word)
    }

    override fun FindWord(word: String): Boolean {
        if(treeSetD.contains(word))
        {
            return true
        }
        return false
    }

    override fun SizeDictionary(): Int {
        return treeSetD.count()
    }


}