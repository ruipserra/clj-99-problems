(ns clj-99-problems.lists.p18)

(defn slice [coll start end]
  "Returns a the elements in coll between start and end indexes (inclusive).
  The first element corresponds to index 1."
  (let [s (dec start)]
    (take (- end s)
          (drop s coll))))
