package cn.yinguowei.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author Yin Guo Wei 2019/1/27
 */
@Slf4j
@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveOrUpdate(User user) {
        log.debug("UserService.saveOrUpdate, user : {}", user);
        return userRepository.save(user);
    }

    @Cacheable("users")
    @Transactional(readOnly = true)
    public List<User> findAll() {
        log.debug("UserService.findAll");
        return userRepository.findAll();
    }

    @Cacheable(value = "userById", key = "#id")
    @Transactional(readOnly = true)
    public User findOne(Long id) {
        log.debug("UserService.findOne, id : {}", id);
        return userRepository.findOne(id);
    }

    public void delete(Long id) {
        log.debug("UserService.delete, id : {}", id);
        userRepository.delete(id);
    }
}

