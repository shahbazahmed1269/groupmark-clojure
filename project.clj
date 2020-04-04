(defproject groupmark "0.1.0-SNAPSHOT"
  :description "Simple REST API server to manage bookmarks of different resources for books, URLs, text in a single place"
  :url ""
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [
                 [org.clojure/clojure "1.10.0"]
                 [mount "0.1.16"]
                 [bidi "2.1.6"]
                 [ring/ring "1.5.0"]
                 [ring/ring-json "0.4.0"]
                 ]
  :repl-options {:init-ns groupmark.core})
