# Bytecode Observation Labs

Bu bölüm Java Fundamentals seviyesinde bytecode'u öğretmek için değil, **source code ile JVM'in gördüğü çıktı arasında fark olduğunu gözlemlemek** için vardır.

Derin bytecode analizi ayrı JVM/Bytecode projesinde yapılacaktır.

## 1. Derle

```bash
cd 01-java-fundamentals
mvn clean compile
```

## 2. String concatenation

```bash
javap -c -p target/classes/dev/aydindemir/javase/fundamentals/bytecode/StringConcatenationBytecodeDemo.class
```

Bakılacak noktalar:
- source seviyesinde  kullanılır,
- bytecode seviyesinde modern JDK'larda string concatenation için invokedynamic görebilirsin,
- source syntax ile runtime implementation birebir aynı değildir.

## 3. Boxing / unboxing

```bash
javap -c -p target/classes/dev/aydindemir/javase/fundamentals/bytecode/BoxingBytecodeDemo.class
```

Bakılacak noktalar:
- boxing sırasında `Integer.valueOf`
- unboxing sırasında `Integer.intValue`

Bu, autoboxing'in "sihir" değil compiler transformation olduğuna dair ilk gözlemdir.

## 4. Switch

```bash
javap -c -p target/classes/dev/aydindemir/javase/fundamentals/bytecode/SwitchBytecodeDemo.class
```

Bakılacak noktalar:
- integer switch'in bytecode karşılığı
- `tableswitch` veya `lookupswitch` benzeri talimatlar

## 5. Ne öğrenmeliyiz?

Fundamentals seviyesinde hedef:
- Java syntax'ın bytecode ile aynı şey olmadığını anlamak,
- compiler'ın source code'u dönüştürebildiğini görmek,
- bazı performans ve runtime davranışlarının source'a bakarak tam anlaşılamayacağını fark etmek.

Detaylı class file formatı, operand stack, invocation instructions, bootstrap methods ve bytecode verification ileride ele alınacaktır.
