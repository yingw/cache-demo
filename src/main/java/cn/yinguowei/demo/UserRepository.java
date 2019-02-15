package cn.yinguowei.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yin Guo Wei 2019/1/27
 */
public interface UserRepository extends JpaRepository<User, Long> {


}
