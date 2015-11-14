(ns clj-99-problems.lists.p09)

(defn pack [xs]
  "Returns a seq where repeated elements are placed in separate subseqs."
  (partition-by identity xs))

(defn pack' [xs]
  "Same as pack, but doesn't use partition-by."
  (reverse
    (reduce
      (fn [acc x]
        (let [fst (first acc)]
          (if (seq? fst)
            (if (= x (first fst))
              (cons (cons x fst) (next acc))
              (cons (list x) acc))

            (list (list x)))))

      [nil ()] xs)))

(defn pack'' [xs]
  "Same as pack, but uses lazy-seq."
  (lazy-seq
    (when-let [s (seq xs)]
      (let [f (first s)
            repeated-elements (take-while #(= f %) s)]
        (cons repeated-elements (pack'' (drop (count repeated-elements) s)))))))

