class trieNode:
    
    def __init__(self):
        self.children = {}
        self.endNode = False

class Trie:

    def __init__(self):
        self.root = trieNode()

    def insert(self, word: str) -> None:
        node = self.root
        for char in word:
            if char not in node.children:
                node.children[char] = trieNode()
            node = node.children[char]
        node.endNode = True

        

    def search(self, word: str) -> bool:
        node = self.root
        for char in word:
            if char not in node.children:
                return False
            node =node.children[char]
        return node.endNode

        

    def startsWith(self, prefix: str) -> bool:

        node = self.root
        for char in prefix:
            if char not in node.children:
                return False
            node = node.children[char]
        return True
        


# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)