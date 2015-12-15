(ns clj-99-problems.lists.p25
  (:require [clj-99-problems.lists.p23 :refer [rnd-select]]))

(defn rnd-permutations [coll]
  "Returns a random permutation of 'coll'"
  (rnd-select coll (count coll)))
