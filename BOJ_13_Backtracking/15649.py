def solution(arr, count, result):
    if count == 0:
        printArray(result)
        return
    count -= 1
    for i in range(len(arr)):
        current = arr.pop(i)
        result.append(current)
        solution(arr, count, result)
        arr.insert(i, current)
        result.remove(current)


def printArray(arr):
    for i in range(len(arr)):
        print(arr[i], end=" ")
    print()


def main():
    N, M = map(int, input().split(' '))
    solution([i for i in range(1, N + 1)], M, [])


main()