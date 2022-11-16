package kodlama.io.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	void addToList(Language language);
	void deleteToList( int id);
	 void updateToList(int id, String name);
	 Language getById(int id);

}
