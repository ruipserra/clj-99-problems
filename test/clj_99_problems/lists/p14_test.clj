(ns clj-99-problems.lists.p14-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p14 :refer :all]))

(deftest test-duplicate
  (is (= (duplicate [])
         []))

  (is (= (duplicate [:a])
         [:a :a]))

  (is (= (duplicate [:a :b :c])
         [:a :a :b :b :c :c])))
