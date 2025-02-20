package com.lekimthanh.taoxanh.repository;

import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lekimthanh.taoxanh.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void deleteById(Long id);

    Optional<User> findByEmail(String email); // chỉ tìm 1 user theo email

    Optional<User> findById(Long id); // trả về Optional tránh lỗi NullPointException
}
