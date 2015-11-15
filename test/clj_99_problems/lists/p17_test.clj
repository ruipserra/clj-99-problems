(ns clj-99-problems.lists.p17-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p17 :refer :all]))

(deftest test-split-at'
  (is (= (split-at' [:a] 0)
         [[] [:a]]))

  (is (= (split-at' [:a] 1)
         [[:a] []]))

  (is (= (split-at' [:a :b] 1)
         [[:a] [:b]]))

  (is (= (split-at' [:a :b :c :d :e :f :g] 3)
         [[:a :b :c] [:d :e :f :g]])))
