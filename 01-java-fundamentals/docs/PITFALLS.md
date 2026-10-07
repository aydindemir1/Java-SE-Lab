# Pitfalls — Java Fundamentals

## 1. String için `==` kullanmak

Yanlış:
```java
if (input == "yes") { }
```

Doğru:
```java
if ("yes".equals(input)) { }
```

## 2. Integer overflow'u unutmak

```java
int total = Integer.MAX_VALUE + 1;
```

Kod derlenebilir ama matematiksel olarak beklenen sonucu üretmez.

## 3. Floating-point ile para hesabı yapmak

`double` eğitim amaçlı arithmetic örneklerinde kullanılabilir; gerçek parasal hesaplamada precision gereksinimi ayrıca değerlendirilmelidir. `BigDecimal` ayrı bir ileri örnekte işlenecektir.

## 4. Pass-by-reference sanmak

Java pass-by-reference değildir. Reference values da value olarak iletilir.

## 5. Side effect içeren karmaşık expression yazmak

Okunabilirliği ve correctness'i düşürür:
```java
int result = x++ + ++x;
```

Derlenebilmesi iyi tasarım olduğu anlamına gelmez.

## 6. Magic numbers

Yanlış:
```java
if (amount > 1500) { ... }
```

Daha iyi:
```java
private static final int FREE_SHIPPING_THRESHOLD = 1500;
```

## 7. Gereksiz nesting

Guard clause veya daha sade control flow çoğu zaman daha okunabilirdir.

## 8. Array sınırlarını varsaymak

```java
numbers[numbers.length]
```

son eleman değildir; geçersiz index'tir.

## 9. Uninitialized local variable

Local variable'ların default değeri yoktur; kullanılmadan önce initialize edilmelidir.

## 10. `var` kullanımını type bilgisini gizleyecek kadar abartmak

`var` okunabilirliği artırdığı yerde kullanılmalıdır; yalnızca daha kısa kod yazmak amacıyla değil.
