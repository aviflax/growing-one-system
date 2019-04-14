(ns igles.db)

(def default-view :capture)

(def initial-value {:counter 0
                    :submit-enabled true
                    :route {:data {:view default-view}}})

(def submit-enabled? :submit-enabled)
(defn disable-submit [db]
  (assoc db :submit-enabled false))
(defn enable-submit [db]
  (assoc db :submit-enabled true))

(def safe-inc (fnil inc 0))
(def counter :counter)
(defn increment-counter [db] (update db :counter safe-inc))

(defn set-route [db rte] (assoc db :route rte))
(def route :route)
