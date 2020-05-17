app.controller("baseController",function ($scope) {
    //自己在重新实现一边分页好了 啊
    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 10,
        perPageOptions: [10,20,30,40,50],//这个是每页显示多少条数 这个其实可以限制
        onchange: function () {
            $scope.findByPage();
        }

    }
    $scope.selectIds=[];
    $scope.updateSelection=(event,id)=>{
        if(event.target.checked){
            $scope.selectIds.push(id);
        }else{
            var index = $scope.selectIds.indexOf(id);
            $scope.selectIds.splice(index,1);
        }
    }
})