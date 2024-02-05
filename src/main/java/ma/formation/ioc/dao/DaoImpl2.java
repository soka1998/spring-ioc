package ma.formation.ioc.dao;
import ma.formation.ioc.service.model.Article;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Qualifier("doa2")
public class DaoImpl2 implements IDao {
    private static final List<Article> repository = List.of(
            new Article(1L, "DESCRIPTION_1", 100d, 3d),
            new Article(2L, "DESCRIPTION_2", 300d, 11d),
            new Article(3L, "DESCRIPTION_3", 15000d, 33d),
            new Article(4L, "DESCRIPTION_4", 11000d, 4d));

    @Override
    public List<Article> getAll() {
        return repository;
    }
    @Override
    public void save(Article article) {
        repository.add(article);
    }
    @Override
    public void deleteById(Long id) {
        repository.remove(repository.stream().filter(a ->
                a.getId().equals(id)).findAny().orElse(null).getId().intValue());
    }
    @Override
    public Article findById(Long id) {
        return repository.stream().filter(a -> a.getId().equals(id)).findAny().orElse(null);
    }
}