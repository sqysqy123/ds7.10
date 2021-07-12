package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

//使用单例模式，把客户初始化了
public class CustomerData {
    private static CustomerData ourInstance = new CustomerData();
    private List<Customer> customerList;

    public static CustomerData getInstance() {
        return ourInstance;
    }

    private CustomerData() {
        //在构造中 初始化数据
        customerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            //每循环一次，诞生一个customer对象，放入到集合当中
            Customer customer = new Customer();
            customer.setAccount("5201314"+i);
            customer.setCname("花仙子" + i + "号");
            customer.setPassword("123");
            customer.setMoney(10000);
            customer.setPhoneNum("112233" + i);
            customerList.add(customer);

        }

    }
    public List<Customer> getCustomerList() {
        return customerList;
    }
    public void setGetCustomerList(List<Customer> customerList){
        this.customerList = customerList;
        }
      }







