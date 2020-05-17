package com.oppo.test;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        //配置类，通过连接zookeeper连接hbase，后面跟主机名 不要跟ip地址 自己配置windows映射关系
        Configuration configuration = new Configuration();
        configuration.set("hbase.zookeeper.quorum","master");

            //连接hbase
        try {
            Connection connection = ConnectionFactory.createConnection(configuration);
            Table student = connection.getTable(TableName.valueOf("student"));
            // 先插入一条数据看下是什么鬼
            //向t01表中添加一条数据 这个put的001就是指定的行数
            Put put=new Put(Bytes.toBytes("001"));
            put.addColumn(Bytes.toBytes("cf01"),Bytes.toBytes("age"),Bytes.toBytes("100"));
            student.put(put);
            // 查询t01表中的所有行数据
            Scan scan = new Scan();
            ResultScanner scanner = student.getScanner(scan);
            //这里得到表中的所有数据
            Result result = null;
            while((result = scanner.next())!=null){
                // 注意 这里scanner的迭代就变为Result了
                List<Cell> cells = result.listCells();
                //将每条数据存到Cell对象里
                for (Cell cell : cells) {
                    System.out.println(new String(CellUtil.cloneFamily(cell)) +
                    new String(CellUtil.cloneQualifier(cell)) +
                    new String(CellUtil.cloneValue(cell)));
                }
            }
            //得到一行数据或一条数据
            Get get=new Get("001".getBytes());
            get.addColumn("cf01".getBytes(),"name".getBytes());
            Result result1=student.get(get);//
            List<Cell> cells = result1.listCells();
            for (Cell c:cells) {
                System.out.println(new String(CellUtil.cloneFamily(c))+new String(CellUtil.cloneQualifier(c))+new String(CellUtil.cloneValue(c)));
            }
            //插入1000条数据
            List<Put> list = new ArrayList<Put>();
            for(int i =0;i<1000;i++){
                Put put1 = new Put(Bytes.toBytes("00"+i));
                put1.addColumn("cfo1".getBytes(),"name".getBytes(),("name_"+i).getBytes());
                list.add(put1);
            }
            student.put(list);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
