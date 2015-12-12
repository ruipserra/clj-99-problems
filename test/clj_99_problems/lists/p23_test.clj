(ns clj-99-problems.lists.p23-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p23 :refer :all]))

(deftest test-rnd-select
  (is (= (rnd-select [:a] 0)
         []))

  (is (= (rnd-select [:a] 1)
         [:a]))

  (is (= (rnd-select [:a] 2)
         [:a]))

  (let [coll [:a :b :c :d :e :f]]

    (is (every? (set coll) (rnd-select coll 3)))

    (is (apply distinct? (rnd-select coll 3)))

    (is (= (count (rnd-select coll 3)) 3))))
