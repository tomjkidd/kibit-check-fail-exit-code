(ns kibit-check-fail-exit-code.core
  (:require kibit-check-fail-exit-code.foo)
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println kibit-check-fail-exit-code.foo/bar))
