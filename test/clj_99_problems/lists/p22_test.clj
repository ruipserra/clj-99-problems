(ns clj-99-problems.lists.p22-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p22 :refer :all]))

(deftest test-range'
  (is (= (range' 0 0)
         [0]))

  (is (= (range' 0 1)
         [0 1]))

  (is (= (range' 1 0)
         [1 0]))

  (is (= (range' 4 9)
         [4 5 6 7 8 9]))

  (is (= (range' 9 4)
         [9 8 7 6 5 4])))
