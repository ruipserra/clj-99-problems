(ns clj-99-problems.lists.p21)

(defn insert-at [x coll idx]
  "Inserts x at the given index into coll. Assumes 1 as starting index."
  (let [idx (dec idx)]
    (concat
      (take idx coll)
      (cons x (drop idx coll)))))
