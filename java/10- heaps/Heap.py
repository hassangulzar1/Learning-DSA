class Heap:
    def __init__(self):
        self.list = []
    
    def swap(self,first,second):
        self.list[first],self.list[second] = self.list[second],self.list[first]
    
    def parent(self,index):
        return (index - 1) // 2
    
    def left(self,index):
        return index * 2 + 1
    
    def right(self,index):
        return index * 2 + 2
    
    def insert(self,value):
        self.list.append(value)
        self.upheap(len(self.list) - 1)

    def upheap(self,index):
        if index == 0:
            return
        
        p = self.parent(index)

        if self.list[index] < self.list[p]:
            self.swap(index,p)
            self.upheap(p)

    def remove(self):
        if len(self.list) == 0:
            raise Exception("Removing from and empty heap!")
        
        temp = self.list[0]
        last = self.list.pop()

        if self.list:
            self.list[0] = last
            self.downheap(0)

    def downheap(self,index):
        min = index
        left = self.left(index)
        right = self.right(index)
        if left < len(self.list) and self.list[min] > self.list[left]:
            min = left
        
        if right < len(self.list) and self.list[min] > self.list[right]:
            min = right

        if min != index:
            self.swap(min,index)
            self.downheap(min)

    
    


    






  
