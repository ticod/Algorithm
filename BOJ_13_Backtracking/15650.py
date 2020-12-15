def solution(arr, count, result):
    if count == 0:
        printArray(result)
        return
    count -= 1
    for i in range(len(arr)):
        current = arr.pop(i)
        if result == [] or result[-1] < current:
            result.append(current)
            solution(arr, count, result)
            result.remove(current)
        arr.insert(i, current)


def printArray(arr):
    for i in range(len(arr)):
        print(arr[i], end=" ")
    print()


N, M = map(int, input().split(' '))
solution([i for i in range(1, N + 1)], M, [])
