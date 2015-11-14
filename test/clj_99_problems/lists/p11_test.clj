(ns clj-99-problems.lists.p11-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p11 :refer :all]))

(deftest test-encode-modified
  (is (= (encode-modified [:a])
         [:a]))
  (is (= (encode-modified [:a :a])
         [[2 :a]]))
  (is (= (encode-modified [:a :a :b :c :c :c :a :d :d])
         [[2 :a] :b [3 :c] :a [2 :d]])))
