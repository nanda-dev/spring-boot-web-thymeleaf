package dev.cna.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.cna.dao.model.AppUser;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Long> {}
