(ns groupmark.server
  (:require [bidi.ring :refer [make-handler]]
            [ring.middleware.json
             :refer
             [wrap-json-response wrap-json-body]]
            [groupmark.routes :as routes])
  )

(def handler
  (-> (make-handler routes/routes)
      wrap-json-body
      wrap-json-response
      )
  )

