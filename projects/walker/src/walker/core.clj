(ns walker.core
  (:use quil.core)
  (:require [walker.walker :as wlkr]))


; Processing's setup
(defn setup []
  (smooth)
  (stroke 0)
  (background 255)
  (def coord {:x (/ (width) 2)
              :y (/ (height) 2)}))


; Processing's draw 
(defn draw []
  (def coord (wlkr/updateCoordinates coord))
  (println coord)
  (point (get coord :x) (get coord :y)))


; Setup sketch
(defsketch walker
  :title "Walker"
  :setup setup
  :draw draw
  :size [600 400])


; Just to be able to do `lein run`
(defn -main []
  (defsketch))
