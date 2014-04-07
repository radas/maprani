package cz.kavan.radek.maprani.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cz.kavan.radek.maprani.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
