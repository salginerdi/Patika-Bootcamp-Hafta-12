# Kütüphane Yönetim Sistemi

Bu proje, Spring Boot, Maven, ve katmanlı mimari kullanılarak geliştirilmiş bir Kütüphane Yönetim Sistemi'dir. Projede, Author, Publisher, Category, Book ve BookBorrowing gibi varlıkların yönetimi sağlanmaktadır. Ayrıca anotasyonlar ve request-response yapısı da dahil edilmiştir.

## Özellikler

- Author: Yazarların eklenmesi, güncellenmesi, listelenmesi ve silinmesi
- Publisher: Yayınevlerinin eklenmesi, güncellenmesi, listelenmesi ve silinmesi
- Category: Kategorilerin eklenmesi, güncellenmesi, listelenmesi ve silinmesi
- Book: Kitapların eklenmesi, güncellenmesi, listelenmesi ve silinmesi
- BookBorrowing: Kitap ödünç alma işlemlerinin yönetimi

## Kullanılan Teknolojiler ve Frameworkler

- Katmanlı Mimari Yapısı
- Spring Boot
- Maven
- Java
- Bean (Spring Framework)

## Nasıl Çalıştırılır?

Projeyi çalıştırmak için aşağıdaki adımları takip edebilirsiniz:

1. Repoyu bilgisayarınıza klonlayın.
2. Proje dizinine gidin ve gerekli bağımlılıkları yüklemek için `mvn install` komutunu çalıştırın.
3. Veritabanı yapılandırmasını ve diğer konfigürasyonları uygun şekilde ayarlayın.
4. Projeyi çalıştırmak için IDE'nizde veya terminalde `mvn spring-boot:run` komutunu kullanın.

## Veritabanı ve API Yönetimi

Veritabanı olarak PostgreSQL kullanılmıştır. API yönetimi ve testi için Postman kullanılabilir.

## Katkıda Bulunma

Eğer projeye katkıda bulunmak isterseniz, aşağıdaki adımları izleyebilirsiniz:

1. Fork'layın (https://github.com/kullaniciadi/Library-Management-System/fork)
2. Yeni bir branch oluşturun (`git checkout -b feature/YeniÖzellik`)
3. Değişikliklerinizi commit edin (`git commit -am 'Yeni özellik eklendi'`)
4. Branch'inize push yapın (`git push origin feature/YeniÖzellik`)
5. Pull request oluşturun

-------------------------------------------------------------------------------------------------------------------------------------

# Library Management System

This project is a Library Management System developed using Spring Boot, Maven, and a layered architecture. It manages entities such as Author, Publisher, Category, Book, and BookBorrowing. Additionally, it incorporates annotations and a request-response structure.

## Features

- Author: Adding, updating, listing, and deleting authors
- Publisher: Adding, updating, listing, and deleting publishers
- Category: Adding, updating, listing, and deleting categories
- Book: Adding, updating, listing, and deleting books
- BookBorrowing: Management of book borrowing operations

## Technologies and Frameworks Used

- Layered Architecture
- Spring Boot
- Maven
- Java
- Bean (Spring Framework)

## How to Run?

You can follow the steps below to run the project:

1. Clone the repository to your computer.
2. Navigate to the project directory and run the `mvn install` command to install the necessary dependencies.
3. Configure the database and other settings accordingly.
4. Use `mvn spring-boot:run` command in your IDE or terminal to run the project.

## Database and API Management

PostgreSQL is used as the database. Postman can be used for API management and testing.

## Contributing

If you want to contribute to the project, you can follow these steps:

1. Fork the repository (https://github.com/username/Library-Management-System/fork)
2. Create a new branch (`git checkout -b feature/NewFeature`)
3. Commit your changes (`git commit -am 'Added a new feature'`)
4. Push to the branch (`git push origin feature/NewFeature`)
5. Create a Pull Request.

