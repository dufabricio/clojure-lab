(ns clojure-playground.core
  (:require clojure-playground.logic as logic)
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!!!"))

(defn foo []
  (println "Fool 3"))

(defn foo2 []
  logic/foo)

