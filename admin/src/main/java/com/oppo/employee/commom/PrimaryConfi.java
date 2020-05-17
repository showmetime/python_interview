package com.oppo.employee.commom;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "entityManagerFactoryPrimary",
//        transactionManagerRef = "transactionManagerPrimary",
//        basePackages = {"com.oppo.employee.service"})
//        //这个扫描的是他妈的接口
//
//public class PrimaryConfi {
//    @Autowired
//    @Qualifier("mysqlDataSource")
//    private DataSource primaryDataSource;
//
//    @Primary
//    @Bean(name = "entityManagerPrimary")
//    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
//        return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
//    }
//
//    @Primary
//    @Bean(name = "entityManagerFactoryPrimary")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary(EntityManagerFactoryBuilder builder) {
//        return builder
//                .dataSource(primaryDataSource)
//                .properties(getVendorProperties())
//                .packages("com.oppo.employee.pojo")         //设置实体类所在位置
//                .persistenceUnit("primaryPersistenceUnit")
//                .build();
//}
//
//    private Map getVendorProperties() {
//        HashMap<String, Object> properties = new HashMap<>();
//        properties.put("hibernate.dialect",
//                "postgresql");
//        properties.put("hibernate.ddl-auto",
//                "create");
//        properties.put("hibernate.physical_naming_strategy",
//                "org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy");
//        properties.put("hibernate.implicit_naming_strategy",
//                "org.springframework.boot.orm.jpa.hibernate.SpringImplicitNamingStrategy");
//        return properties;
//    }
//
//    @Autowired
//    private Environment env;
//
//    @Primary
//    @Bean(name = "transactionManagerPrimary")
//    public PlatformTransactionManager transactionManagerPrimary(EntityManagerFactoryBuilder builder) {
//        return new JpaTransactionManager(entityManagerFactoryPrimary(builder).getObject());
//   }
//}
