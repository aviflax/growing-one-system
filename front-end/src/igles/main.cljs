(ns igles.main
  (:require [igles.lib :as lib]
            [re-frame.core :as rf]
            [devtools.core :as devtools]
            [reagent.core :as reagent]
            [igles.views]
            [igles.events]
            [igles.subs]))

;; Debugging aids

(devtools/install!)
(enable-console-print!)

(rf/dispatch-sync [:initialize-db])

(defn ^:export init []
  (println "[main]: loading")
  (reagent/render [igles.views/capture-app]
    (.getElementById js/document "app")))

(defn ^:export reload!
  []
  nil)
