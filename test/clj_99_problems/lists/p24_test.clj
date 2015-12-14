(ns clj-99-problems.lists.p24-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p24 :refer :all]))

(deftest test-lotto-select
  (is (= (lotto-select 0 10)
         []))

  (is (thrown-with-msg? IllegalArgumentException
                        #"upper-limit must be greater than or equal to 1"
                        (lotto-select 1 0)))

  (is (= (lotto-select 1 1)
         [1]))

  (is (= (lotto-select 2 1)
         [1]))

  (let [n 5
        upper 10
        drawn (lotto-select n upper)]

    (is (= (count drawn) n))

    (is (every? (set (range 1 (inc upper))) drawn))

    (is (apply distinct? drawn))))
