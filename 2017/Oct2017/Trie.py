
class TrieNode(object):
    def __init__(self):
        self.isWord = False
        self.next = {}

class Trie(object):
    
    
            
    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.root = TrieNode()
        

    def insert(self, word):
        """
        Inserts a word into the trie.
        :type word: str
        :rtype: void
        """
        tmp = self.root
        for c in word:
            if c not in tmp.next:
                tmp.next[c] = TrieNode()
            tmp = tmp.next[c]
        tmp.isWord = True
        

    def search(self, word):
        """
        Returns if the word is in the trie.
        :type word: str
        :rtype: bool
        """
        tmp = self.root
        for c in word:
            if c not in tmp.next:
                return False
            tmp = tmp.next[c]
        return tmp.isWord
        

    def startsWith(self, prefix):
        """
        Returns if there is any word in the trie that starts with the given prefix.
        :type prefix: str
        :rtype: bool
        """
        tmp = self.root
        for c in prefix:
            if c not in tmp.next:
                return False
            tmp = tmp.next[c]
        return True
        
        


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)