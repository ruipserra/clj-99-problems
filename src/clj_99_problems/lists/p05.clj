(ns clj-99-problems.lists.p05)

(defn reverse' [coll]
  "Returns coll in reverse order."
  (loop [acc ()
         coll coll]
    (if (empty? coll)
      acc
      (recur (conj acc (first coll)) (next coll)))))
