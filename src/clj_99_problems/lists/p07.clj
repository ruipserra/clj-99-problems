(ns clj-99-problems.lists.p07)

(defn flatten' [coll]
  "Transforms coll so that inner collections are replaced with their contents."
  (loop [acc []
         coll coll]
    (if (empty? coll)
      acc
      (let [f (first coll)
            n (next coll)]
        (if (coll? f)
          (recur acc (concat f n))
          (recur (conj acc f) n))))))
