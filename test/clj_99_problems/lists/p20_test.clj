(ns clj-99-problems.lists.p20-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p20 :refer :all]))

(deftest test-remove-at
  (is (= (remove-at [] 1)
         []))

  (is (= (remove-at [:a] 1)
         []))

  (is (= (remove-at [:a] 2)
         [:a]))

  (is (= (remove-at [:a :b :c :d :e] 3)
         [:a :b :d :e])))
