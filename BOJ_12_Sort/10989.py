import sys

N = int(sys.stdin.readline().rstrip())
counts = {}

for i in range(N):
    num = int(sys.stdin.readline().rstrip())
    counts[num] = counts.get(num, 0) + 1

for i in counts:
    for j in range(counts[i]):
        sys.stdout.write(str(i) + '\n')


'''
10
5
2
3
1
4
2
3
5
1
7
'''