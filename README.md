#SpringBoot - Simple REST Api

## APIs

- Danh sách SV:
    - method: **GET**
    - url: `/api/students/`
    - vd: `http://localhost:8080/api/students/`

- Thêm SV:
    - method: **POST**
    - url: `/api/students/{Tên}/{MSSV}`
    - vd: `http://localhost:8080/api/students/Nguyen Chanh Tin/14110203`
    
- Update SV:
    - method: **PUT**
    - url: `/api/students/{STT}/{Tên}/{MSSV}`
    - vd: `http://localhost:8080/api/students/2/Nguyen Chanh Tin/14110205`
    
- List:
    - method: **DELETE**
    - url: `/api/students/{STT}`
    - vd: `http://localhost:8080/api/students/2`
    
## Chạy
- `git clone https://github.com/tinnguyen263/springboot_simple-rest-api.git`
- IntelliJ IDEA > Open project
- Config port and run (default: 8090)