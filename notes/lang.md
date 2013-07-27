## Concepts

- All data structures are immutable, we get copies back when changing them.

- Higher order functions: funcs that take funcs as their arguments.


## Namespaces

- A project consists on namespaces 
    `ns`

- A namespace consists out of data and functions

- Funcs can be public or private
    `defn`   
    `defn-`   // private


    (ns walker.core
      (:use quil.core)
      (:require [walker.walker :as wlkr]))


## Types

- We can create new types via metaobjects (describe and name the type)

- There are 2 metaobjects: `Type` and `Record`. The latter seems the way to go

    deftype


## Functions

    ; Define new function square
    (defn square [x] (* x x))

    ; Define private function square
    (defn- square [x] (* x x))
    
    ; Call it
    (square 10)
    
    ; Define anon function and invoke it
    ((fn [x] (* x x)) 10)


- Have method overloading

- Private public to namespace

- We can define `abstract functions` via `defprotocol`


## Data structures

    ; List
    ; Ordered
    (1 2 3)
    
    ; Vector
    ; Ordered
    [1 2 3]
    
    ; Maps
    ; Assoc key => value
    {:foo "bar" 3 4}
    
    ; Sets
    ; Unordered - unique
    #{1 2 3 4}


## Ways of structuring code

- Divide program in namespaces

- Use `defprotocol` to define "abstract" functions?()

- use `defmulti` and `defmethod`?

- Might use agents?

## Questions

- What is the difference between a set and a list?
- How to define new types?
- How to use `abstract methods` (defprotocol)
- Can we typehint?


## References

- http://www.slideshare.net/yoavrubin/oop-clojure-style-long
- http://stevelosh.com/blog/2012/07/caves-of-clojure-01/