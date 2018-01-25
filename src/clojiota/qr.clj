(ns clojiota.qr
  (:require 
    [clj.qr.gen :as qr]
    [crypto.random :as crand]
    [taoensso.timbre :as log])) 

(defn generate-iota-qr
  ([] (qr/as-file 
        (qr/from "hello iota world")))
  ([seed] (qr/as-file
            (qr/from seed))))
