(ns clj-99-problems.lists.p25-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p25 :refer :all]))

(deftest test-rnd-permutations
  (is (= (rnd-permutations [])
         []))

  (is (= (rnd-permutations [:a])
         [:a]))

  (let [coll [:a :b :c :d :e :f]]

    (is (= (count coll) (count (rnd-permutations coll))))

    (is (every? (set coll) (rnd-permutations coll)))

    (is (apply distinct? (rnd-permutations coll)))))
