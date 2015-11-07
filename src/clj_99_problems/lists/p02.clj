(ns clj-99-problems.lists.p02)

(defn second-last [coll]
  "Returns the second last element in a collection or nil."
  (if (next coll)
    (if (next (next coll))
      (recur (next coll))
      (first coll))
    nil))
