(ns clj-99-problems.lists.p07-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p07 :refer :all]))

(deftest test-flatten'
  (is (= (flatten' [])
         []))
  (is (= (flatten' [[1]])
         [1]))
  (is (= (flatten' [1 [2 [3 [4 5] 6] 7] 8])
         [1 2 3 4 5 6 7 8])))
