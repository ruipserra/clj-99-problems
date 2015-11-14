(ns clj-99-problems.lists.p10-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p10 :refer :all]))

(defn shared-encode-tests [f]
  (is (= (f [:a])
         [[1 :a]]))

  (is (= (f [:a :a])
         [[2 :a]]))

  (is (= (f [:a :b])
         [[1 :a] [1 :b]]))

  (is (= (f [:a :a :b :c :c :a])
         [[2 :a] [1 :b] [2 :c] [1 :a]])))

(deftest test-encode
  (shared-encode-tests encode))

(deftest test-encode'
  (shared-encode-tests encode'))

