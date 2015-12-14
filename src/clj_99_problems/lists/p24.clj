(ns clj-99-problems.lists.p24
  (:require [clj-99-problems.lists.p23 :refer [rnd-select]]))

(defn lotto-select [n upper-limit]
  "Returns a list of n different random numbers from the range of 1 to
  upper-limit, both inclusive."
  (if (>= upper-limit 1)
    (rnd-select (range 1 (inc upper-limit)) n)
    (throw (IllegalArgumentException. "upper-limit must be greater than or equal to 1"))))

