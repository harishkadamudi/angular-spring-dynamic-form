package ffg.harish.dynamicforms.rest;

import ffg.harish.dynamicforms.service.CustomerService;
import ffg.harish.dynamicforms.model.Customer;
import ffg.harish.dynamicforms.utils.Form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Customer api resource
 * Created by Harish Kadamudi on 25/02/2016.
 */
@RestController
@RequestMapping(path = "/api/customers")
public class CustomerResource {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(path = "",method = RequestMethod.GET)
    public List<Customer> query(){
        return this.customerService.query();
    }

    @RequestMapping(path = "/{id}",method = RequestMethod.GET)
    public Customer get(@PathVariable Long id){
        return this.customerService.get(id);
    }

    @RequestMapping(path = "",method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer){
        return this.customerService.save(customer);
    }

    @RequestMapping(path = "",method = RequestMethod.PUT)
    public Customer update(@RequestBody Customer customer){
        return this.customerService.save(customer);
    }

    @RequestMapping(path = "/form",method = RequestMethod.GET)
    public Form getForm(@RequestParam(name = "onlyExtraFields",required = false) Boolean onlyExtraFields){
        return customerService.getForm(onlyExtraFields);
    }
}
