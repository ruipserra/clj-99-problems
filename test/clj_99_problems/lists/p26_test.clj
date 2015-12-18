(ns clj-99-problems.lists.p26-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p26 :refer :all]))

(deftest test-combinations
  (is (= (combinations 0 [:a :b :c])
         []))

  (is (= (combinations 1 [])
         []))

  (is (= (combinations 1 [:a])
         [[:a]]))

  (is (= (combinations 1 [:a :b :c])
         [[:a] [:b] [:c]]))

  (is (= (combinations 2 [:a :b])
         [[:a :b]]))

  (is (= (combinations 2 [:a :b :c])
         [[:a :b] [:a :c] [:b :c]]))

  (is (= (count (combinations 3 (range 12)))
         220)))
