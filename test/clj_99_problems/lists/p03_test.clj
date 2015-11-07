(ns clj-99-problems.lists.p03-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p03 :refer :all]))

(deftest test-element-at
  (is (= (element-at () 1)
         nil))
  (is (= (element-at '(0) 1)
         0))
  (is (= (element-at '(0 1 2 3) 3)
         2)))
