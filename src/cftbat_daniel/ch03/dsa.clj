(ns cftbat-daniel.ch03.dsa)

; 1. Numbers
93
1.2
1/5

; 2. Strings
(def name "Chewbacca")
(str "\"Uggllglglglglglglglll\" - " name)

; 3. Maps
; 3.1 创建 Map
; 1) 使用字面值
{:name {:first "John" :middle "Jacob" :last "Jingleheimerschmidt"}}
; 2) 使用 hash-map 函数
(hash-map :a 1 :b 2)

; 3.2 使用 get 函数获取元素
(get {:a 0 :b 1} :b)
(get {:a 0 :b {:c "ho hum"}} :b)
(get {:a 0 :b 1} :c)
(get {:a 0 :b 1} :c "unicorns?")

; 3.3 使用 get-in 函数在嵌套 map 中获取元素
(get-in {:a 0 :b {:c "ho hum"}} [:b :c])
(get-in {:a 0 :b {:c "ho hum"}} [:b :x] "not found")

; 3.4 把 map 看作函数, key 看作参数, 通过函数调用也可以获取元素
({:name "The Human Coffeepot"} :name)

; 4. Keywords
; 4.1 Keywords 看作函数, 数据结构看作参数, 通过这种方式也可以获取元素 [最佳实践]
(:a {:a 1 :b 2 :c 3})
(:d {:a 1 :b 2 :c 3} "No gnome knows homes like Noah knows")

; 5. Vectors
; 5.1 创建 Vectors 的两种方式
; 1) 使用字面值
[3 2 1]
; 2) 使用 vector 函数
(vector "creepy" "full" "moon")

; 5.2 查找元素
(get [3 2 1] 0)
(get ["a" {:name "Pugsley Winterbottom"} "c"] 1)
(get ["a" {:name "Pugsley Winterbottom"} "c"] 100)
(get ["a" {:name "Pugsley Winterbottom"} "c"] 100 "not found")

; 5.3 增加元素
; 1) 通过 conj 函数将元素添加到一个 vector
(conj [1 2 3] 4)

; 6. Lists
; 6.1 创建 Lists
; 1) 使用字面值
'(1 2 3 4)
; 2) 通过 list 函数
(list 1 "two" {3 4})

; 6.2 获取元素
; 1) 使用 nth 函数
(nth '(:a :b :c) 0)
(nth '(:a :b :c) 2)
(nth '(:a :b :c) 100)
(nth '(:a :b :c) 100 "not found")

; 6.3 添加元素
(conj '(1 2 3) 4)

; 7. Sets
; 7.1 创建 Sets
; 1) 使用字面值
#{"Kurt vonnegut" 20 :icicle}
; 2) 使用 hash-set 函数
(hash-set 1 1 2 2)
; 3) 通过其他 Vector 和 List 创建 Set
(set [3 3 3 4 4])
(set '(3 3 3 4 4))

; 7.2 获取元素
; 1) contains?, 判断是否存在
(contains? #{:a :b} :a)
(contains? #{:a :b} 3)
(contains? #{nil} nil)

; 2) 把 keyword 看作函数, Set 看作参数, 通过函数调用也可以获取元素
(:a #{:a :b})

; 3) 通过 get 函数获取元素
(get #{:a :b} :a)
(get #{:a nil} nil)
(get #{:a :b} "Kurt vonnegut")

; 7.3 添加元素
(conj #{:a :b} :b)

