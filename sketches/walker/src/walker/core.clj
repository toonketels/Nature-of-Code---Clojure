(ns walker.core
  (:use quil.core)
  (:require [walker.walker :as wlkr]))


; Processing's setup
(defn setup []
  (smooth)
  (stroke 0)
  (background 255)
  (def _walker (wlkr/createWalker)))


; Processing's draw 
(defn draw []
  (def _walker (wlkr/walk _walker))
  (println _walker)
  (wlkr/show _walker))


; Just to be able to do `lein run`
(defn -main []
  (defsketch walker
    :title "Walker"
    :setup setup
    :draw draw
    :size [600 400]))
