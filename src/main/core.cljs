(ns main.core
  (:require [reagent.core :as r]
            [reagent.dom :as rdom]))

(defonce app-state (r/atom {:text "shadow-cljs is running and watching! 💪"}))

(defn hello-world []
  [:div
   [:h1 (:text @app-state)]
   [:h3 "Edit this and watch it change!"]])

(defn ^:dev/after-load start []
  (js/console.log "start")
  (rdom/render [hello-world]
               (. js/document (getElementById "app"))))

(defn ^:export init []
  (js/console.log "init")
  (start))

(defn ^:dev/before-load stop []
  (js/console.log "stop"))

(comment
  ;; Evaluate these forms to see that the REPL is working
  (str "Hello" "world" "!")
  (js/alert "42") ;; You need to dismiss the alert in the browser
                  ;; To unlock the REPL for more evaluations
  ;; If you don't know how to evaluate forms, and youare using Calva,
  ;; see https://calva.io/evaluation/
  :rcf)

