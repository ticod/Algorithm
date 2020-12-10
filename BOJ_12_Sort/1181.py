import sys

words = []
wordSet = set()
N = int(sys.stdin.readline().rstrip())

for i in range(N):
    word = sys.stdin.readline().rstrip()
    wordSet.add(word)

for word in wordSet:
    words.append(word)

words.sort(key=lambda x: (len(x), x))

for word in words:
    print(word)
