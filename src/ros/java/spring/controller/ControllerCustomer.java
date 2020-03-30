package ros.java.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ros.java.spring.entity.EntityCustomer;
import ros.java.spring.service.ServiceCustomer;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class ControllerCustomer {

    @Autowired
    private ServiceCustomer serviceCustomer;

    @RequestMapping("/list")
    public String customersList(Model model){

        List<EntityCustomer> customers = serviceCustomer.getCustomers();
        model.addAttribute("customers", customers);

        return "customer-list";
    }

    @RequestMapping("/showAddCustomerForm")
    public String showAddCustomerForm(Model model){

        EntityCustomer customer = new EntityCustomer();
        model.addAttribute("customer", customer);

        //return "add-customer-form";
        return "merge-index";
    }

    @PostMapping("/processAddCustomerForm")
    public String addCustomer(@ModelAttribute("customer") EntityCustomer customer){

        if (customer.getCustomerPassword().equals(customer.getCustomerCheckPassword())){
            serviceCustomer.addCustomer(customer);
            return "redirect:/customer/list";
        }else{
            //return "add-customer-form";
            return "merge-index";
        }
    }

    @RequestMapping("/showUpdateCustomerForm")
    public String showUpdateCustomerForm(@RequestParam("customerId") int Id, Model model){

        EntityCustomer customer = serviceCustomer.getCustomer(Id);

        model.addAttribute("customer", customer);

        return "add-customer-form";
    }

    @RequestMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int Id){

        serviceCustomer.deleteCustomer(Id);

        return "redirect:/customer/list";
    }
}
