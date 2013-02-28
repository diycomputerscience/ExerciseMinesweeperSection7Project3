<h1>Section 7 Project 3</h1>

<h2>Overview</h2>

In the previous exercise, we allowed a user to click on the user interface squares. When a square was clicked, we invoked the ```uncover``` method on the backend ```Board``` object and also changed the display to show the count or to end the game if a mine is uncovered.

This is a great first step, but if you have noticed, we supported only left clicks. In a real game several more things need to happen. We need to detect whether a click is a left click or a right click. If the click is a left click then the backend square must be uncovered, and if it is a right click, then the square must be marked as a mine.

By now, we already know what happens when a user performs a left click on a Square. On the other hand if a user performs a right click on a square, then the backend ```Board``` object's ```mark``` method is called and the user interface square is displayed in MAGENTA.

In this activity we need to code the latter. However, if you remember from a very early exercise, there are some rules of working with squares. We will list them below once again, for your recollection.

A Square can either be uncovered, or marked as a mine. The rules for what should happen are as follows:

 1. If a Square which is already uncovered is uncovered again, the action is ignored
 1. If a Square which is already uncovered is is marked as a mine, the action is ignored
 1. If a Square which is marked as a mine, is uncovered, the action is ignored
 1. If a Square which is marked as a mine, is again marked as a mine, then it becomes unmarked

The backend logic for all these rules is already in place in the ```Square``` class. You have to incorporate all this in ```UI``` by invoking the correct backend method and changing how the square on the user interface is rendered. Look at the ```layoutSquares``` method in ```UI.java``` and fill in your code under the **TODO:** comment.

<h2>Steps For This Activity</h2>

 1. Run ```AllTests``` and verify that 48 tests are run, out of which 6 tests fail
 1. Implement appropriate code in ```layoutSquares``` method in ```UI.java```
 1. Run ```AllTests``` and verify that all 48 tests pass
