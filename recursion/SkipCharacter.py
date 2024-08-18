def skip_character(string, skip):
    return helper(string, skip)


def helper(string, skip):
    result = ''

    if string[0] != 'a':
        result += string[0]

    if len(string) == 1:
        return result

    return result + helper(string[1:], skip)


print(skip_character('baccad', 'a'))
