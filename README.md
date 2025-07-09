# Spring Boot Form Binding

Dự án này là một ví dụ đơn giản về **Form Binding** trong Spring Boot sử dụng Thymeleaf

## Mục tiêu

- Tạo form nhập thông tin người dùng: Họ tên, Email, Giới tính, Quốc tịch
- Sử dụng `@ModelAttribute` để nhận dữ liệu từ form
- Hiển thị lại thông tin đã nhập ra giao diện
- Ứng dụng kỹ thuật **Form Binding với Thymeleaf**

## Công nghệ sử dụng

- Java 21
- Spring Boot
- Thymeleaf
- Maven
- VS Code

## Cấu trúc chính

| File | Vai trò |
|------|---------|
| `User.java` | Model để bind dữ liệu |
| `UserController.java` | Xử lý hiển thị và submit form |
| `form-register-page.html` | Form HTML với `th:object` |
| `result-page.html` | Trang hiển thị thông tin người dùng |

## Cách chạy

git clone https://github.com/nguyenanhthangdev/springboot-form-binding.git
cd springboot-form-binding
mvn spring-boot:run
