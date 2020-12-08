def main():
    N = input()
    array = [N[i] for i in range(len(N))]
    array.sort(reverse=True)
    print("".join(array))


main()