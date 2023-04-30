(ns leaarning.challenge)

(defn getInventory
  "Provides Inventory of Cars along with Prices in USD"
  []
  (defstruct CarItem :name :price)

  #{(struct CarItem "BMW", 80000)
    (struct CarItem "Ferrari", 100000)
    (struct CarItem "Fiat", 20000)})

(defn apply20Percent
  [originalPrice]
  (- originalPrice (/ (* originalPrice 20) 100)))

(defn findMatches
  [budget inventory apply20]
  

  (doseq [item inventory]
    (def price (if apply20 (apply20Percent (:price item)) (:price item))) 
    (when (<= price budget) (println (:name item) (:price item)"$"))) 
  )


(defn client
  [budget coupon] 
  (def couponMatched (= (compare coupon "CLJR23") 0)) 
  (when couponMatched (println "Coupon is Valid, will apply 20 percent discount")) 

  (findMatches budget (getInventory) couponMatched) 
  )


(client 800000 "CLJR22")