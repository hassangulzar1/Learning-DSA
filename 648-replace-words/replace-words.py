class TrieNode:
    def __init__(self):
        self.children = {}
        self.end = False

class Trie:
    def __init__(self):
        self.root = TrieNode()
    
    def insert(self,word):
        node = self.root

        for ch in word:
            if ch not in node.children:
                node.children[ch]= TrieNode()
            node = node.children[ch]
        node.end = True

    def search(self,word):
        node = self.root
        res = []

        for ch in word:
            if ch not in node.children:
                return word

            node = node.children[ch]
            res.append(ch)
            if node.end == True:
                return "".join(res)

        return word

class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        TrieDsa = Trie()

        for i in dictionary:
            TrieDsa.insert(i)
        
        ans = []
        for i in sentence.split():
            ans.append(TrieDsa.search(i))
        
        return " ".join(ans)
        