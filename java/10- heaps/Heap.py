class Heap:
    def __init__(self):
        self.list = []

    def swap(self, first, second):
        self.list[first], self.list[second] = self.list[second], self.list[first]

    def parent(self, index):
        return (index - 1) // 2

    def left(self, index):
        return index * 2 + 1

    def right(self, index):
        return index * 2 + 2

    def insert(self, value):
        self.list.append(value)
        self.upheap(len(self.list) - 1)

    def upheap(self, index):
        if index == 0:
            return
        p = self.parent(index)
        if self.list[index] < self.list[p]:
            self.swap(index, p)
            self.upheap(p)

    def remove(self):
        if not self.list:
            raise Exception("Removing from an empty heap!")
        
        temp = self.list[0]
        last = self.list.pop()
        if self.list:
            self.list[0] = last
            self.downheap(0)
        
        return temp

    def downheap(self, index):
        min_index = index
        left_index = self.left(index)
        right_index = self.right(index)

        if left_index < len(self.list) and self.list[min_index] > self.list[left_index]:
            min_index = left_index
        
        if right_index < len(self.list) and self.list[min_index] > self.list[right_index]:
            min_index = right_index
        
        if min_index != index:
            self.swap(min_index, index)
            self.downheap(min_index)

    def heap_sort(self):
        sorted_list = []
        while self.list:
            sorted_list.append(self.remove())
        return sorted_list

# Example usage
heap = Heap()
heap.insert(3)
heap.insert(1)
heap.insert(2)
heap.insert(4)

print(heap.heap_sort())  # Output: [1, 2, 3, 4]
