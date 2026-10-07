# Theory — Java Fundamentals

## 1. Java programı nasıl çalışır?

Temel akış:

```text
.java source
   ↓ javac
.class bytecode
   ↓ class loader + verifier
JVM runtime
   ↓ interpreter / JIT
machine code
```

Java kaynak kodu doğrudan CPU tarafından çalıştırılmaz. Önce bytecode'a derlenir. JVM bu bytecode'u yükler, doğrular ve çalıştırır.

## 2. JDK, JVM ve runtime

### JDK
Java geliştirme araçlarını içerir. Örnekler:
- `javac`
- `java`
- `jshell`
- `javap`
- `javadoc`
- diagnostic tools

### JVM
Bytecode'u çalıştıran sanal makinedir. Class loading, memory areas, garbage collection ve runtime execution gibi sorumlulukları vardır.

## 3. Primitive ve reference types

Primitive değerler:
- byte
- short
- int
- long
- float
- double
- char
- boolean

Reference variable ise bir object/array reference'ı taşır.

Kritik ayrım: Java'da tüm argument passing **pass-by-value**'dur. Reference variable method'a geçildiğinde reference'ın kendisi değil, reference değerinin kopyası gönderilir.

## 4. Numeric conversion

### Widening
Genellikle otomatik:
```java
int count = 10;
long bigger = count;
```

### Narrowing
Explicit cast gerekir:
```java
long value = 100;
int smaller = (int) value;
```

Narrowing veri kaybına yol açabilir.

## 5. Overflow

Java integer arithmetic overflow olduğunda otomatik exception fırlatmaz.

```java
int max = Integer.MAX_VALUE;
System.out.println(max + 1);
```

Bu yüzden correctness önemliyse `Math.addExact`, `Math.multiplyExact` gibi API'ler incelenmelidir.

## 6. Short-circuit evaluation

`&&` ve `||` sağ operandı gerektiğinde çalıştırmaz.

```java
if (user != null && user.isActive()) {
    // güvenli
}
```

Bu yalnızca syntax detayı değil, correctness davranışıdır.

## 7. switch expression

Modern Java'da switch yalnızca statement değildir; değer üretebilir.

```java
String label = switch (status) {
    case 200 -> "OK";
    case 404 -> "NOT_FOUND";
    default -> "OTHER";
};
```

## 8. Methods ve pass-by-value

Bir primitive değişkenin method içindeki yeni değeri çağıran değişkeni değiştirmez.

Bir object reference'ın kopyası üzerinden object state değiştirilebilir; fakat local parameter başka object'e atanırsa caller'ın reference variable'ı değişmez.

## 9. Arrays

Array:
- sabit uzunlukludur,
- object'tir,
- index tabanlıdır,
- runtime bounds checking yapar.

Array covariance Java'nın type systemindeki tarihsel özelliklerden biridir ve runtime'da `ArrayStoreException` oluşturabilir. Bu konu Generics bölümünde tekrar karşılaştırılacaktır.

## 10. String

String immutable'dır.

```java
String name = "Java";
name.concat(" SE");
```

Bu kod `name` değerini değiştirmez.

`==` reference identity kontrol eder; içerik karşılaştırması için çoğunlukla `equals` gerekir.

## 11. Bu bölümde neden JVM detaylarına fazla inmiyoruz?

Fundamentals bölümünün amacı dil davranışını doğru öğrenmektir. Bytecode, JIT, GC ve memory model ilerleyen bağımsız projelerde derinlemesine ele alınacaktır.
