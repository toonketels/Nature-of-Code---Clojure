(ns walker.walker
  (:use quil.core))


; Creates a new walker data object which is a map
(defn createWalker []
  (identity {:x (/ (width) 2)
             :y (/ (height) 2)
             :prev 0}))


; Helper to update the coordinates
(defn walk [walker]
  (let [choice (int (random 4))
        x-val (get walker :x)
        y-val (get walker :y)]
    (cond
      (= choice (get walker :prev)) (do 
        (println "Nope, same as before, do it again") 
        (walk walker))
      :else (case choice
          0 (identity {:x (+ x-val 1) :y y-val :prev 0})
          1 (identity {:x (- x-val 1) :y y-val :prev 1})
          2 (identity {:x x-val :y (+ y-val 1) :prev 2})
          3 (identity {:x x-val :y (- y-val 1) :prev 3})))))


; Display the walker
(defn show [walker]
  (point (get walker :x) (get walker :y)))
