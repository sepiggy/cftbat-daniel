(ns cftbat-daniel.ch03.functions)

; 1. Calling Functions
(or + -)
((or + -) 1 2 3)

((and (= 1 1) +) 1 2 3)
((first [+ 0]) 1 2 3)

(inc 1.1)
(map inc [0 1 2 3])

; 2. Function Calls, Macro Calls, and Special Forms

; 3. Defining Functions
(defn too-enthusiastic
  "Return a cheer that might be a bit too enthusiastic"
  [name]
  (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY ..."))

(too-enthusiastic "Zelda")
(doc too-enthusiastic)

(defn x-chop
  "Describe the kind of chop you're inflicting on someone"
  ([name chop-type]
    (str "I " chop-type " chop " name "! Take that!"))
  ([name]
    (x-chop name "Karate")))