(ns job-clojure2.port.todo-port)

(defprotocol TodoPort (find-all [this todo]))