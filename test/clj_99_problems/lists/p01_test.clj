(ns clj-99-problems.lists.p01-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p01 :refer :all]))

(deftest test-last'
  (testing "lists"
    (is (= (last' ())
           nil))

    (is (= (last' '(0))
           0))

    (is (= (last' '(0 1))
           1)))

  (testing "vectors"
    (is (= (last' [])
           nil))

    (is (= (last' [0])
           0))

    (is (= (last' [0 1])
           1)))

  (testing "maps"
    (is (= (last' {})
           nil))

    (is (= (last' {:a 0})
           [:a 0]))

    (is (= (last' {:a 0 :b 1})
           [:b 1]))))

