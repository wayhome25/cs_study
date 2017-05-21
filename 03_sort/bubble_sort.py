import unittest

def bubblesort(alist):
    for i in range(len(alist)-1):
        for j in range(len(alist)-1):
            if alist[j] > alist[j+1]:
                alist[j], alist[j+1] = alist[j+1], alist[j]
    return alist


class unit_test(unittest.TestCase):
    def test(self):
        self.assertEqual([1,2,3,4,5,6], bubblesort([4,6,1,3,5,2]))

if __name__=='__main__':
    unittest.main()
