(ns groupmark.core
  (:require [groupmark.server :refer [handler]]))
(use 'ring.adapter.jetty)

(defn -main []
  (run-jetty handler {:port 3000}))