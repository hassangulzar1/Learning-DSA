class TrieNode:
    def __init__(self):
        self.children = {}
        self.end = False
    
class WordDictionary:

    def __init__(self):
        self.root  = TrieNode()
        

    def addWord(self, word: str) -> None:
        node = self.root

        for ch in word:
            if ch not in node.children:
                node.children[ch] = TrieNode()
            node = node.children[ch]
        
        node.end = True
    
        

    def search(self, word: str) -> bool:

        def dfs(j,root):

            node = root

            for i in range(j,len(word)):
                c = word[i]

                if c == ".":
                    for child in node.children.values():
                        if dfs(i + 1,child):
                            return True
                    return False
                else:
                    if c not in node.children:
                        return False
                    node = node.children[c]

            return node.end
        
        return dfs(0,self.root)
           
                        
            
              
                 





        


# Your WordDictionary object will be instantiated and called as such:
# obj = WordDictionary()
# obj.addWord(word)
# param_2 = obj.search(word)