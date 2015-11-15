(ns clj-99-problems.lists.p17)

(defn split-at' [coll n]
  "Splits coll at index n."
  (list (take n coll) (drop n coll)))
