(ns graphic-editor.core-test
  (:require [clojure.test :refer :all]
            [graphic-editor.core :refer :all]))

(deftest new-image-test
  (testing "it should return a new image"
    (is (= (new-image 2 2) [[\O \O] [\O \O]])))

    (testing "it should return a 5x5 new image"
    (is (= (new-image 5 5) [[\O \O \O \O \O] [\O \O \O \O \O] [\O \O \O \O \O] [\O \O \O \O \O] [\O \O \O \O \O]]))))
