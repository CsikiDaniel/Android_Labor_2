object DictionaryProvider {

    fun createDictionary(typeOfDictionary : DictionaryType) : IDictionary {

        when(typeOfDictionary){
            DictionaryType.ARRAY_LIST -> return ListDictionary
            DictionaryType.HASH_SET -> return HashSetDictionary
            DictionaryType.TREE_SET -> return TreeSetDictionary
        }
    }
}