package com.sarac.repository;

import com.sarac.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Integer> {

    //Display all region in canada
    List<Region> findByCountry(String country);
    List<Region>getByCountry(String country);

    //Display all region with country name includes 'United'
    List<Region>findByCountryContaining(String country);

    //Display all region with country name includes 'United' in order (region)
    List<Region>findByCountryContainsOrderByRegionDesc(String contry);

    //Display top 2 regions in USA
    List<Region>findTopByCountry(String country);//first country
    List<Region>findTop2ByCountry(String country);//top 2 countries
    List<Region>findTopByCountryContainsOrderByRegion(String country);

}
