(ns job-clojure2.driver.todo
  (:require [hugsql.core :as hugsql]
            [next.jdbc :as jdbc]
            [job-clojure2.driver.database :as db]))

(declare select-all-sqlvec)
(hugsql/def-sqlvec-fns "job-clojure2/driver/todo.sql")

