(ns clj-99-problems.lists.p03)

(defn element-at [coll idx]
  "Returns the element at the given index of a 1-indexed collection.
   Returns nil if no element found."
  (if (> idx 1)
    (recur (next coll) (dec idx))
    (first coll)))
