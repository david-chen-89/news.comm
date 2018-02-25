package news.comm.service;

import java.util.List;

import news.comm.model.Article;
import news.comm.model.Slide;

public interface DataServiceI {

	List<Slide> getHome();

	Article getArticle(int id);
}
