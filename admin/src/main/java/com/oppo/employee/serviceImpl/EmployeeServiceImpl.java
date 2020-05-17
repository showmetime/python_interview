package com.oppo.employee.serviceImpl;

import com.oppo.employee.commom.PageResult;
import com.oppo.employee.dao.EmployeesRepository;
import com.oppo.employee.pojo.Employees;
import com.oppo.employee.pojo.EmployeesInfo;
import com.oppo.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeesRepository employeesRepository;
//    @Autowired
//    private EmployeesDao employeesDao;

    public List<Employees> getAllEmployees(){
        Stream<Employees> limit = employeesRepository.getNumberEmployee().stream().limit(500);
        return limit.collect(Collectors.toList());
    }
    //得到所有的Object
    @Override
    public List<EmployeesInfo> getAllEmployeesInfoObject() {
        List<Object[]> allEmployeesInfoObject = employeesRepository.getAllEmployeesInfoObject();
        List<EmployeesInfo> employeesInfos = new ArrayList<>();
        if(!CollectionUtils.isEmpty(allEmployeesInfoObject)){
            Iterator<Object[]> iterator = allEmployeesInfoObject.iterator();
            while(iterator.hasNext()){
                Object[] next = iterator.next();
                EmployeesInfo employeesInfo = new EmployeesInfo();
                employeesInfo.setFirstName((String)next[0]);
                employeesInfo.setLastName((String)next[1]);
                employeesInfo.setTitle((String)next[2]);
                employeesInfo.setSalary((int)next[3]);
                employeesInfo.setFromDate((Date)next[4]);
                employeesInfo.setBirthDate((Date)next[5]);
                employeesInfo.setDeptName((String) next[6]);
                employeesInfos.add(employeesInfo);

            }
            return  employeesInfos;
        }
        return  null;
    }

    @Override
    public PageResult getAllEmployees(int page, int rows) {
        Page<Employees> employees  = employeesRepository.findAllByFirstNameLike("",PageRequest.of(page-1,rows));
        return new PageResult(employees.getTotalElements(),employees.getContent());
    }

    @Override
    public List<EmployeesInfo> getAllEmployeesInfo() {
        return employeesRepository.getAllEmployeesInfo();
    }
}
