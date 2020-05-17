app.service("employeeService",function ($http) {
    this.loadAllEmployee=()=>{
        alert("到service了");
        return $http.get("/employee/getAllEmployees")
    }

    this.findPage=(page,rows)=>{
        return $http.get("/employee/getAllEmployees?page=page+"+"rows="+rows);
    }
})