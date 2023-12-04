# Spring Framework ve Spring Boot ile E-Ticaret ve Kütüphane Yönetim Sistemleri

Bu depo, Spring Framework ve Spring Boot kullanılarak geliştirilen E-Ticaret ve Kütüphane Yönetim Sistemleri içerir. Bu projeler, modern bir teknoloji yığını kullanarak, kullanıcıların etkileşimde bulunabileceği ve işlemleri gerçekleştirebileceği platformlar sunar.

## Spring Framework Nedir?

Spring Framework, Java tabanlı uygulamaları geliştirmek için bir çerçevedir. Temel olarak, Spring, Java uygulamalarını geliştirmek için geniş bir altyapı sunar. İçerisinde IOC (Inversion of Control - Kontrolün Tersine Çevrilmesi) ve DI (Dependency Injection - Bağımlılık Enjeksiyonu) gibi temel özellikler bulunur. Ayrıca, veritabanı entegrasyonundan güvenlik yönetimine kadar birçok modülü içinde barındırır.

## Spring Boot Nedir?

Spring Boot, Spring Framework üzerine kurulmuş, standart uygulama yapılandırmalarını otomatikleştiren bir çerçevedir. Bu, geliştiricilere minimum düzeyde yapılandırma ve daha fazla üretkenlik sağlar. Özellikle, otomatik yapılandırma ve kendi kendine yeten uygulama oluşturma yetenekleriyle tanınır.

## Katmanlı Mimariler

Her iki proje de şu katmanlı mimariyi takip eder:

1. **Controller Katmanı:** HTTP isteklerini karşılayan ve iş mantığını yöneten Controller sınıflarını içerir. Bu katmanda gelen isteklere cevap verilir ve ilgili servislere yönlendirme yapılır.
2. **Service Katmanı:** İş mantığının gerçekleştirildiği Service sınıflarını içerir. Burada veritabanı işlemleri ve iş kuralları yürütülür.
3. **Repository Katmanı:** Veritabanı işlemlerini yöneten Repository sınıflarını içerir. Bu katmanda veritabanı etkileşimi gerçekleştirilir.
4. **Model Katmanı:** Veritabanı tablolarını temsil eden Model sınıflarını içerir. Bu sınıflar veritabanı tablolarını ve ilişkilerini temsil eder.


## Teknolojiler

Her iki projede aşağıdaki teknolojiler kullanılmıştır:

- Spring Framework
- Spring Boot
- Spring MVC
- Spring Data JPA
- Veritabanı (Örneğin: PostgreSQL, MySQL, H2 gibi)

## Nasıl Çalıştırılır

Her bir projeyi yerel makinenizde çalıştırmak için aşağıdaki adımları izleyebilirsiniz:

1. Her bir proje dizinine gidin (örneğin, `Ecommerce` veya `LibraryManagementSystem`).
2. Projeyi yerel ortamınıza klonlayın: `git clone https://github.com/KULLANICI_ADI/PROJE_AD`.
3. Gerekli bağımlılıkları yüklemek için `mvn install` veya `./gradlew build` komutunu çalıştırın.
4. Uygulamayı başlatmak için `mvn spring-boot:run` veya `./gradlew bootRun` komutunu çalıştırın.
5. Tarayıcınızda `http://localhost:PORT` adresine giderek uygulamayı görüntüleyebilirsiniz.

...

Bu README dosyası, projenin genel bir açıklamasını sunmak için oluşturulmuştur. Proje dizinleri içinde daha detaylı README dosyaları bulunabilir.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# E-Commerce and Library Management Systems with Spring Framework and Spring Boot

This repository contains E-Commerce and Library Management Systems developed using Spring Framework and Spring Boot. These projects offer platforms where users can interact and perform various operations using a modern technology stack.

## What is Spring Framework?

Spring Framework is a framework used to develop Java-based applications. Essentially, Spring offers a comprehensive infrastructure for developing Java applications. It includes fundamental features like IOC (Inversion of Control) and DI (Dependency Injection). Moreover, it encompasses various modules, ranging from database integration to security management.

## What is Spring Boot?

Spring Boot is a framework built on top of the Spring Framework, automating standard application configurations. This enables developers to have minimal configuration and enhanced productivity. It is notably recognized for its automatic configuration and self-contained application building capabilities.

## Layered Architectures

Both projects follow the following layered architecture:

1. **Controller Layer:** Includes Controller classes that handle HTTP requests and manage the business logic. Incoming requests are processed here and directed to relevant services.
2. **Service Layer:** Consists of Service classes that execute the business logic. This layer performs database operations and business rules.
3. **Repository Layer:** Contains Repository classes responsible for managing database operations. Database interactions are performed in this layer.
4. **Model Layer:** Comprises Model classes that represent database tables. These classes represent the database tables and their relationships.

## Technologies

The following technologies are used in both projects:

- Spring Framework
- Spring Boot
- Spring MVC
- Spring Data JPA
- Database (e.g., PostgreSQL, MySQL, H2)

## How to Run

You can run each project on your local machine by following these steps:

1. Navigate to each project directory (e.g., `Ecommerce` or `LibraryManagementSystem`).
2. Clone the project to your local environment: `git clone https://github.com/USERNAME/PROJECT_NAME`.
3. Install the necessary dependencies by running `mvn install` or `./gradlew build`.
4. Start the application by executing `mvn spring-boot:run` or `./gradlew bootRun`.
5. Access the application by visiting `http://localhost:PORT` in your browser.

...

This README file is created to provide a general overview of the project. More detailed README files can be found inside project directories.

