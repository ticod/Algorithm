points = []
N = int(input())

for i in range(N):
    [a, b] = map(int, input().split())
    points.append([a, b])

points.sort(key=lambda x: (x[1], x[0]))

for i in range(N):
    print(points[i][0], points[i][1])
