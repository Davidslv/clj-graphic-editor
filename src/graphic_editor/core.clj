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
  (let [new-image (colour-pixel image x y1 colour)]
    (if (> x y2)
        image
        (recur new-image (inc x) y1 y2 colour))))

(defn colour-row
  "Draws a horizontal segment of a colour in row Y between columns X1 and X2 (inclusive)"
  [image x1 x2 y colour]
  (let [new-image (colour-pixel image x1 y colour)]
    (if (> y x2)
      image
      (recur new-image x1 x2 (inc y) colour))))
