(ns clj-99-problems.lists.p14)

(defn duplicate [coll]
  "Duplicates every element in coll."
  (mapcat list coll coll))
