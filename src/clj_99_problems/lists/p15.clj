(ns clj-99-problems.lists.p15)

(letfn [(repeat-single [n x]
          (lazy-seq
            (when (pos? n)
              (cons x (repeat-single (dec n) x)))))]

  (defn repli [coll n]
    "Replicates the elements of coll n times."
    (mapcat (partial repeat-single n) coll)))
