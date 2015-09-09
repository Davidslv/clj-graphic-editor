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
