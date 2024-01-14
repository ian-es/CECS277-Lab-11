# CECS277-Lab-11
Java Singleton

CECS 277 Lab 11 Spring 2022

Ian Escalante, Julio Calderon

## Ball Selector
Using the following class diagram:

![image](https://github.com/ian-es/CECS277-Lab-11/assets/103468553/de7b699a-3a46-4474-9166-28f965abf464)

Create a program that allows the user to select a Ball object by entering a color. Create
the Ball class as a singleton to ensure that there is only one instance of each of the
different colors (ie. there is only one ‘Red’ ball that the user can play with), by using a
HashMap with the color as the key, and the corresponding Ball object as the value. The
getInstance method should check if that color ball is already in the map, if it is, then
return it, otherwise construct it and return it. Once the user chooses a ball, let them
choose to bounce or roll the ball. The Ball object keeps track of the number of times the
user has bounced and/or rolled that particular color ball.
## Output

![image](https://github.com/ian-es/CECS277-Lab-11/assets/103468553/75b3d0cf-8496-4774-955c-df63d7851a94)



