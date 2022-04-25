# Practice MC (2015): Review and Corrections

### Score: 37/39

### Corrections:

![Screen Shot 2022-04-24 at 5 31 15 PM](https://user-images.githubusercontent.com/60991517/165003369-d2abaa45-a46a-458b-80c9-7de5f97f7c4c.png)

obj is defined as a new object of the class B. Since the show() method is redefined in class B from class A, the call obj.show() method uses the updated method from class B. Therefore, "B" is printed.

------

![Screen Shot 2022-04-24 at 5 34 14 PM](https://user-images.githubusercontent.com/60991517/165003525-ad9e34f6-8aab-456a-aadc-c754e07e78cd.png)

Reviewed in class. summary of this review: the method changeIt is a trick, and it doesn't change anything at all. Variables are changed **locally** and redefining primitive types implicitly creates a new object. To truly change variables, the method needs a return type. Since nothing is changed, the answer is "1 2 3 4 5 6 blackboard" (E).
