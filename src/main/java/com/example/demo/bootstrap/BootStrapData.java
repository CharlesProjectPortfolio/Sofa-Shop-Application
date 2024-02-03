package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.demo.service.InhousePartService;
import com.example.demo.service.InhousePartServiceImpl;
import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // variable to hold the number of parts in partRepository
        long partInv = partRepository.count();
        // If partInv is empty add the sample dataset of parts
        if (partInv == 0) {
            OutsourcedPart o= new OutsourcedPart(); //create object for outsourced parts
            // Create an outsourced part
            o.setCompanyName("Weston Furniture Store");
            o.setName("cushions");
            o.setId(100L);
            o.setInv(10);
            o.setPrice(50.0);
            o.setMinInv(5);
            o.setMaxInv(20);
            outsourcedPartRepository.save(o);
            // Create an outsourced part
            o.setCompanyName("Liam's Furniture Store");
            o.setName("pair of arms");
            o.setInv(10);
            o.setPrice(50.0);
            o.setId(100L);
            o.setMinInv(5);
            o.setMaxInv(20);
            outsourcedPartRepository.save(o);
            // Create a variable for OutsourcedPart and a list of outsourced parts
            OutsourcedPart thePart=null;
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            // for loop to assign outsourced part variable with the part in the list that has a matching name
            for(OutsourcedPart part:outsourcedParts){
                if(part.getName().equals("cushions"))thePart=part;
                if(part.getName().equals("pair of arms"))thePart=part;
            }
            InhousePart i = new InhousePart(); // Create the object InhousePart
            // Create the first inhouse part part
            i.setName("legs");
            i.setInv(10);
            i.setPrice(25.00);
            i.setId(200L);
            i.setMinInv(5);
            i.setMaxInv(20);
            inhousePartRepository.save(i);
            // second inhouse part
            i.setName("back");
            i.setInv(10);
            i.setPrice(300);
            i.setId(300L);
            i.setMinInv(5);
            i.setMaxInv(10);
            inhousePartRepository.save(i);
            // Third inhouse part
            i.setName("motor");
            i.setInv(10);
            i.setPrice(500.00);
            i.setId(500L);
            i.setMinInv(9);
            i.setMaxInv(20);
            inhousePartRepository.save(i);
            // Create a variable for InhousePart and a list
            InhousePart theInPart = null;
            List<InhousePart> inhouseParts = (List<InhousePart>) inhousePartRepository.findAll();
            // for loop for assigning the InhousePart variable with the part that has a matching name
            for(InhousePart partI:inhouseParts) {
                if(partI.getName().equals("legs"))theInPart=partI;
                if(partI.getName().equals("back"))theInPart=partI;
                if(partI.getName().equals("motor"))theInPart=partI;

            }

            System.out.println(thePart.getCompanyName());
            /*
            List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
            */
            for(OutsourcedPart partN:outsourcedParts){
                System.out.println(partN.getName()+" "+partN.getCompanyName());
            }


        }

        // Check if productRepository is empty
        if (productRepository.count() == 0) {
            // Create new products
            Product sofa= new Product("sofa",700.0,15);
            Product recliningSofa= new Product("Reclining Sofa",800.0,50);
            Product poweredRecliningSofa= new Product("Powered Reclining Sofa",1500.0,75);
            Product loveseat= new Product("Loveseat",700.0,50);
            Product consoleLoveseat= new Product("Console Loveseat",1100.0,30);
            // Save products in productRepository
            productRepository.save(sofa);
            productRepository.save(recliningSofa);
            productRepository.save(poweredRecliningSofa);
            productRepository.save(loveseat);
            productRepository.save(consoleLoveseat);
        }



        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
