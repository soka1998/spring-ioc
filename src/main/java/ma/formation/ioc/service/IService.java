package ma.formation.ioc.service;

import ma.formation.ioc.service.model.Article;
import java.util.List;

public interface IService {
    List<Article> getAll();
    void save(Article article);
    void deleteById(Long id);
    Article findById(Long id);
}
