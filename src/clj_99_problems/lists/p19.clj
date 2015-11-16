(ns clj-99-problems.lists.p19)

(defn rotate [coll n]
  "Rotates coll n places to the left."
  (if (zero? n)
    coll
    (let [coll-size (count coll)
          mod-n (mod n coll-size)
          offset (if (pos? mod-n)
                   mod-n
                   (- coll-size mod-n))
          [c1 c2] (split-at offset coll)]
      (concat c2 c1))))
