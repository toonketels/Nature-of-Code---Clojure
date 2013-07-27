(ns walker.walker
  (:use quil.core))

; Helper to update the coordinates
(defn updateCoordinates [coord]
  (let [choice (int (random 4))
        x-val (get coord :x)
        y-val (get coord :y)]
    (case choice
      0 (identity {:x (+ x-val 1) :y y-val})
      1 (identity {:x (- x-val 1) :y y-val})
      2 (identity {:x x-val :y (+ y-val 1)})
      3 (identity {:x x-val :y (- y-val 1)}))))
