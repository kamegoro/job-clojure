(ns job-clojure2.use-case.todo
  (:require [job-clojure2.port.todo-port :as todo-port]
            [job-clojure2.geteway.todo]))

(defn find-todos [] (todo-port/find-all todos-gateway))