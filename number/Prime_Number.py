# Print all the prime numbers from 1 till n.

def prime_numbers(n):
    numbers = []
    for i in range(1, n + 1):
        count = 0
        for j in range(1, (i // 2) + 1):
            if i % j == 0:
                count += 1
        if count == 1:
            numbers.append(i)

    return numbers


print(prime_numbers(20))
