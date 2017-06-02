package ua.com.owu.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.owu.entity.Blog;

/**
 * Created by blackhaski on 24.05.17.
 */
public interface BlogDAO extends JpaRepository<Blog,Integer>{
}
