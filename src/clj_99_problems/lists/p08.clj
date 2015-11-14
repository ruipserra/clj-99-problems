(ns clj-99-problems.lists.p08)

(defn compress [coll]
  "Returns a collection with sequentially duplicated elements replaced by
  a single copy of the element, keeping the original element order."

  (reverse
    (reduce (fn [acc x]
              (if (= x (first acc))
                acc
                (cons x acc)))
            () coll)))
