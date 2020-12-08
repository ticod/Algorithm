import sys
import math


def getDigitLength(num):
    return int(math.log10(num)) + 1


queueList = []
numList = []
N = int(sys.stdin.readline().rstrip())
maxDigitLength = 0

for i in range(10):
    queueList.append([])

for i in range(N):
    num = int(sys.stdin.readline
              ().rstrip())
    numList.append(num)
    maxDigitLength = max(maxDigitLength, getDigitLength(num))

for i in range(maxDigitLength):
    for j in range(len(numList)):
        num = numList.pop()
        queueList[num % (10 ** (i + 1))].append(num)
    for j in range(10):
        while queueList[j]:
            numList.append(queueList[j].pop())

for i in range(N):
    print(numList[i])
