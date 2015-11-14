(ns clj-99-problems.lists.p15-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p15 :refer :all]))

(deftest test-repli
  (is (= (repli [] 3)
         []))

  (is (= (repli [:a] 1)
         [:a]))

  (is (= (repli [:a] 2)
         [:a :a]))

  (is (= (repli [:a :b :c] 1)
         [:a :b :c]))

  (is (= (repli [:a :b :c] 3)
         [:a :a :a :b :b :b :c :c :c])))
