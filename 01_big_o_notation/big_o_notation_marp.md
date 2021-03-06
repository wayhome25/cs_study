<!-- $theme: default -->

# Big-O Notation

---

## 시간복잡도
- **실행 시간** 이라는 관점에서 알고리즘의 효율을 측정한다.
- 문제를 해결하려고 할 때마다 시간복잡도를 분석하는 습관을 들이면 좋은 개발자가 될 수 있다.
- 이 때 중요한건 **연산자의 숫자 혹은 연산 과정(step)의 수**

---

- 예를 들어 N이라는 인자가 주어졌을 떄, 1부터 N까지를 더하는 함수 sumOfN을 정의한다.

```python
def sumOfN(N):
  theSum = 0
  for i in range(1,N+1):
    theSum += i

  return theSum
```

---

- 함수 sumOfN 에서 주요 연산 횟수를 살펴보면 아래와 같다.

```python
def sumOfN(N):
  theSum = 0 # 1번만 실행된다.
  for i in range(1,N+1):
    theSum += i # 1부터 N 까지 N번 실행된다.

  return theSum
```

---

- 함수 sumOfN 의 시간 복잡도는 아래 같이 표시할 수 있다.
   - `T(n) = 1 + n`
   - 파라미터 n 은 문제의 사이즈를 의미  
   - T(n) 은 사이즈가 n 인 문제를 푸는데 걸리는 시간을 의미, 여기서는 즉 1 + n 를 말한다.
---

## Big-O
- 그럼 문제의 사이즈 n에 따라서 알고리즘 수행 시간은 어떻게 달라질까?
- 문제의 사이즈가 커질수록, 최고 차항의 차수가 결과에 가장 많은 영향을 미친다. (상기 예시에서는 1+n 중 n을 의미한다)
- 이처럼 **시간 복잡도에 가장 큰 영향을 미치는 차항으로 시간복잡도를 나타내는 것을 Big-O 표기법 (Big-O Notation)** 이라고 하며,
  O(f(n)) 과 같이 표기한다. (O는 order 라고 읽는다.)

---

- 간단한 Big-O 표기법의 예

```shell
T(n)=n^2+2n+9 # O(n2)

T(n)=n^4+n^3+n^2+1 # O(n4)

T(n)=5n^3+3n^2+2n+1 # O(n3)
```
---

## worst case, average case, best case
- 문제의 사이즈보다, 데이터가 무엇이냐가 알고리즘의 성능에 더 영향을 미치기도 한다.
- `Big-O는 대부분 최악의 경우를 표현한다.` (quick sort의 경우 예외적으로 average case를(O(N log N)) Big-O로 사용한다.)

```python
def pick5(li):     # li = [5,3,1] 인 경우 1번만 반복
  for i in li:     # li = [1,5] 인 경우 2번 반복
    if i == 5:
      return
```
---

## Big-O 표기법의 종류와 성능
---

