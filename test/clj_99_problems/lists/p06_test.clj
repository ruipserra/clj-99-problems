(ns clj-99-problems.lists.p06-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p06 :refer :all]))

(deftest test-palindrome?
  (is (= (palindrome? [])
         true))
  (is (= (palindrome? [:a])
         true))
  (is (= (palindrome? [:a :b])
         false))
  (is (= (palindrome? [:a :b :a])
         true)))
