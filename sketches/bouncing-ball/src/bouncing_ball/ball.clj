; Ball "class"
(ns bouncing-ball.ball
  (:use quil.core))


; Returns a new ball with updated location
(defn- updateLocation [ball location]
  (identity {:location location :velocity (get ball :velocity)}))


; Returns a new ball with updated velocity
(defn- updateVelocity [ball velocity]
  (identity {:location (get ball :location) :velocity velocity}))



; Public API
;-----------


; Creates a Map holding the data (DNA)
; for a ball
(defn createBall []
  (let [location [(/ (width) 2) (/ (height) 2)]
        velocity [2.5 -2]]
    (identity {:location location :velocity velocity})))



; Move the ball by updating it's location by
; its velocity
(defn move [ball]
  (def newLocation (map + (get ball :location) (get ball :velocity)))
  (updateLocation ball newLocation))



; Change direction ball when it hits
; the sketch borders
(defn bounce [ball]
  (let [x (first (get ball :location))
        y (second (get ball :location))]
    (def newBall ball)
    (if  (or (< x 0) (> x (width)))
      (do
        (def newVelocity [(* (first (get ball :velocity)) -1)
                          (second (get ball :velocity))])
        (def newBall (updateVelocity ball newVelocity))))
    (if  (or (< y 0) (> y (height))) 
      (do
        (def newVelocity [(first (get ball :velocity))
                          (* (second (get ball :velocity)) -1)])
        (def newBall (updateVelocity ball newVelocity))))
    (identity newBall)))



; Dipslay the ball and return itself,
; so we can have a chaining api.
(defn display [ball]
  (ellipse
    (first (get ball :location))
    (second (get ball :location))
    20
    20)
  (identity ball))
