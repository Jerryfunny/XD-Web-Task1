# XD-Web-Task1
这是一个文档在线管理系统的简单Web应用，也是我们Web安全课程实践任务1

# 文档在线管理系统


## 简介
文档在线管理系统支持用户注册/登录、文档上传/预览/下载、分类与管理员审核。


## 技术栈
- 前端：Vue3 + Vite
- 后端：Spring Boot + Spring Data JPA
- 数据库：MySQL
- 反向代理：Nginx（HTTPS）


## 快速运行
1. 克隆仓库
2. 后端：在 `backend` 目录下运行 `mvn spring-boot:run`（配置好 application.properties）
3. 前端：在 `frontend` 目录下运行 `npm install` 然后 `npm run dev`
4. 访问：前端默认 http://localhost:5173，后端 http://localhost:8080


## 注意
- 请先创建 MySQL 数据库 `docdb` 并修改 `application.properties` 的用户名和密码
- 文件上传目录默认 `./uploads`，需要保证该目录可写


## 组员分工
- XXX：前端
- YYY：后端
- ZZZ：数据库与部署


## 演示视频
- 演示脚本见 docs/demo_script.md
