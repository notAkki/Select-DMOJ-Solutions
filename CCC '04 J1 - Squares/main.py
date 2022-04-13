import math

n = int(input())

for i in range(0, n):
    a = n-i;
    if (math.sqrt(a)%2 == 0 or math.sqrt(a)%2 == 1):
        print ("The largest square has side length " + str(int(math.sqrt(a))) + ".")
        break
