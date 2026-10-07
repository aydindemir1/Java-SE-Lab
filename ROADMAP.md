# Java SE / Core Java Roadmap

Bu dosya repository'nin canonical konu haritasıdır.

## 01 — Java Fundamentals
- JDK, JRE, JVM kavramları
- Java source → bytecode → runtime akışı
- `javac`, `java`, `jshell`
- source file yapısı
- identifiers, keywords
- variables, scope, lifetime
- primitive types
- reference types
- literals
- operators
- expressions
- type conversion / casting
- var
- control flow
- methods
- parameters / return values
- pass-by-value
- arrays
- multidimensional arrays
- String basics
- command-line arguments

## 02 — Object-Oriented Programming
- class / object
- fields / methods
- constructors
- constructor chaining
- this / super
- encapsulation
- access modifiers
- packages
- static members
- final
- inheritance
- polymorphism
- method overloading
- method overriding
- abstract classes
- interfaces
- default/static/private interface methods
- nested / inner / local / anonymous classes
- Object class
- equals / hashCode / toString
- immutability
- enums
- records
- sealed classes/interfaces
- pattern matching where applicable

## 03 — Exception Handling
- Throwable hierarchy
- Error vs Exception
- checked / unchecked exceptions
- try / catch / finally
- multi-catch
- throw / throws
- custom exceptions
- try-with-resources
- suppressed exceptions
- exception translation
- exception design
- failure boundaries

## 04 — Generics
- generic classes
- generic interfaces
- generic methods
- bounded type parameters
- wildcards
- PECS
- invariance
- type inference
- raw types
- erasure
- bridge methods
- heap pollution
- generic varargs
- recursive bounds
- API design with generics

## 05 — Collections Framework
- Iterable / Iterator
- Collection hierarchy
- List
- Set
- Queue
- Deque
- Map
- ArrayList
- LinkedList
- HashSet
- LinkedHashSet
- TreeSet
- HashMap
- LinkedHashMap
- TreeMap
- PriorityQueue
- ArrayDeque
- EnumSet / EnumMap
- WeakHashMap
- IdentityHashMap
- immutable / unmodifiable collections
- iteration semantics
- fail-fast behavior
- complexity
- memory trade-offs
- collection selection

## 06 — Equality, Ordering and Object Contracts
- reference equality vs logical equality
- equals contract
- hashCode contract
- Comparable
- Comparator
- natural ordering
- comparator composition
- mutable keys
- Map/Set correctness

## 07 — Lambdas and Functional Programming
- lambda syntax
- functional interfaces
- Predicate
- Function
- Consumer
- Supplier
- UnaryOperator / BinaryOperator
- method references
- closures / captured variables
- effectively final
- composition
- side effects
- pure-function thinking

## 08 — Stream API
- stream pipeline
- intermediate / terminal operations
- map / filter / flatMap
- reduce / collect
- collectors
- grouping / partitioning
- sorting
- distinct
- primitive streams
- lazy evaluation
- encounter order
- parallel streams
- custom collectors
- performance traps

## 09 — Optional
- creation
- mapping
- flatMap
- filtering
- fallback methods
- Optional as return type
- misuse patterns
- API design trade-offs

## 10 — Date and Time API
- Instant
- LocalDate
- LocalTime
- LocalDateTime
- ZonedDateTime
- OffsetDateTime
- Duration
- Period
- ZoneId
- DateTimeFormatter
- clock
- DST pitfalls
- legacy interop

## 11 — Regular Expressions
- Pattern
- Matcher
- groups
- quantifiers
- lookaround
- replacement
- validation
- performance / catastrophic backtracking awareness

## 12 — Annotations
- built-in annotations
- custom annotations
- meta-annotations
- retention
- target
- repeatable annotations
- inherited annotations
- runtime annotation inspection

## 13 — Reflection
- Class
- fields / methods / constructors
- modifiers
- dynamic invocation
- instantiation
- annotations + reflection
- encapsulation boundaries
- performance
- security / maintainability risks

## 14 — Java Platform Module System
- module-info.java
- requires
- exports
- opens
- transitive dependencies
- services
- unnamed / automatic modules
- strong encapsulation
- modular application design

## 15 — I/O
- byte streams
- character streams
- buffering
- readers / writers
- InputStream / OutputStream
- Reader / Writer
- PrintWriter
- data streams
- object streams
- resource management
- charset handling

## 16 — NIO / NIO.2
- Path
- Files
- file attributes
- directory traversal
- WatchService
- channels
- buffers
- selectors overview
- memory-mapped files
- asynchronous file channels
- zero-copy concepts

## 17 — Serialization
- Java native serialization concepts
- Serializable
- serialVersionUID
- transient
- custom serialization hooks
- compatibility concerns
- security risks
- safer alternatives discussion

## 18 — Networking
- InetAddress
- URI / URL
- sockets
- ServerSocket
- TCP concepts through Java APIs
- UDP / DatagramSocket
- blocking networking
- simple client/server labs

## 19 — Java HTTP Client
- HttpClient
- HttpRequest
- HttpResponse
- synchronous calls
- asynchronous calls
- BodyHandlers
- redirects
- timeouts
- headers
- HTTP/2 awareness
- concurrency integration

