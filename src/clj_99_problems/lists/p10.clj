(ns clj-99-problems.lists.p10
  (:require [clj-99-problems.lists.p09 :refer [pack]]))

(defn encode [xs]
  "Returns a run-length encoded seq. Consecutive duplicates of elements are
  encoded as (N E) where N is the number of duplicates of the element E."
  (map #(list (count %) (first %)) (pack xs)))

(defn encode' [xs]
  "Same as encode, but doesn't use pack."
  (lazy-seq
    (when-let [s (seq xs)]
      (let [f (first s)
           repeated (take-while #(= f %) s)
           n (count repeated)
           other (drop n s)]

        (cons (list n f) (encode' other))))))
