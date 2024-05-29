(ns job-clojure2.gateway.todo
  (:require [integrant.core :as ig]
            [job-clojure2.port.todo :as todo-port]))

(defn find-all [db todo] (job-clojure2.driver/select db {:id todo :title todo :created_at todo}))

(defn new-find-all [db] (reify todo-port/TodoPort (find-all [_ todo] (find-all db todo))))

(defmethod ig/init-key ::todo-gateway [_ db] (new-find-all db))