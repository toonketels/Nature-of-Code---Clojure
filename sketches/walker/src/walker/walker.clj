; Walker
;
; Public api:
;  - createWalker
;  - walk
;  - show
;
; @todo: Accept mayMakeChoise and choose as
;        parameters to modify behavior at runtime 
(ns walker.walker
  (:use quil.core))


; Updates the coordinates and returns updated walker
(defn- updateWalker [choice x-val y-val]
  (case choice
    0 (identity {:x (+ x-val 1) :y y-val :prev 0})
    1 (identity {:x (- x-val 1) :y y-val :prev 1})
    2 (identity {:x x-val :y (+ y-val 1) :prev 2})
    3 (identity {:x x-val :y (- y-val 1) :prev 3})))


; Can this option be chosen?
; Modify this function to modify walker behavior
(defn- mayMakeChoise? [walker choice]
  (not= choice (get walker :prev)))


; Choose an option (4 possibilities)
; Modify this function to modify walker behavior
(defn- choose [walker]
  (int (random 4)))


; Public api
;-----------

; Creates a new walker data object which is a map
(defn createWalker []
  (identity {:x (/ (width) 2)
             :y (/ (height) 2)
             :prev 0}))


; Helper to update the coordinates
(defn walk [walker]
  (let [choice (choose walker)
        x-val (get walker :x)
        y-val (get walker :y)]
    (cond
      (mayMakeChoise? walker choice) (updateWalker choice x-val y-val) 
      :else (do 
        (println "Nope, we are not allowed to choose this. Choose again.") 
        (walk walker)))))


; Display the walker
(defn show [walker]
  (point (get walker :x) (get walker :y)))
