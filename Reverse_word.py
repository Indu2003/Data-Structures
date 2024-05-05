def reverse_words(string):
    # Convert the string to a list of characters for in-place modification
    chars = list(string)

    # Helper function to reverse a portion of the list from start to end (inclusive)
    def reverse_sublist(start, end):
        while start < end:
            chars[start], chars[end] = chars[end], chars[start]
            start += 1
            end -= 1

    # Initialize pointers for tracking word boundaries
    start = end = 0
    while end < len(chars):
        # Move the end pointer until a space or end of string is encountered
        while end < len(chars) and chars[end] != ' ':
            end += 1

        # Reverse the word from start to end-1 (inclusive)
        reverse_sublist(start, end - 1)

        # Move start and end pointers to the next word (or end of string)
        start = end + 1
        end += 1

    # Convert the modified list back to a string
    reversed_string = ''.join(chars)
    return reversed_string

# Example usage:
input_string = "hello world how are you"
result = reverse_words(input_string)
print(result)  # Output: "olleh dlrow woh era uoy"
