# Main Program
Create a scanner for user input.
Repeat until the user chooses Exit:
Display menu:
- 0) Exit
- Human Guesser
- Computer Guesser
Read user's choice.
If choice is 1, call humanGuesser().
If choice is 2, call computerGuesser().
If choice is 0, end program.

# humanGuesser()
Generate a random number between 1 and 100.
Set guess counter to 1.
Repeat until the user guesses correctly:
- Ask user for a guess.
- If guess is less than the answer:
-- Display "too low..."
- Else if guess is greater than the answer:
-- Display "too high..."
- Else:
-- Display "got it!"
-- Stop loop.
- Increase guess counter by 1.
Display "Very good!"

# computerGuesser()
Tell the user to think of a number between 1 and 100.
Set:
- low = 1
- high = 100
- count = 1
Repeat until the computer guesses correctly:
- Calculate:
guess = (low + high) / 2

- Display the guess.
- Ask user:
-- H = Too High
-- L = Too Low
-- C = Correct
- Read response.
- If response is H:
-- Set high = guess
- Else if response is L:
-- Set low = guess
- Else if response is C:
-- Stop loop.
- Increase counter by 1.
