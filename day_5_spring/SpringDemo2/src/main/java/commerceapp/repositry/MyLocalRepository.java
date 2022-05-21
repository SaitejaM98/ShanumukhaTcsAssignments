package commerceapp.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import commerceapp.Bean.Customer;

@Repository
public interface MyLocalRepository extends JpaRepository<Customer,Long> {

}
