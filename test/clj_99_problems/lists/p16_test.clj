(ns clj-99-problems.lists.p16-test
  (:require [clojure.test :refer :all]
            [clj-99-problems.lists.p16 :refer :all]))

(defn shared-drop-every-nth-test [f]
  (is (= (f [:a] 2)
         [:a]))

  (is (= (f [:a :b :c] 2)
         [:a :c]))

  (is (= (f [:a :b :c] 1)
         []))

  (is (= (f [:a :b :c :d :e :f :g] 3)
         [:a :b :d :e :g])))

(deftest test-drop-every-nth
  (shared-drop-every-nth-test drop-every-nth))

(deftest test-drop-every-nth'
  (shared-drop-every-nth-test drop-every-nth'))
