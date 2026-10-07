# Java Version Policy

## Baseline

Bu repository'nin ana çalışma sürümü **Java 25 LTS**'tir.

Neden:
- modern Java SE dilini ve API'lerini kapsamak için yeterince güncel,
- LTS olduğu için eğitim örneklerinin ömrü daha uzundur,
- JVM/runtime laboratuvarlarında istikrarlı bir temel sağlar.

## Latest Java

Java 27, Eylül 2026 itibarıyla en güncel Java SE sürümüdür. Yeni sürümlerde gelen final özellikler uygun başlıklara ayrıca eklenebilir.

## Preview / Experimental özellikler

Preview veya experimental özellikler:
- ana öğrenme akışına karıştırılmaz,
- ayrı bir `preview/` veya `experiments/` alanında tutulur,
- kullanılan JDK ve gerekli compiler/runtime flag'leri açıkça yazılır.

Böylece "Java SE temeli" ile "gelecek Java özellikleri" birbirine karışmaz.
