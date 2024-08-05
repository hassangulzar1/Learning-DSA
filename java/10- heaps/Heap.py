class Heap:
    def __init__(self):
        self.list = []
    
    def swap(self,first,second):
        self.list[first],self.list[second] = self.list[second],self.list[first]

  
