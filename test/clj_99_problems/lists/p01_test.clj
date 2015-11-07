(ns clj-99-problems.lists.p01-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p01 :refer :all]))

(deftest test-last'
  (is (= (last' [])
         nil))

  (is (= (last' [0])
         0))

  (is (= (last' [0 1])
         1)))
