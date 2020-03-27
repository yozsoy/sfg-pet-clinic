package guru.springframework.sfgpetclinic.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Ali");
        owner1.setLastName("Yagmur");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Guner");
        owner2.setLastName("Velioglu");

        ownerService.save(owner2);

        System.out.println("Owners Loaded....");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Vets Loaded....");
    }
}
