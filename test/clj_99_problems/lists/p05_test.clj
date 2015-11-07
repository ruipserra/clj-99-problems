(ns clj-99-problems.lists.p05-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p05 :refer :all]))

(deftest test-reverse'
  (is (= (reverse' [])
         []))
  (is (= (reverse' [0])
         [0]))
  (is (= (reverse' [0 1])
         [1 0])))
