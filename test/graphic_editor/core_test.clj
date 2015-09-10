(ns graphic-editor.core-test
  (:require [clojure.test :refer :all]
            [graphic-editor.core :refer :all]))

(deftest new-image-test
  (testing "it should return a new image"
    (is (= (new-image 2 2) [[\O \O] [\O \O]])))

  (testing "it should return a 5x5 new image"
    (is (= (new-image 5 5) [[\O \O \O \O \O] [\O \O \O \O \O] [\O \O \O \O \O] [\O \O \O \O \O] [\O \O \O \O \O]]))))

(deftest colour-pixel-test
  (testing "it starts with zero index"
    (is (= (colour-pixel (new-image 4 5) 0 0 \A) [[\A \O \O \O \O] [\O \O \O \O \O] [\O \O \O \O \O] [\O \O \O \O \O]])))

  (testing "it should colour the given pixel"
    (is (= (colour-pixel (new-image 4 5) 1 2 \A) [[\O \O \O \O \O] [\O \O \A \O \O] [\O \O \O \O \O] [\O \O \O \O \O]]))))

(deftest colour-column-test
  (testing "it should colour the first column"
    (is (= (colour-column (new-image 3 3) 0 0 \A) [[\A \O \O] [\A \O \O] [\A \O \O]])))

  (testing "it should colour the second column"
    (is (= (colour-column (new-image 3 3) 0 1 \A) [[\O \A \O] [\O \A \O] [\O \A \O]]))))

(deftest colour-row-test
  (testing "it should colour the first row"
    (is (= (colour-row (new-image 3 3) 0 0 \A) [[\A \A \A] [\O \O \O] [\O \O \O]])))

  (testing "it should colour the second row"
    (is (= (colour-row (new-image 3 3) 1 0 \A) [[\O \O \O] [\A \A \A] [\O \O \O]]))))
