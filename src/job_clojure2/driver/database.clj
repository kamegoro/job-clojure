(ns job-clojure2.driver.database
  (:require [next.jdbc.result-set :as rs]))

(def select-opts (:builder-fn rs/as-unqualified-kebab-maps))