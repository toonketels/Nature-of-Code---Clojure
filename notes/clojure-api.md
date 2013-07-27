

defn

    ; Defines a function
    (defn square [x] (* x x))


defn-

    ; Defines a private function
    ; Private == private the the namespace


defprotocol

    ; Define an "abstract" function -
    ; Only function signature, no implementation


defrecord

deftype

defmulti

ns

    ; Defines a new namespace
    (ns walker.core
      (:use quil.core))


do

    ; Execute multiple functions in a row
    (cond
      (x < y) (do (println "hi") (println "ho")))


identity

    ; Return the data
    (identity (1 2 3))


not=

    ; Not equal !=
    (not= a b)


let

def

case

cond

println

    ; Output ln to terminal
    (println "Hello world")