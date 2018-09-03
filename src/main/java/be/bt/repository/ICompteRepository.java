package be.bt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.bt.domain.Compte;

public interface ICompteRepository extends JpaRepository<Compte,String>{

}
