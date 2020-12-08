def solution(s):
    minLength = len(s)

    for i in range(1, len(s) // 2 + 1):
        currentResult = ""
        count = 1
        pre = s[0:i]

        for j in range(i, len(s), i):
            current = s[j: j + i]
            if pre == current:
                count += 1
            else:
                currentResult += getStringByCount(count, pre)
                pre = current
                count = 1

        currentResult += getStringByCount(count, pre)
        minLength = min(len(currentResult), minLength)

    return minLength


def getStringByCount(count, string):
    return (count != 1) and str(count) + string or string


print(solution("aabbaccc"))
print(solution("ababcdcdababcdcd"))
print(solution("abcabcdede"))
print(solution("abcabcabcabcdededededede"))
print(solution("xababcdcdababcdcd"))
