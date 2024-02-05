package ma.formation.ioc.dao;

import ma.formation.ioc.service.model.Article;
import java.util.List;
public interface IDao {
    List<Article> getAll();
    void save(Article article);
    void deleteById(Long id);
    Article findById(Long id);
}
