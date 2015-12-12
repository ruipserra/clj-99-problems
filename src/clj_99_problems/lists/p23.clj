(ns clj-99-problems.lists.p23
  (:require [clj-99-problems.lists.p03 :refer [element-at]]
            [clj-99-problems.lists.p20 :refer [remove-at]]))

(defn rnd-select [coll n]
  "Returns a collection of n elements picked at random from coll."
  (lazy-seq
    (when-let [s (seq coll)]
      (if (pos? n)
        (let [idx (inc (rand-int (count s)))]
          (cons
            (element-at s idx)
            (rnd-select (remove-at s idx) (dec n))))))))
