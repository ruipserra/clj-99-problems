(ns clj-99-problems.lists.p12-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p12 :refer :all]))

(deftest test-decode
  (is (= (decode [:a])
         [:a]))

  (is (= (decode [[2 :a]])
         [:a :a]))

  (is (= (decode [[4 :a] :b [2 :c] [2 :a]])
         [:a :a :a :a :b :c :c :a :a])))
