(ns clj-99-problems.lists.p20)

(defn remove-at [coll idx]
  "Returns coll without the element at index idx. Uses 1 as starting index."
  (concat
    (take (dec idx) coll)
    (drop idx coll)))
