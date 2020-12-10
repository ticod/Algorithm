CONST_X = 0
CONST_Y = 1
points = []
N = int(input())

for i in range(N):
    [a, b] = map(int, input().split())
    points.append([a, b])

points.sort()

for i in range(N):
    print(points[i][0], points[i][1])
