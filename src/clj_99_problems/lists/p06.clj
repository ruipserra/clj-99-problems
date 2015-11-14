(ns clj-99-problems.lists.p06)

(defn palindrome? [coll]
  "Returns true if the list is a palidrome, false otherwise."
  (= coll (reverse coll)))
