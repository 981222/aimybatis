package com.huang.test;

import com.huang.entity.Account;
import com.huang.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取实现接口的代理对象
        AccountRepository accountRepository = sqlSession.getMapper(AccountRepository.class);
//        添加对象
//        accountRepository.save(new Account(2L,"李四", "456", 18));
//        查询全部
//        List<Account> list = accountRepository.findAll();
//        for (Account account : list) {
//            System.out.println(account);
//        }
//        查询特定对象
//        Account account = accountRepository.findById(3L);
//        System.out.println(account);
//        修改对象
//        int count = accountRepository.update(new Account(1L, "王五", "981222", 21));
//        System.out.println(count);
//        删除对象
//        accountRepository.deleteById(3L);
        sqlSession.commit();
        sqlSession.close();
    }
}
