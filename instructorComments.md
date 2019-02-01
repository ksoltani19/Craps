INSTRUCTOR COMMENTS
===================

This is a great little program, Kian, that has the
game play mechanics down solid--you did a good job 
of implementing the rules of Craps.

Your code is very nicely organized, too. It was easy
to follow your development there, and you have a small
but reasonable number of comments to assist in reading
it: 

    // now we check to see if they rolled the point

Perfect!

There were some things missing from your project. One
of the things the assignment asked you to do was to
include a "default Y/n" feature that would allow the
user to answer questions not only by entering Y or N,
but also by just hitting the [Enter] key for a default
answer. There was information on how to do that in the
handout, and it looks like (from you code) you started
working on that feature, but didn't get a chance to 
fully get it working:

    System.out.println("Play again?");
    String playAgain = in.nextLine();
    if (playAgain.equals(""))
    {
    }
    if (playAgain.substring(0,1).equals("n"))
    {
        break;
    }

Also, you don't have the ability to read the rules of
the game, which was absolutely one of the requirements
for this project. I don't know if you forgot that, ran
out of time, or just didn't realize. Make sure you check
the handouts on these big assignments to make sure you're
covering all the bases!

Oh, and you didn't have a .gitignore file in your
project. I added that for you. ;)

Overall, not bad! Just missing some of the detail work.

SCORE: 45/50
