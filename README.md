# My Kata Logs in Java programming language 
## by Álvaro Cobano
A coding kata in programming is an exercise intended for programmers to develop their skills through practice and repetition. It was probably Dave Thomas, co-author of the book 'The Pragmatic Programmer', who coined the term, in a nod to the Japanese concept of martial arts kata. (Obtained from Wikipedia)

![Kata log](src/main/resources/mykata.jpg)


## Christmas Lights Kata
Because your neighbors keep defeating you in the holiday house decorating contest year after year, you’ve decided to deploy one million lights in a 1000x1000 grid. Furthermore, because you’ve been especially nice this year, Santa has mailed you instructions on how to display the ideal lighting configuration.Lights in your grid are numbered from 0 to 999 in each direction; the lights at each corner are at 0,0, 0,999, 999,999, and 999,0. The instructions include whether to turn on, turn off, or toggle various inclusive ranges given as coordinate pairs. Each coordinate pair represents opposite corners of a rectangle, inclusive; a coordinate pair like 0,0 through 2,2 therefore refers to 9 lights in a 3x3 square. The lights all start turned off. To defeat your neighbors this year, all you have to do is set up your lights by doing the instructions Santa sent you in order.

### Examples:
- Turn on 0,0 through 999,999 would turn on (or leave on) every light.
- Toggle 0,0 through 999,0 would toggle the first line of 1000 lights, turning off the ones that were on, and turning on the ones that were off.
- Turn off 499,499 through 500,500 would turn off (or leave off) the middle four lights.

### Instructions:
1. turn on 887,9 through 959,629
2. turn on 454,398 through 844,448
3. turn off 539,243 through 559,965
4. turn off 370,819 through 676,868
5. turn off 145,40 through 370,997
6. turn off 301,3 through 808,453
7. turn on 351,678 through 951,908
8. toggle 720,196 through 897,994
9. toggle 831,394 through 904,860

**After following the instructions, how many lights are lit?**


## Fizz Buzz Kata
- Write a program that prints one line for each number from 1 to 100.
- Usually just print the number itself.
- For multiples of three print 'Fizz' instead of the number.
- For the multiples of five print 'Buzz' instead of the number.
- For numbers which are multiples of both three and five print 'FizzBuzz' instead of the number.


## Bowling Game Kata
### Bowling Rules:
The game consists of 10 frames. In each frame the player has two rolls to knock down 10 pins. The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.
A strike is when the player knocks down all 10 pins on his first roll. The frame is then completed with a single roll. The bonus for that frame is 15 points.
A spare is when the player knocks down all 10 pins in two rolls. The bonus for that frame is 13 points.
In the tenth frame a player who rolls a spare or strike is allowed to roll an extra ball to complete the frame. However no more than three balls can be rolled in tenth frame.

### Requirements:
Write a class Game that has two methods
- void roll(int) is called each time the player rolls a ball. The argument is the number of pins knocked down.
- int score() returns the total score for that game.