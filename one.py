def main():
    string = input("Enter a string: ") # User Input stored in the string variable

    backString = string[::-1] # User input reversed for testing


    if string.lower() == backString.lower(): # checks if the user input matches the reversed user input
        print("Your string " + string + " is a palindrome") # if yes this will print to the screen
    else:
        print("Your string " + string + " is not a palindrome") # else this will print