(ns clj-99-problems.lists.p22)

(defn range' [start end]
  "Returns a list containing all the integers in a given range.
  If end is smaller than start, returns the list in decreasing order."
  (lazy-seq
    (if (= start end)
      (list start)
      (let [op (if (< start end) inc dec)]
        (cons start (range' (op start) end))))))
