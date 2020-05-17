app.controller('employeeController',function ($scope,$controller,employeeService) {
    //继承baseController 可以引入它的分页了
    $controller("baseController",{$scope:$scope});

    $scope.loadAllEmployee=()=>{
        employeeService.loadAllEmployee().success(response=>{
            $scope.employees = response;
        })
    };

    $scope.sex = ["男","女"];

    //分页
    $scope.findPage=function(page,rows){
        employeeService.findPage(page,rows).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );
    }
    
    $scope.search=()=>{
        var start = $("#test1").val();
        var end = $("#test2").val();
        var name = $("#test3").val();
        var title = $("#test4").val();
        employeeService.search(start,end,name,title).success(
            function(response){
                $scope.list=response.rows;
                $scope.paginationConf.totalItems=response.total;//更新总记录数
            }
        );

    }


})