(defproject clojiota "0.1.2-SNAPSHOT"
  :description "A Clojure library built on top of the IOTA Reference Implementation. Adds useful enhancements."
  :url "https://github.com/tuddman/clojiota"
  :license {:name "MIT License"
            :url "https://github.com/tuddman/clojiota/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.9.0-beta1"]
                 [org.clojure/tools.cli "0.3.5"]
                 [clj.qrgen "0.4.0"]
                 [com.iota/iri "1.4.0"]
                 [com.taoensso/timbre "4.10.0"]
                 [crypto-random "1.2.0"]]
  
  :min-lein-version "2.5.1"
  :main clojiota.core)
