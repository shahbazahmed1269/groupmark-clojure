(ns groupmark.routes)

(defn ping-handler [_]
  {:status  200
    :headers {"Content-Type" "application/json"}
    :body    {"message" "pong"} }
  )

(def routes
  ["" {"/ping" #'ping-handler}]
  )