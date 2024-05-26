(ns job-clojure2.handler.system
  (:require [ring.util.http-response :as res]
            [integrant.core :as ig]))

(defn ping-handler [_] (res/ok "pong"))

(defmethod ig/init-key ::ping [_ _] ping-handler)