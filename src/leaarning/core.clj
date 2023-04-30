(ns leaarning.core
  (:gen-class))

;; 

(defn getPetToHumanRatio
  [x] 
  (def petStore {'dog 7, 'cat 5, 'goldfish 10})
  (get petStore x)
  )


(defn humanAgeForPet
  [pet age]
  (* (getPetToHumanRatio pet) age) 
  )

(humanAgeForPet 'cat 5)