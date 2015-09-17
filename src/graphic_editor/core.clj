(ns graphic-editor.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(defn new-image
  "Creates a new image"
  [rows cols]
   (->> (repeat cols \O)
        vec
        (repeat rows)
        vec))

(defn colour-pixel
  "Colours a pixel for the given coordinates"
  [image x y colour]
  (assoc-in image [x y] colour))

(defn colour-column
  "Draws a vertical segment of a colour in column between rows Y1 and Y2 (inclusive)"
  [image x y1 y2 colour]
  (let [new-image (colour-pixel image x y1 colour)
        rows      (count image)]
    (if (> x y2)
        image
        (recur new-image (inc x) y1 y2 colour))))

(defn colour-row
  "colours a given row with a given colour"
  [image x y colour]
  (let [new-image (colour-pixel image x y colour)
        columns (count (first image))]
    (if (>= y columns)
      image
      (recur new-image x (inc y) colour))))
