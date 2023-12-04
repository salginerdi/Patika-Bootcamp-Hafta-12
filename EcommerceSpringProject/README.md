# Spring Framework ve Spring Boot ile Katmanlı Mimariye Uygun Ecommerce Projesi

Bu proje, Spring Framework ve Spring Boot kullanılarak geliştirilmiş, katmanlı mimari yapısına uygun olan bir uygulamadır. Proje, Category, Product ve Supplier gibi temel varlık (entity) yapılarına sahip olup, istemci (request) ve sunucu (response) yapılarını destekler.

## Proje Yapısı

Projede şu ana bileşenler bulunmaktadır:

### 1. Entity (Varlık) Yapıları

- **Category**: Ürün kategorilerini temsil eden bir entity.
- **Product**: Ürünleri temsil eden bir entity.
- **Supplier**: Tedarikçileri temsil eden bir entity.

Her biri kendi alanları ve ilişkileriyle birlikte projenin veritabanı yapısını oluştururlar.

### 2. Katmanlı Mimari

Projede katmanlı mimari prensiplerine uygun olarak aşağıdaki katmanlar bulunmaktadır:

- **Controller**: HTTP isteklerini ele alan ve ilgili iş mantığı servislerine yönlendiren Spring MVC Controller sınıfları.
- **Service**: İş mantığını yürüten servis sınıfları.
- **Repository**: Veritabanı işlemlerini yürüten Spring Data JPA repository sınıfları.
- **DTO (Data Transfer Object)**: İstemci ve sunucu arasında veri transferini kolaylaştırmak için kullanılan veri transfer objeleri.
- **Exception Handling**: Hata yönetimi için özel olarak oluşturulmuş sınıflar.

### 3. Spring Boot ve Bağımlılıklar

Projede Spring Boot kullanılarak yapılandırma ve otomasyon sağlanmıştır. Ayrıca projede kullanılan temel bağımlılıklar şunlardır:

- **Spring Data JPA**: Veritabanı işlemleri için.
- **Maven/Gradle**: Proje bağımlılıklarını yönetmek için kullanılan araçlar.

## Projeyi Başlatma

Projeyi başlatmak için aşağıdaki adımları takip edebilirsiniz:

1. Proje klasörünü lokal bir dizine kopyalayın.
2. Projeyi bir Java IDE'sinde açın (IntelliJ IDEA, Eclipse vb.).
3. Proje bağımlılıklarını yüklemek için Maven/Gradle gibi proje yöneticisini kullanın.
4. Uygulamayı çalıştırın ve ilgili endpoint'leri test edin.

--------------------------------------------------------------------------------------------------------------------------------------------------------------

# E-commerce Project with Spring Framework and Spring Boot following Layered Architecture

This project is an application developed using Spring Framework and Spring Boot, following a layered architectural structure. The project includes fundamental entities such as Category, Product, and Supplier, supporting both client (request) and server (response) structures.

## Project Structure

The project consists of the following main components:

### 1. Entity Structures

- **Category**: An entity representing product categories.
- **Product**: An entity representing products.
- **Supplier**: An entity representing suppliers.

Each of these entities, along with their respective fields and relationships, form the database structure of the project.

### 2. Layered Architecture

The project adheres to the principles of a layered architecture, comprising:

- **Controller**: Spring MVC Controller classes that handle HTTP requests and direct them to relevant business logic services.
- **Service**: Service classes responsible for executing the business logic.
- **Repository**: Spring Data JPA repository classes handling database operations.
- **DTO (Data Transfer Object)**: Objects facilitating data transfer between the client and server.
- **Exception Handling**: Custom classes created for handling exceptions.

### 3. Spring Boot and Dependencies

The project utilizes Spring Boot for configuration and automation. Additionally, the fundamental dependencies used in the project include:

- **Spring Data JPA**: For database operations.
- **Maven/Gradle**: Tools used for managing project dependencies.

## Running the Project

To run the project, follow these steps:

1. Copy the project folder to a local directory.
2. Open the project in a Java IDE (IntelliJ IDEA, Eclipse, etc.).
3. Use Maven/Gradle or similar project management tools to install project dependencies.
4. Run the application and test the relevant endpoints.


