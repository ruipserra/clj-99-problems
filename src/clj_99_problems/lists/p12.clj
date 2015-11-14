(ns clj-99-problems.lists.p12)

(letfn [(expand [x]
           (if (and (coll? x) (= 2 (count x)))
             (repeat (first x) (second x))
             (list x)))]

  (defn decode [xs]
    "Decodes a run-length encoded list generated as specified in problem 11."
    (mapcat expand xs)))