### Big-O 표기법의 종류
![스크린샷 2017-04-30 오후 2.45.57](http://i.imgur.com/5jedqD5.png)

---

- O(1) - (상수) Constant
  - 입력되는 데이터양과 상관없이 일정한 실행 시간을 가진다.
  - 알고리즘이 문제를 해결하는데 오직 한 단계만 거친다.

---
- O(logN) Logarithmic
  - 데이터양이 많아져도, 시간이 조금씩 늘어난다.
  - 시간에 비례하여, 탐색 가능한 데이터양이 2의 n승이 된다.
  - 문제를 해결하는데 필요한 단계들이 연산마다 특정 요인에 의해 줄어든다.
  -  만약 입력 자료의 수에 따라 실행 시간이 이 log N 의 관계를 만족한다면 N이 증가함에 따라 실행시간이 조금씩 늘어난다. 이 유형은 주로 커다란 문제를 일정한 크기를 갖는 작은 문제로 쪼갤때 나타나는 유형이다.
  - Binary Search

---

- O(N) Linear
  - 데이터양에 따라 시간이 정비례한다.
  - linear search, for 문을 통한 탐색을 생각하면 되겠다.

---
- O(N log N) log linear
  - 데이터양이 N배 많이 진다면, 실행 시간은 N배 보다 조금더 많아 진다. (정비례 하지 않는다.)
  - 이 유형은 커다란 문제를 독립적인 작은 문제로 쪼개어 각각에 대해 독립적으로 해결하고,나중에 다시 그것들을 하나로 모으는 경우에 나타난다. N이 두배로 늘어나면 실행 시간은 2배보다 약간 더 많이 늘어난다.
  - 퀵소트, 머지소트
---
- O(N^2) Quadratic
  - 데이터양에 따라 걸리는 시간은 제곱에 비례한다. (효율이 좋지 않음, 사용하면 안된다)
  - 이 유형은 이중루프내에서 입력 자료를 처리 하는 경우에 나타난다. N값이 큰값이 되면 실행 시간은 감당하지 못할 정도로 커지게 된다.
  - 문제를 해결하기 위한 단계의 수는 입력값 n의 제곱
  - 2중 for 문을 사용하는 버블소트, 삽입정렬(insertion sort)

---

### 성능비교
- 성능 순서 : O(1)<O(logn)<O(n)<O(nlogn)<O(n2)<O(n3)<O(2n)
![bigo_graph](http://i.imgur.com/EPdDmwQ.jpg)

---

![스크린샷 2017-04-30 오후 2.54.04](http://i.imgur.com/ujTUbDy.png)

---

# 실습
---

## big-O 를 계산해보자!
- 각 연산의 시간 복잡도를 계산하고 최종 시간복잡도를 big-O 로 표시해본다.
```python
a=5
b=6
c=10
for i in range(n):
   for j in range(n):
      x = i * i
      y = j * j
      z = i * j
for k in range(n):
   w = a*k + 45
   v = b*b
d = 33
```
---

```python
a=5 # Constant 1
b=6 # Constant 1
c=10 # Constant 1
for i in range(n):
   for j in range(n):
      x = i * i # n^2 => for문 중첩 사용
      y = j * j # n^2
      z = i * j # n^2
for k in range(n):
   w = a*k + 45 # n
   v = b*b # n
d = 33 # Constant 1
```
- 각 연산 횟수를 더하면 시간 복잡도는 아래와 같다
- `T(n) = 3 + 3ㅜㅜn^2 + 2n + 1 = 3n^2 + 2n + 4`
- 이를 Big-O 로 표현하면 O(n^2) 이다.
---

## self check
Write two Python functions to find the minimum number in a list.   
The first function should compare each number to every other number on the list. O(n^2).    
The second function should be linear O(n)

---

### O(n^2)

```python
# (O^2)
import time
from random import randrange


def findMin(alist):
    overallmin = alist[0]
    for i in alist:
        issmallest = True
        for j in alist: # O(n^2) => for문 중첩
            if i > j:
                issmallest = False
        if issmallest:
            overallmin = i
    return overallmin

# 확인
print(findMin([5,2,1,0]))
print(findMin([0,2,3,4]))

# 연산시간 (O(n^2))
for listSize in range(1000, 10001, 1000):
    alist = [randrange(100000) for _ in range(listSize)]
    start = time.time()
    print(findMin(alist))
    end = time.time()
    print("size: {}, time: {}".format(listSize, end-start))
```
---

### O(n)

```python

def findMin(alist):
    minsofar = alist[0]
    for i in alist: # O(n) alist의 길이만큼 반복, loop 중첩 없음   
        if i < minsofar:
            minsofar = i
    return minsofar

# 확인
print(findMin([5,2,1,0]))
print(findMin([0,2,3,4]))

# 연산시간 (O(n))
for listSize in range(1000, 10001, 1000):
    alist = [randrange(100000) for _ in range(listSize)]
    start = time.time()
    print(findMin(alist))
    end = time.time()
    print("size: {}, time: {}".format(listSize, end-start))
```
---

# reference
- [big-o notation](http://interactivepython.org/runestone/static/pythonds/AlgorithmAnalysis/BigONotation.html#tbl-fntable)
- [시간 복잡도 vs 공간 복잡도](http://ledgku.tistory.com/33)
- [(번역) 알고리즘 쉽게 이해하기 : 시간 복잡도와 Big-O 표기](https://joshuajangblog.wordpress.com/2016/09/21/time_complexity_big_o_in_easy_explanation/)
