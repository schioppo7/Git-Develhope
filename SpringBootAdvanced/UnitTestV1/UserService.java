package co.develhope.UnitTestV1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // (1) Crea un nuovo utente
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // (2) Ottieni tutti gli utenti
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // (3) Ottieni utente per ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // (4) Aggiorna un utente
    public Optional<User> updateUser(Long id, User userDetails) {
        return userRepository.findById(id).map(user -> {
            user.setName(userDetails.getName());
            user.setSurname(userDetails.getSurname());
            user.setWorking(userDetails.isWorking());
            return userRepository.save(user);
        });
    }

    // (5) Aggiorna solo lo stato "working"
    public Optional<User> updateUserWorkingStatus(Long id, boolean working) {
        return userRepository.findById(id).map(user -> {
            user.setWorking(working);
            return userRepository.save(user);
        });
    }

    // (6) Elimina un utente
    public boolean deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            return false;
        }
        userRepository.deleteById(id);
        return true;
    }
}
