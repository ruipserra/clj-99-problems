(ns clj-99-problems.lists.p04-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p04 :refer :all]))

(deftest test-count'
  (is (= (count' [])
         0))
  (is (= (count' [0])
         1))
  (is (= (count' [0 1 2 3 4])
         5)))
