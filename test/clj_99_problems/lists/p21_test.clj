(ns clj-99-problems.lists.p21-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p21 :refer :all]))

(deftest test-insert-at
  (is (= (insert-at :a [] 1)
         [:a]))

  (is (= (insert-at :a [] 2)
         [:a]))

  (is (= (insert-at :a [:b] 1)
         [:a :b]))

  (is (= (insert-at :a [:b] 2)
         [:b :a]))

  (is (= (insert-at :x [:a :b :c :d] 2)
         [:a :x :b :c :d])))
