(ns clj-99-problems.lists.p08-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p08 :refer :all]))

(deftest test-compress
  (is (= (compress '(1 1))
         '(1)))
  (is (= (compress '(1 2 1))
         '(1 2 1)))
  (is (= (compress '(1 1 2 2 2 2 3 4 3 3 2 2 1))
         '(1 2 3 4 3 2 1))))
