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


## Çalıştırma

Gereksinim:
- JDK 25
- Maven 3.9+

Derleme:

```bash
cd 01-java-fundamentals
mvn clean compile
```

Bir örneği çalıştırma:

```bash
java -cp target/classes dev.aydindemir.javase.fundamentals.basics.HelloJava
```

Diğer örnekler de aynı şekilde kendi fully-qualified class name'leri ile çalıştırılabilir.

## Şu anda bulunan örnekler

- `basics/HelloJava`
- `types/PrimitiveTypesDemo`
- `types/ConversionAndOverflowDemo`
- `types/VarInferenceDemo`
- `types/BoxingUnboxingDemo`
- `operators/OperatorsAndExpressionsDemo`
- `controlflow/ModernSwitchDemo`
- `controlflow/LoopControlDemo`
- `methods/PassByValueDemo`
- `methods/VarargsDemo`
- `arrays/ArrayBasicsDemo`
- `arrays/ArrayCovariancePitfallDemo`
- `strings/StringEqualityDemo`
- `strings/TextBlockDemo`
- `cli/CommandLineCalculator`
- `realworld/ShoppingCartPriceCalculator`
- `realworld/ShippingDecisionEngine`

## Eğitim dokümanları

- [Theory](docs/THEORY.md)
- [Pitfalls](docs/PITFALLS.md)
- [Exercises](docs/EXERCISES.md)
- [Interview & Reasoning](docs/INTERVIEW.md)
- [Bytecode Observation Labs](docs/BYTECODE-LABS.md)

## Completion checklist

- [x] Maven Java 25 build tanımlandı
- [x] Temel teori oluşturuldu
- [x] İlk küçük örnekler eklendi
- [x] İlk gerçek hayat örnekleri eklendi
- [x] Pitfalls dokümanı eklendi
- [x] Exercises eklendi
- [x] Interview/reasoning soruları eklendi
- [x] Operators kapsamı tamamlandı
- [x] Control-flow kapsamı genişletildi
- [x] Methods/varargs kapsamı genişletildi
- [x] Arrays ve covariance edge-case'i eklendi
- [x] String/Text Blocks kapsamı genişletildi
- [x] Command-line arguments lab eklendi
- [x] Bytecode gözlem laboratuvarları eklendi
- [x] JUnit 5 otomatik testleri eklendi
- [ ] Lokal build/runtime doğrulanacak
- [ ] Final documentation review yapılacak


## CI

GitHub Actions, `01-java-fundamentals` altında değişiklik olduğunda Java 25 üzerinde:

```bash
mvn clean test
```

çalıştırır.

Workflow:
`.github/workflows/java-fundamentals-ci.yml`

Bu nedenle proje yalnızca örnek kod içeren bir klasör değil; derlenebilir ve otomatik test edilen bağımsız bir Java SE eğitim projesidir.
