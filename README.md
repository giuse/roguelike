roguelike
=========

Trying to put together a roguelike game

---

We start with grid coordinates to simplify the design, but bear in mind we want to switch to hexagons later in the project.

Hexagon space representation as two 2D axes plus one diagonal.

       |***
      *|***
     **|***
    ---o---
    ***|**
    ***|*
    ***|

Adjacency (and 1-distance) is valid over the two axes and the m=1 diagonal.
