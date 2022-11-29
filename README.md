# Square-Root-Approx
A short algorithm that approximates a square root based on a provided number of iterations. 

-----------------------------------

The formula used to approximate the square root is $b = {b + {a \over b} \over 2}$, where:
 - $a$ is the number that the user provides to find the square root of
 - $b$ is equal to the previous iteration of the formula

---------------------------------

The base case of the algorithm, or the first iteration of the formula, is $b = {a \over 2}$.

In all future iterations, the program plugs the previous value of b into ${b + {a \over b} \over 2}$, getting a new value for $b$. After completing the specified number of iterations, it returns the current value for $b$.

With more iterations, the square root approximation becomes more accurate. For example, to find the square root of 25, the first iteration is 12.5, the second is 7.25, the third is 5.349, and so on. 
 
