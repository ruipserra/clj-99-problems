(ns clj-99-problems.lists.p18-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p18 :refer :all]))

(deftest test-slice
  (is (= (slice [] 1 2)
         []))

  (is (= (slice [:a :b] 1 1)
         [:a]))

  (is (= (slice [:a :b] 1 3)
         [:a :b]))

    (is (= (slice [:a :b :c :d :e :f :g] 3 5)
           [:c :d :e])))
