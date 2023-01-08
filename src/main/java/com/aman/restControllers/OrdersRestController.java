package com.aman.restControllers;

import com.aman.customRepos.repos.CustomFooDAO;
import com.aman.sharedDAO.repos.FooDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class OrdersRestController {


    @Autowired
    CustomFooDAO customFooDAO;

    @Autowired
    FooDAO fooDAO;
}