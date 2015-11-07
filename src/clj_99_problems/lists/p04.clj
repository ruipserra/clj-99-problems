(ns clj-99-problems.lists.p04)

(defn count' [coll]
  "Return the number of elements in the collection."
  (loop [counter 0
         coll coll]
    (if (empty? coll)
      counter
      (recur (inc counter) (next coll)))))
