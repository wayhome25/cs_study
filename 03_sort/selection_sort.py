import unittest

def selection_sort(li):
    for i in range(len(li)-1):
        min_idx = i
        for j in range(i+1, len(li)):
            if li[min_idx] > li[j]:
                min_idx = j
        li[i], li[min_idx] = li[min_idx], li[i]
    return li

class unit_test(unittest.TestCase):
    def test(self):
        self.assertEqual([1,2,3,4,5,6], selection_sort([4,5,1,3,2,6]))
        self.assertEqual([1, 2, 3, 4, 5, 6], selection_sort([6, 4, 3, 1, 2, 5]))
        self.assertEqual([1, 2, 3, 4, 5, 6], selection_sort([6, 5, 4, 3, 2, 1]))
                
if __name__ == '__main__':
    unittest.main()


