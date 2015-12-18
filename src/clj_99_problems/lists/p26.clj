(ns clj-99-problems.lists.p26
  (:require [clj-99-problems.lists.p20 :refer [remove-at]]))

(defn combinations [n coll]
  "Return a list of all possible combinations of n elements from coll.
   Not tail recursive."
  (cond
    (or (zero? n) (empty? coll))
      ()
    (= n 1)
      (map vector coll)
    :else
      (let [[x & xs] coll]
        (concat
          (map (partial cons x) (combinations (dec n) xs))
          (combinations n xs)))))
