# 01 — Java Fundamentals

Bu proje Java SE öğrenme yolunun temelidir. Amaç yalnızca birkaç syntax örneği çalıştırmak değil; Java kaynak kodunun nasıl derlenip JVM üzerinde çalıştığını anlayarak sağlam bir dil temeli kurmaktır.

## Öğrenme hedefleri

Bu proje tamamlandığında:

- JDK, JVM ve runtime ilişkisini açıklayabilmek,
- source code → bytecode → execution akışını gösterebilmek,
- `javac`, `java` ve `jshell` kullanımını bilmek,
- primitive/reference ayrımını doğru kurmak,
- variable scope ve lifetime'ı açıklamak,
- operators ve expressions davranışını anlamak,
- implicit/explicit conversion ve casting'i doğru kullanmak,
- Java'nın pass-by-value modelini açıklayabilmek,
- control-flow yapılarını doğru seçebilmek,
- method ve array temellerini kullanabilmek,
- String'in temel davranışını anlamak gerekir.

## Alt konular

### 01. Runtime model
- JDK
- JVM
- compiler
- bytecode
- `javac`
- `java`
- `jshell`

### 02. Source structure
- source file
- package statement
- imports
- class declaration
- `main` entry point

### 03. Variables and types
- primitive types
- reference types
- local variables
- fields'e giriş
- scope
- initialization
- `var`

### 04. Literals
- integer
- floating-point
- char
- boolean
- String
- numeric separators
- radix literals

### 05. Operators and expressions
- arithmetic
- assignment
- comparison
- logical
- bitwise
- shift
- unary
- ternary
- precedence
- short-circuit evaluation

### 06. Conversion and casting
- widening
- narrowing
- numeric promotion
- overflow
- explicit casts

### 07. Control flow
- if/else
- switch
- loops
- break/continue
- modern switch expressions

### 08. Methods
- declaration
- arguments
- return values
- overloading'e giriş
- varargs
- pass-by-value

### 09. Arrays
- creation
- initialization
- indexing
- iteration
- multidimensional arrays
- array covariance awareness

### 10. Strings
- creation
- comparison
- immutability'e giriş
- common operations
- text blocks
- string pool'e giriş

## Seviye matrisi

### Junior
Syntax'ı doğru kullanır; primitive/reference ayrımını, control flow'u, methods ve arrays'i bilir.

### Mid
Conversion, overflow, short-circuiting, scope, pass-by-value ve String equality gibi hata üretmeye yatkın alanları doğru açıklar.

### Senior
Dil davranışlarını yalnızca ezberlemez; edge case'leri, readability ve correctness sonuçlarını değerlendirir.

### Expert
Bytecode'a giriş yapar; boxing, numeric promotion, String concatenation gibi yapıların compile/runtime davranışlarını inceler.

### Staff / Principal / Architect
Language-level tercihlerin API correctness, maintainability, compatibility, allocation ve performans üzerindeki etkilerini gerekçelendirir.

## Kurallar

- Bu projede Spring vb. framework yoktur.
- Gerçek hayat örneği Java Fundamentals'ı görünür kılmalıdır.
- İleri Java konuları yalnızca gerektiği kadar işaret edilir; ilgili ana projeye bırakılır.
