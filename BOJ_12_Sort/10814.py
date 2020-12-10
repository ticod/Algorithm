import sys


class Member:
    def __init__(self, age, name):
        self.age = age
        self.name = name

    def toString(self):
        return self.age + ' ' + self.name


members = []
N = int(sys.stdin.readline().rstrip())
for i in range(N):
    [age, name] = sys.stdin.readline().rstrip().split(' ')
    members.append(Member(age, name))

members.sort(key=lambda x: int(x.age))

for member in members:
    print(member.toString())
