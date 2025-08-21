package org.devkiki.ecommerce.e_commerce.user;

import java.util.List;
import java.util.Optional;

public interface UserServiceInt {
    User saveUser(User user);
        Optional<User> getUserById(Long id);
        Optional<User> getUserByEmail(String email);
        List<User> getAllUsers();
        void deleteUser(Long id);
}
