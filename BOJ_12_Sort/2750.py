import sys

list = []
N = int(sys.stdin.readline().rstrip())

for i in range(N):
    list.append(int(sys.stdin.readline().rstrip()))

for i in range(1, N):
    key = list[i]
    aux = i - 1
    while aux >= 0 and list[aux] > key:
        list[aux + 1] = list[aux]
        aux -= 1
    list[aux + 1] = key

for i in range(N):
    print(list[i])