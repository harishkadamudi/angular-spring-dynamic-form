package ffg.harish.dynamicforms.service;

import ffg.harish.dynamicforms.model.Customer;
import ffg.harish.dynamicforms.repository.CustomerRepository;
import ffg.harish.dynamicforms.utils.Form;
import ffg.harish.dynamicforms.utils.FormUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Customer service
 * Created by Harish Kadamudi on 26/02/2016.
 */
@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Transactional(readOnly = true)
    public List<Customer> query(){
        return this.customerRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Customer get(Long id){
        return this.customerRepository.findOne(id);
    }

    public Customer save(Customer customer){
        return this.customerRepository.saveAndFlush(customer);
    }

    @Transactional(readOnly = true)
    public Form getForm(Boolean onlyExtraFields){
        if(onlyExtraFields == null){
            onlyExtraFields = false;
        }
        return FormUtils.describe(Customer.class,onlyExtraFields);
    }
}
