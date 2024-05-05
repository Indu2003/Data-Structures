# to check if the string is palindrome using 2 pointers instead of loops


def palind(string):
    i = 0
    j = len(string) - 1
    while i < j:
        if string[i] != string[j]:
            return False
        else:
            i += 1
            j -= 1
    return True

str_value = "AMRTRMA"
result = palind(str_value)
print(result)