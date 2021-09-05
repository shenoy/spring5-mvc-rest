package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.VendorDTO;
import guru.springfamework.domain.Vendor;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T15:38:01+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class VendorMapperImpl implements VendorMapper {

    @Override
    public VendorDTO vendorToVendorDTO(Vendor vendor) {
        if ( vendor == null ) {
            return null;
        }

        VendorDTO vendorDTO = new VendorDTO();

        vendorDTO.setName( vendor.getName() );

        return vendorDTO;
    }

    @Override
    public Vendor vendorDTOtoVendor(VendorDTO vendorDTO) {
        if ( vendorDTO == null ) {
            return null;
        }

        Vendor vendor = new Vendor();

        vendor.setName( vendorDTO.getName() );

        return vendor;
    }
}
