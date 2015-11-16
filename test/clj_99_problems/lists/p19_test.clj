(ns clj-99-problems.lists.p19-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p19 :refer :all]))

(deftest test-rotate
  (is (= (rotate [:a :b :c] 0)
         [:a :b :c]))

  (is (= (rotate [:a :b :c :d :e] 2)
         [:c :d :e :a :b]))

  (is (= (rotate [:a :b :c :d :e] -2)
         [:d :e :a :b :c]))

  (is (= (rotate [:a :b :c :d :e] 7)
         [:c :d :e :a :b]))

  (is (= (rotate [:a :b :c :d :e] -7)
         [:d :e :a :b :c])))
