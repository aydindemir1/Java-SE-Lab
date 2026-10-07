# Java SE Lab

Java SE / Core Java'yı uygulamalı, bol örnekli ve derinlemesine öğrenmek için hazırlanmış eğitim ve mühendislik laboratuvarı.

Bu repository'nin odağı **Java dilinin kendisi, Java SE API'leri ve JVM çalışma modeli**dir.

## Amaç

Bu çalışma; Java'yı yalnızca syntax seviyesinde değil, aynı konuyu farklı mühendislik derinliklerinde ele alacak şekilde tasarlanır:

- Junior: doğru syntax ve temel kullanım
- Mid: API seçimi, idiomatic Java, hata senaryoları
- Senior: tasarım, maintainability, correctness, concurrency ve performans
- Expert: implementation details, JVM davranışı, profiling ve trade-off'lar
- Staff / Principal / Architect: Java odaklı teknik kararlar, sınırlar ve sistemik etkiler

> Seviye, farklı bir "Java" öğrenmek anlamına gelmez. Aynı Java kavramını giderek daha derin anlamak ve daha doğru mühendislik kararlarında kullanabilmek anlamına gelir.

## Kapsam

Ana kaynaklardan biri [roadmap.sh Java Roadmap](https://roadmap.sh/java)'tir. Roadmap'teki Java SE / Core Java konuları kapsanır; ayrıca modern Java için gerekli bazı derinleşme başlıkları eklenir.

### Dahil

- Java language fundamentals
- OOP ve Java object model
- Generics
- Collections Framework
- Exception handling
- Lambdas ve functional programming
- Stream API ve Optional
- Date/Time, Regex
- Annotations ve Reflection
- Java Platform Module System
- I/O, NIO/NIO.2
- Serialization
- Networking ve Java HTTP Client
- Security / Cryptography API'leri
- Threads, concurrency, Java Memory Model
- Executors, Future, CompletableFuture
- Locks, atomics, concurrent collections
- Virtual Threads
- JVM, class loading, bytecode
- memory management, GC, JIT
- profiling ve Java performansı
- JDBC
- localization / internationalization
- Process API
- ServiceLoader / SPI
- Java API design ve Core Java engineering practices

### Bilinçli olarak kapsam dışında

Bu repository bir backend/framework repository'si değildir. Aşağıdakiler ana öğrenme konusu yapılmaz:

- Spring / Spring Boot / Spring Cloud
- Hibernate / framework odaklı JPA
- Kafka / RabbitMQ / Redis
- Docker / Kubernetes
- Microservices
- Cloud platformları
- Frontend teknolojileri

Bir dış teknoloji yalnızca ilgili Java SE API'sini gerçekçi biçimde göstermek için zorunluysa yardımcı araç olarak kullanılabilir; öğrenme odağı yine Java kalır.

## Repository modeli

Her **ana konu bağımsız bir Java projesidir**. Alt konular o projenin içinde paketler, örnekler, testler, egzersizler ve gerçek hayat senaryoları olarak bulunur.

Her ana projede mümkün olduğunca şu yapı korunur:

```text
topic-project/
├── README.md
├── pom.xml
├── src/
│   ├── main/java/
│   │   └── .../
│   │       ├── basics/
│   │       ├── examples/
│   │       ├── pitfalls/
│   │       └── realworld/
│   └── test/java/
├── docs/
│   ├── THEORY.md
│   ├── PITFALLS.md
│   ├── INTERVIEW.md
│   └── EXERCISES.md
```

## Eğitim standardı

Bir konu işlendiğinde mümkün olduğunca şu sırayı izler:

1. Konu nedir?
2. Neden vardır?
3. Java'da nasıl çalışır?
4. En küçük doğru örnek
5. Birkaç farklı kullanım örneği
6. Gerçek hayat senaryosu
7. Yaygın hatalar ve anti-pattern'ler
8. Junior → Mid → Senior → Expert → Staff/Principal/Architect derinliği
9. Performance / memory / concurrency etkileri (uygunsa)
10. Testler
11. Egzersizler
12. Interview / reasoning soruları
13. Kaynak kod ve JDK API inceleme yönlendirmeleri

## Dokümanlar

- [ROADMAP.md](ROADMAP.md) — tüm konu haritası
- [LEARNING-PATH.md](LEARNING-PATH.md) — önerilen öğrenme sırası
- [PROGRESS.md](PROGRESS.md) — ilerleme takibi

## Temel ilke

**Konudan sapma yok.**

Örneğin Generics öğrenirken Spring repository katmanına, concurrency öğrenirken Kafka'ya, networking öğrenirken mikroservis mimarisine dönmeyiz. Gerçek hayat örnekleri kullanılır ama örnek her zaman Java kavramını görünür kılmak için vardır.

## Durum

Repository başlangıç iskeleti oluşturuluyor.
