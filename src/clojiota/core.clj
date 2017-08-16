(ns clojiota.core
  (:import (com.iota.iri IRI))
  (:require 
    [clojure.tools.cli :refer  [parse-opts]]
    [taoensso.timbre :as log])
  (:gen-class))


(defn -main
  [& args]
  (log/info "IOTA is starting up.")
  (IRI/main (into-array args)))
