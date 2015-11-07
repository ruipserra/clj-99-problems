(ns clj-99-problems.lists.p01)

(defn last' [coll]
  "Returns the last element in a collection. Returns nil if the collection is empty."
  (if (next coll)
    (recur (next coll))
    (first coll)))