## 20 — Security and Cryptography APIs
- SecureRandom
- MessageDigest
- Mac
- Cipher
- signatures
- KeyStore basics
- certificates basics
- encoding vs encryption vs hashing
- secure API usage principles

## 21 — Multithreading Fundamentals
- Thread
- Runnable
- lifecycle
- interruption
- daemon threads
- thread states
- race conditions
- intrinsic locks
- synchronized
- wait / notify / notifyAll
- happens-before introduction

## 22 — Concurrency Utilities
- Executor
- ExecutorService
- scheduled executors
- Callable / Future
- thread pools
- BlockingQueue
- CountDownLatch
- CyclicBarrier
- Semaphore
- Phaser
- concurrent collections

## 23 — Locks and Atomics
- Lock / ReentrantLock
- ReadWriteLock
- StampedLock
- conditions
- atomic variables
- CAS
- LongAdder / LongAccumulator
- lock-free thinking
- contention trade-offs

## 24 — CompletableFuture and Async Composition
- creation
- chaining
- combining
- exception handling
- executors
- fan-out / fan-in
- timeouts
- cancellation limitations
- async composition patterns

## 25 — Java Memory Model
- visibility
- atomicity
- ordering
- happens-before
- volatile
- safe publication
- final field semantics
- data races
- reordering
- immutability and concurrency

## 26 — Virtual Threads and Modern Concurrency
- virtual vs platform threads
- Thread.ofVirtual
- Executors.newVirtualThreadPerTaskExecutor
- structured concurrency concepts where supported
- pinning awareness
- blocking I/O model
- scalability trade-offs
- when virtual threads do/do not help

## 27 — JVM Fundamentals
- JVM architecture
- runtime data areas
- stacks / heap / metaspace
- frames
- operand stack
- method area concepts
- native method interaction overview

## 28 — Class Loading and Linking
- bootstrap/platform/application class loaders
- loading
- verification
- preparation
- resolution
- initialization
- delegation
- custom class loaders
- class identity

## 29 — Bytecode
- class file structure overview
- javap
- common bytecode instructions
- method invocation instructions
- stack-machine model
- synthetic / bridge members
- lambda implementation awareness

## 30 — Memory Management and Garbage Collection
- allocation
- object lifetime
- reachability
- GC roots
- generational hypotheses
- common collectors
- young / old regions concepts
- pauses
- throughput vs latency
- memory leaks in managed runtimes
- references: strong/soft/weak/phantom

## 31 — JIT and Runtime Optimization
- interpreted vs compiled execution
- tiered compilation
- hot methods
- inlining
- escape analysis
- scalar replacement
- deoptimization
- speculative optimization
- why microbenchmarks lie

## 32 — Performance and Profiling
- measurement principles
- JFR
- JMC
- jcmd
- jstack
- jmap concepts
- heap dumps
- thread dumps
- GC logs
- CPU / allocation profiling
- benchmark design
- JMH introduction
- latency / throughput / memory trade-offs

## 33 — JDBC
- DriverManager
- DataSource concept
- Connection
- Statement
- PreparedStatement
- CallableStatement
- ResultSet
- transactions
- auto-commit
- isolation overview
- batch operations
- generated keys
- savepoints
- SQL exceptions
- resource lifecycle
- mapping without ORM

## 34 — Localization and Internationalization
- Locale
- ResourceBundle
- formatting numbers/currency
- dates
- Unicode considerations
- locale-sensitive comparisons / casing

## 35 — Process API
- ProcessBuilder
- Process
- ProcessHandle
- stdin/stdout/stderr
- lifecycle
- exit codes
- child processes
- platform portability risks

## 36 — ServiceLoader and SPI
- provider interfaces
- provider implementations
- META-INF/services
- module-based providers
- plugin architecture fundamentals using Java SE only

## 37 — Core Java API Design
- immutability
- defensive copying
- value objects
- builders
- factories
- static factories
- nullability decisions
- exception contracts
- generic API design
- collection ownership
- thread-safety contracts
- binary/source compatibility awareness

## 38 — Core Java Engineering Patterns
Java'yı öğretmek amacıyla:
- Iterator
- Strategy via functional interfaces
- Factory
- Builder
- Template Method
- Observer
- Command
- Adapter
- Decorator
- Proxy
- Flyweight
- AutoCloseable/resource-management patterns
- immutable-object patterns

## 39 — Advanced Java Language and Runtime Labs
- tricky overload resolution
- boxing/unboxing
- varargs
- initialization order
- class initialization failures
- covariant returns
- bridge methods
- nested class semantics
- record semantics
- sealed hierarchies
- pattern matching
- advanced generics
- advanced reflection
- runtime diagnostics

## 99 — Core Java Capstone
Tek bir framework-heavy uygulama yerine Java SE yeteneklerini birlikte kullanan bir engineering lab:
- domain object model
- collections/indexing
- file persistence
- JDBC persistence variant
- concurrency
- HTTP client
- networking
- structured logging via JDK APIs where suitable
- configuration
- error handling
- tests
- profiling scenarios
- performance experiments

## Kapsam dışı
- Spring ecosystem
- ORM frameworkleri
- messaging platformları
- container/orchestration
- cloud
- frontend
- mikroservis mimarisi

Bu konular gerektiğinde başka repository'lerde ele alınır.
