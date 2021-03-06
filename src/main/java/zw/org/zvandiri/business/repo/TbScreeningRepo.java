/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.org.zvandiri.business.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import zw.org.zvandiri.business.domain.Patient;
import zw.org.zvandiri.business.domain.TbScreening;

/**
 *
 * @author tasu
 */
public interface TbScreeningRepo extends JpaRepository<TbScreening, String> {
    
    public List<TbScreening> findByPatientOrderByDateCreatedDesc(Patient patient);

    List<TbScreening> findByActive(@Param("active")Boolean aTrue);
}
