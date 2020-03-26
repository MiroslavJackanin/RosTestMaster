package ros.java.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ros.java.spring.dao.DAOCustomer;
import ros.java.spring.entity.EntityCustomer;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class ControllerCustomer {

    @Autowired
    private DAOCustomer daoCustomer;

    @RequestMapping("/list")
    public String customerList(Model model){

        List<EntityCustomer> customers = daoCustomer.getCustomers();
        model.addAttribute("customers", customers);

        return "customer-list";
    }
}
