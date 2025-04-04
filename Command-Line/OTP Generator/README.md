# OTP Generator

This project is a simple OTP (One Time Password) Generator built using Java. The program generates a random OTP based on the length provided by the user (either 4 or 6 digits). The OTP is composed of numeric digits between 1 and 9.

## Features
- **Random OTP Generation**: Generates a random OTP of user-defined length.
- **Custom Length**: The user can specify the length of the OTP (either 4 or 6).
- **Simple User Interaction**: The program prompts the user for the OTP length and outputs the generated OTP.

## Technologies Used
- **Java**: The main programming language used.
- **Random Class**: Used to generate random numbers for the OTP.

## How It Works
1. The program prompts the user to input the desired length of the OTP (either 4 or 6).
2. It then uses the `Random` class to generate random digits between 1 and 9.
3. The OTP is constructed by concatenating the random digits.
4. The final OTP is then printed to the console.

## Code Explanation
1. **`generateOTP(int l)` Method**:
   - Takes an integer `l` as input (length of OTP).
   - Uses a loop to generate `l` random digits, appending them to form the OTP string.
   - Returns the OTP as an integer after converting the string to an integer.

2. **`main()` Method**:
   - Prompts the user to input the desired length of the OTP.
   - Calls the `generateOTP()` method to generate and display the OTP.
   - Closes the `Scanner` object after user input.

## Example Usage

```bash
Enter the length of the otp: (4 or 6) 6
Generated OTP: 835729
```