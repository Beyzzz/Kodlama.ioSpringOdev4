package kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageServis {
	List<Language> getAll();
	void addToList(Language language) throws Exception;
	void deleteToList( int id) throws Exception;
	void updateToList(int id, String name);
	Language getById(int id);

}
