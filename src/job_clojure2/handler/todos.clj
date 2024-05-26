(ns job-clojure2.handler.todos
  (:require [ataraxy.response :as response]
            [integrant.core :as ig]))

(defn get-handler [_] [::response/ok {:message "ok"}])

(defmethod ig/init-key ::get [_ _] get-handler)