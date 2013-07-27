(ns walker.core
  (:use quil.core))


; Processing's setup
(defn setup []
  (smooth)
  (stroke 0)
  (background 255)
  (def x (/ (width) 2))
  (def y (/ (height) 2)))


; Helper to update the coordinates
(defn updateCoordinates []
  (let [choice (int (random 4))]
    (println choice)
    (case choice
      0 (def x (+ x 1))
      1 (def x (- x 1))
      2 (def y (+ y 1))
      3 (def y (- y 1)))))


; Processing's draw 
(defn draw []
  (updateCoordinates)
  (point x y))


; Setup sketch
(defsketch walker
  :title "Walker"
  :setup setup
  :draw draw
  :size [600 400])


; Just to be able to do `lein run`
(defn -main []
  (defsketch))
