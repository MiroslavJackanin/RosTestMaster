package ros.java.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
    public String customersList(Model model){

        List<EntityCustomer> customers = daoCustomer.getCustomers();
        model.addAttribute("customers", customers);

        return "customer-list";
    }

    @RequestMapping("/showAddCustomerForm")
    public String showAddCustomerForm(Model model){

        EntityCustomer customer = new EntityCustomer();
        model.addAttribute("customer", customer);

        return "add-customer-form";
    }

    @PostMapping("/processAddCustomerForm")
    public String addCustomer(@ModelAttribute("customer") EntityCustomer customer){

        daoCustomer.addCustomer(customer);

        return "redirect:/customer/list";
    }
}
