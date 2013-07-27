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


## Types

## Functions

    ; Define new function square
    (defn square [x] (* x x))

    ; Define private function square
    (defn- square [x] (* x x))
    
    ; Call it
    (square 10)
    
    ; Define anon function and invoke it
    ((fn [x] (* x x)) 10)


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


## Questions

- What is the difference between a set and a list?


## References

- http://www.slideshare.net/yoavrubin/oop-clojure-style-long