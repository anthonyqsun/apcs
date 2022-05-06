uwu kittens :: Anthony, Ivina, Jaylen
APCS pd7
HW93 -- exploring tree properties, extracting actionable intel from traversals
2022-05-05r
time spent: .5 hrs


DISCO
------------------------------------------------
* perfect = complete and balanced & complete = balanced, but not the other way around
* Making alternate definitions is hard
* (it seems like) any tree can be drawn given a pre order and in order traversal log.
================================================


QCC
------------------------------------------------
* the Man Who Is Tall Happy?
* alternate def to "balanced" tree?
* Is it possible for a tree to only have one subtree? (Either left or right)
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
* down and outwards

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
* A tree is an undirected graph where any 2 vertices are connected by exactly 1 path. (Given definition)
* A tree is any graph that does not have a cycle/closed tour while going in one direction.
* Any node in a tree has exactly one open path to reach it.
* A rooted tree is a graph where all paths will lead to the node designated as the "root" which is located at the base of the tree. This graph contains no cycles. 

Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?
* A balanced tree is allowed to have this difference because otherwise the number of unique balanced trees of a given height will be limited to perfectly full ones. In order to differentiate balance trees from perfect trees, this distinction must be made.
* Also, the traversal of a balanced tree should be a useful test for a traversal algorithm, so having subtrees differ by at most 1 provides balanced test cases.

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
* we are not sure

Is a perfect tree complete? 
* Yes. The definition of a complete tree states that every level is filled except possibly the last one. A perfect tree is when every level is filled so it fulfills all the requirements to be a complete tree.

Is a complete tree balanced? 
* Yes. Any pair of subtrees in a balanced tree has heights that can differ by at most 1 or less layers and a complete tree states that every level is filled except possibly the last one, so layers can differ by at most one.

Is the Man Who Is Tall Happy
* The Man Who Is Tall Is Happy If Happiness Stems from Being Tall

What must be true of perfect trees but not others
* all levels must be full
* it is symmetrical

================================================


C'EST POSSIBLE?
------------------------------------------------
pre order:EGDKINLOW
in order: EKDNIOLWG
YES

        E
          \
            G
          /
        D
      /   \
    K       I
          /   \
        N       L
              /   \
            O       W

================================================


