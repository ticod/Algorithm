import sys

list = []
N = int(sys.stdin.readline().rstrip())

for i in range(N):
    list.append(int(sys.stdin.readline().rstrip()))

list.sort();

for i in range(N):
    print(list[i])