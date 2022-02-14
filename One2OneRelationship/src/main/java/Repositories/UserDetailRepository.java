package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoo.UserDetails;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetails, Long>
{

}
