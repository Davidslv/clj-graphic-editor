(ns graphic-editor.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(defn new-image [rows cols]
  (vec (for [i (range rows)]
         (vec (for [j (range cols)] \O)) ))
  )

;(defn flood-fill
;  "Happy Recursion"
;  [x y]
;  )

; Add function to read user input

; Add function to print help funtions