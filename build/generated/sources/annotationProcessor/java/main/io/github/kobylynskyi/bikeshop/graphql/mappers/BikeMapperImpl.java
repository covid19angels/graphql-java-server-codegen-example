package io.github.kobylynskyi.bikeshop.graphql.mappers;

import io.github.kobylynskyi.bikeshop.graphql.model.BikeInputTO;
import io.github.kobylynskyi.bikeshop.graphql.model.BikeTO;
import io.github.kobylynskyi.bikeshop.graphql.model.BikeTO.BikeTOBuilder;
import io.github.kobylynskyi.bikeshop.graphql.model.BikeTypeTO;
import io.github.kobylynskyi.bikeshop.model.Bike;
import io.github.kobylynskyi.bikeshop.model.BikeType;
import java.math.BigDecimal;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-28T16:27:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_252 (AdoptOpenJDK)"
)
@Component
public class BikeMapperImpl implements BikeMapper {

    @Override
    public BikeTO map(Bike from) {
        if ( from == null ) {
            return null;
        }

        BikeTOBuilder bikeTO = BikeTO.builder();

        bikeTO.year( from.getYear() );
        bikeTO.type( bikeTypeToBikeTypeTO( from.getType() ) );
        bikeTO.brand( from.getBrand() );
        bikeTO.size( from.getSize() );
        bikeTO.addedDateTime( from.getAddedDateTime() );
        bikeTO.id( from.getId() );
        if ( from.getPrice() != null ) {
            bikeTO.price( from.getPrice().toString() );
        }

        return bikeTO.build();
    }

    @Override
    public Bike mapInput(BikeInputTO from) {
        if ( from == null ) {
            return null;
        }

        Bike bike = new Bike();

        bike.setType( mapInputType( from.getType() ) );
        bike.setBrand( from.getBrand() );
        bike.setSize( from.getSize() );
        bike.setYear( from.getYear() );
        if ( from.getPrice() != null ) {
            bike.setPrice( new BigDecimal( from.getPrice() ) );
        }

        return bike;
    }

    @Override
    public BikeType mapInputType(BikeTypeTO type) {
        if ( type == null ) {
            return null;
        }

        BikeType bikeType;

        switch ( type ) {
            case ROAD: bikeType = BikeType.ROAD;
            break;
            case TOURING: bikeType = BikeType.TOURING;
            break;
            case TRIAL: bikeType = BikeType.TRIAL;
            break;
            case TRACK: bikeType = BikeType.TRACK;
            break;
            case MOUNTAIN: bikeType = BikeType.MOUNTAIN;
            break;
            case HYBRID: bikeType = BikeType.HYBRID;
            break;
            case BMX: bikeType = BikeType.BMX;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + type );
        }

        return bikeType;
    }

    protected BikeTypeTO bikeTypeToBikeTypeTO(BikeType bikeType) {
        if ( bikeType == null ) {
            return null;
        }

        BikeTypeTO bikeTypeTO;

        switch ( bikeType ) {
            case ROAD: bikeTypeTO = BikeTypeTO.ROAD;
            break;
            case TOURING: bikeTypeTO = BikeTypeTO.TOURING;
            break;
            case TRIAL: bikeTypeTO = BikeTypeTO.TRIAL;
            break;
            case TRACK: bikeTypeTO = BikeTypeTO.TRACK;
            break;
            case MOUNTAIN: bikeTypeTO = BikeTypeTO.MOUNTAIN;
            break;
            case HYBRID: bikeTypeTO = BikeTypeTO.HYBRID;
            break;
            case BMX: bikeTypeTO = BikeTypeTO.BMX;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + bikeType );
        }

        return bikeTypeTO;
    }
}
