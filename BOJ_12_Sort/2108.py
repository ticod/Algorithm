import sys


def sol1(numbers):
    sum = 0
    for i in range(len(numbers)):
        sum += numbers[i]
    return round(sum / len(numbers))


def sol2(numbers):
    return numbers[len(numbers) // 2]


def sol3(numbers):
    temp = {}
    for i in numbers:
        temp[i] = temp.get(i, 0) + 1
    many = max(temp.values())
    result = []
    for i in temp:
        if temp[i] == many:
            result.append(i)
    return result



def sol4(numbers):
    maxNum = max(numbers)
    minNum = min(numbers)
    return maxNum - minNum


def main():
    N = int(sys.stdin.readline().rstrip())
    numbers = []

    for i in range(N):
        numbers.append(int(sys.stdin.readline().rstrip()))

    numbers.sort()

    print(sol1(numbers))
    print(sol2(numbers))
    sol3Result = sol3(numbers)
    if len(sol3Result) > 1:
        sol3Result.sort()
        print(sol3Result[1])
    else:
        print(sol3Result[0])
    print(sol4(numbers))


main()
