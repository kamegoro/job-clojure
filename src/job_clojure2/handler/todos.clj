(ns job-clojure2.handler.todos
  (:require [ataraxy.response :as response]
            [integrant.core :as ig]))

(defn list-handler [_] [::response/ok {:message "ok"}])

(defmethod ig/init-key ::list [_ _] list-handler)