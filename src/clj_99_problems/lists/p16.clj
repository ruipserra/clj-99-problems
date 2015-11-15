(ns clj-99-problems.lists.p16)

(defn drop-every-nth [coll n]
  "Drops every element whose index in coll is divisible by n."
  (let [pred (fn [[i x]]
               (not (zero? (mod (inc i) n))))
        indexed-coll (map-indexed list coll)
        filtered-indexed-coll (filter pred indexed-coll)
        filtered-coll (map second filtered-indexed-coll)]

    filtered-coll))


(defn drop-every-nth'
  "Like drop-every-nth, but without using map, filter and map-indexed."
  ([coll n]
    (drop-every-nth' coll n 1))

  ([coll n idx]
    (lazy-seq
      (when-let [s (seq coll)]
        (if (zero? (mod idx n))
          (drop-every-nth' (next s) n 1)
          (cons (first s)
                (drop-every-nth' (next s) n (inc idx))))))))
