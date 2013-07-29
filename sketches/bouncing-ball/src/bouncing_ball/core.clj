(ns bouncing-ball.core
  (:use quil.core)
  (:require [bouncing-ball.ball :as ball]))


(defn setup []
  (def _ball (ball/createBall))
  (println _ball))

(defn draw []
  (background 255)
  (def _ball ((comp ball/display ball/bounce ball/move) _ball)))

(defn -main []
  (defsketch bouncing-ball
    :title "Bouncing _ball"
    :setup setup
    :draw draw
    :size [800 600]))
