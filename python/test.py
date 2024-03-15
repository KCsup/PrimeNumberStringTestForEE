def main():
    print(get_prime_string(3))


def get_prime_string(n):
    primeStore = [2]
    primeConcat = "2"

    for i in range(n + 5):
        nextPrime = primeStore[i] + 1

        primeFound = False
        while not primeFound:
            for c in range(2, nextPrime):
                if nextPrime % c == 0:
                    nextPrime += 1
                    break
                elif c == nextPrime - 1:
                    primeFound = True
                    break

        primeStore.append(nextPrime)
        primeConcat += str(nextPrime)

    return primeConcat[n:n+5]


if __name__ == "__main__":
    main()
