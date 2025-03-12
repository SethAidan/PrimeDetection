# PrimeDetection
A java based command line application to investigate the primacy of numbers.
Either by checking whether a given number is prime or generating all prime numbers in a given range.

## Features
 - Checks whether a given number is prime
 - Generates a list of prime numbers in a given range by implementing the Sieve of Eratosthenes algorithm
 - Performs robust validation on user inputs to prevent unexpected behaviour

 ## How It Works
 1. The user inputs either 'check' or 'generate' to pick which mode they would like to use.
  - If they chose check:
    2. User enters the number they would like to knoe the primacy of.
    3. The input is validated to ensure it is actually a number.
    4. All numbers less than 2 are immediately returned as non-prime.
    5. Every number from 2 upwards is checked to see if it is a factor.
    6. If no factors are found it is confirmed to be prime.
    7. The user is told whether the number is prime. 
 - If they chose generate
    2. A minimum and maximum value are entered.
    3. The minimum is altered to ensure it is greater than or equal to 2 (to ensure efficiency).
    4. The maximum is validated to ensure it is greater than the minimum.
    5. A list is generated containing every integer between the minimum and maximum.
    6. Every value from 2 to the sqrt of the maximum is checked and any multiples of it removed from the list
    7. Any remaining list values must be prime numbers so the list is output to the user.

## Installation & Usage
### Prerequisites
Ensure that you have a version of java installed on your device
```console
java --version
```
If you do not then install it from [here](https://www.java.com/en/download/)
### Running the Program
1. Clone this repository
```console
git clone https://github.com/SethAidan/PrimeDetection.git
cd PrimeDetection
```
2. Compile all the source files
```console
javac InputHandling.java
javac UnacceptableInputException.java
javac PrimeDetection.java
```
3. Run the main java file
```console
java PrimeDetection
```
## Example Input/Output
### Check
```console
****************
Welcome
****************

You may either : 
check -> Enter a number and return whether is is prime, or,
generate -> Enter a range and receive all prime numbers in that range.

Would you like to 'check', or 'generate' : check
Enter the number you want to check : 17
17 is a prime number
```
### Generate
```console
****************
Welcome
****************

You may either : 
check -> Enter a number and return whether is is prime, or,
generate -> Enter a range and receive all prime numbers in that range.

Would you like to 'check', or 'generate' : generate
Please enter the range over which you would like to generate a list of prime numbers:
Enter the lowest value in the range : 2
Enter the largest value in the range : 21
The prime numbers in the range 2 to 21 are:
2
3
5
7
11
13
17
19
```