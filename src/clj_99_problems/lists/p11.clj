(ns clj-99-problems.lists.p11
  (:require [clj-99-problems.lists.p10 :refer [encode]]))

(defn encode-modified [xs]
  "Returns a run-length encoded seq, where (1 E) elements are substituted by E."
  (map (fn [[n e :as x]]
         (if (= n 1)
           e
           x))
       (encode xs)))
