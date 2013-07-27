(ns gaussian-distribution.core
  (:use quil.core)
  (:import java.util.Random))


(defn setup []
  (smooth)
  (stroke 0)
  (stroke-weight 5)
  (background 255)
  (def gen (Random.))
  (def mean 300)
  (def stdDev 5))



(defn draw []
  (let [x (/ (width) 2)
        y (/ (height) 2)
        d (+ mean (* (.nextGaussian gen) stdDev))]
    (background 255)
    (ellipse x y d d)))



; Just to be able to do `lein run`
(defn -main []
  (defsketch gaussian-distribution
  :title "Gaussian Distribution"
  :setup setup
  :draw draw
  :size [800 600]))