(ns clj-99-problems.lists.p09-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p09 :refer :all]))

(defn shared-pack-tests [f]
  (is (= (f [1])
         [[1]]))
  (is (= (f [1 1])
         [[1 1]]))
  (is (= (f [1 1 2 1])
         [[1 1] [2] [1]])))

(deftest test-pack
  (shared-pack-tests pack))

(deftest test-pack'
  (shared-pack-tests pack'))

(deftest test-pack''
  (shared-pack-tests pack''))
