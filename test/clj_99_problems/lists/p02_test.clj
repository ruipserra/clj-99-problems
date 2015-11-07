(ns clj-99-problems.lists.p02-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p02 :refer :all]))

(deftest test-second-last
  (testing "lists"
    (is (= (second-last ())
           nil))

    (is (= (second-last '(0))
           nil))

    (is (= (second-last '(0 1))
           0))

    (is (= (second-last '(0 1 2))
           1)))

  (testing "vectors"
    (is (= (second-last [])
           nil))

    (is (= (second-last [0])
           nil))

    (is (= (second-last [0 1])
           0))

    (is (= (second-last [0 1 2])
           1)))

  (testing "maps"
    (is (= (second-last {})
           nil))

    (is (= (second-last {:a 0})
           nil))

    (is (= (second-last {:a 0 :b 1})
           [:a 0]))

    (is (= (second-last {:a 0 :b 1 :c 2})
           [:b 1]))))
