roguelike
=========

Trying to put together a roguelike game

---

We start with grid coordinates to simplify the design, but bear in mind we want to switch to hexagons later in the project.

## MAP

### Map description

Actual map:
- header
- file extension is .map
- dot is navigable cell
- white space is ignored
- w is unmovable wall
- m is movable wall
- outside the size we have unmovable wall

### Map example

    3

    .w.
    .w.
    ...


### Hexagonal map representation

Hexagon space representation as two 2D axes plus one diagonal.

       |***
      *|***
     **|***
    ---o---
    ***|**
    ***|*
    ***|

Adjacency (and 1-distance) is valid over the two axes and the m=1 diagonal.

### Resources
- [Hexagonal grids](http://www.redblobgames.com/grids/hexagons/)
- [Hex maps on wikipedia](http://en.wikipedia.org/wiki/Hex_map)
